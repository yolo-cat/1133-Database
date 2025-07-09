import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/**
 * 旅館 (Hotel) 資料模型
 */
class Hotel {
    String region;   // 縣市
    String town;     // 鄉鎮／區

    Hotel(String region, String town) {
        this.region = region;
        this.town   = town;
    }
}

public class Main {

    /* --------------------------- 程式進入點 --------------------------- */
    public static void main(String[] args) {

        /* (1) 讀取 CSV ------------------------------------------------ */
        List<Hotel> hotels = loadHotels("src/hotels.csv");
        if (hotels.isEmpty()) return;  // 若讀檔失敗或無資料則直接結束

        /* (2) 統計 Region → Town → Count ----------------------------- */
        // 外層：Region -> 旅館總數
        Map<String, Integer> regionCount = new LinkedHashMap<>();
        // 內層：Region -> (Town -> 旅館數)
        Map<String, Map<String, Integer>> regionTownCount = new LinkedHashMap<>();

        for (Hotel h : hotels) {
            // Region 僅統計結尾為「縣」或「市」且排除「寧夏夜市」
            if (!h.region.endsWith("縣") && !h.region.endsWith("市")) continue;
            if (h.region.endsWith("寧夏夜市")) continue; // 排除「寧夏夜市」
            /* 若 Region 為空則跳過 */
            if (h.region.isEmpty()) continue;
            /* 若 Town 為空則跳過 */
            if (h.town.isEmpty()) continue;

            /* 累加 Region 總數 */
            regionCount.merge(h.region, 1, Integer::sum);

            /* 累加該 Region 底下的 Town 數 */
            regionTownCount
                .computeIfAbsent(h.region, k -> new LinkedHashMap<>())     // 取得或新建 Town Map
                .merge(h.town, 1, Integer::sum);
        }

        /* (3) 輸出結果 ------------------------------------------------ */
        if (regionCount.isEmpty()) {
            System.out.println("查無任何符合『縣／市』條件的資料。");
            return;
        }

        System.out.println("所有縣市及其鄉鎮的旅館數量：");

        for (String region : regionTownCount.keySet()) {
            int total = regionCount.getOrDefault(region, 0);
            System.out.printf("- %s：%d%n", region, total);

            Map<String, Integer> townMap = regionTownCount.get(region);
            for (Map.Entry<String, Integer> entry : townMap.entrySet()) {
                System.out.printf("  |- %s：%d%n", entry.getKey(), entry.getValue());
            }
        }
    }

    /* =================================================================
     *  方法區域
     * ================================================================= */

    /**
     * 讀取 CSV 並回傳 Hotel 清單
     */
    private static List<Hotel> loadHotels(String csvFile) {
        List<Hotel> hotels = new ArrayList<>();

        try (BufferedReader br = Files.newBufferedReader(Paths.get(csvFile))) {

            /* 解析標題列取得欄位索引 */
            String headerLine = br.readLine();
            if (headerLine == null) {
                System.err.println("CSV 檔案為空，請檢查 " + csvFile);
                return hotels;
            }

            String[] headers = headerLine.split(",", -1);
            Map<String, Integer> idxMap = new HashMap<>();
            for (int i = 0; i < headers.length; i++) {
                idxMap.put(headers[i].trim().toLowerCase(), i);
            }

            Integer regionIdx = idxMap.get("region");
            Integer townIdx   = idxMap.get("town");
            if (regionIdx == null || townIdx == null) {
                System.err.println("CSV 未包含必備欄位 Region/Town，請確認欄位名稱。");
                return hotels;
            }

            /* 讀取資料列 */
            String line;
            while ((line = br.readLine()) != null) {
                String[] cols = line.split(",", -1);
                if (cols.length <= Math.max(regionIdx, townIdx)) continue; // 欄位不足跳過

                String region = cols[regionIdx].trim();
                String town   = cols[townIdx].trim();

                hotels.add(new Hotel(region, town));
            }

        } catch (IOException e) {
            System.err.println("讀取檔案失敗：" + e.getMessage());
        }

        return hotels;
    }
}
