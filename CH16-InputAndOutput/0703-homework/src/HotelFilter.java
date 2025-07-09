import java.io.*;
import java.util.*;

public class HotelFilter {
    public static Map<String, Hotel> loadHotels(String csvFilePath) {
        Map<String, Hotel> hotelMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line = br.readLine(); // 讀取標題
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(",");
                if (tokens.length >= 6) {
                    String id = tokens[0];
                    String name = tokens[1];
                    String region = tokens[2];
                    String town = tokens[3];
                    String address = tokens[4];
                    String phone = tokens[5];
                    Hotel hotel = new Hotel(id, name, region, town, address, phone);
                    hotelMap.put(id, hotel);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return hotelMap;
    }

    /**
     * 根據關鍵字過濾飯店資料，並依照 Id 排序，存入新的 Map。
     * @param hotelMap 原始飯店 Map
     * @param keyword 關鍵字（比對 name、address、phone）
     * @return 依照 Id 排序且符合條件的新 Map
     */
    public static Map<String, Hotel> filterAndSortHotels(Map<String, Hotel> hotelMap, String keyword) {
        List<Hotel> filtered = new ArrayList<>();
        for (Hotel hotel : hotelMap.values()) {
            if (hotel.getId().contains(keyword) ||
                hotel.getName().contains(keyword) ||
                hotel.getRegion().contains(keyword) ||
                hotel.getTown().contains(keyword) ||
                hotel.getAddress().contains(keyword) ||
                hotel.getPhone().contains(keyword)) {
                filtered.add(hotel);
            }
        }
        // 依照 Id 排序
        filtered.sort(Comparator.comparing(Hotel::getId));
        // 存入新的 LinkedHashMap 以保留排序
        Map<String, Hotel> result = new LinkedHashMap<>();
        for (Hotel hotel : filtered) {
            result.put(hotel.getId(), hotel);
        }
        return result;
    }

    /**
     * 取得所有欄位名稱。
     * @return 欄位名稱陣列
     */
    public static String[] getFieldNames() {
        return new String[]{"id", "name", "region", "town", "address", "phone"};
    }

    /**
     * 根據指定欄位與關鍵字，對 Map 進行二次過濾。
     * @param hotelMap 原始 Map
     * @param field 欄位名稱
     * @param keyword 關鍵字
     * @return 過濾後的新 Map
     */
    public static Map<String, Hotel> filterByField(Map<String, Hotel> hotelMap, String field, String keyword) {
        List<Hotel> filtered = new ArrayList<>();
        for (Hotel hotel : hotelMap.values()) {
            String value = "";
            switch (field) {
                case "id": value = hotel.getId(); break;
                case "name": value = hotel.getName(); break;
                case "region": value = hotel.getRegion(); break;
                case "town": value = hotel.getTown(); break;
                case "address": value = hotel.getAddress(); break;
                case "phone": value = hotel.getPhone(); break;
            }
            if (value.contains(keyword)) {
                filtered.add(hotel);
            }
        }
        filtered.sort(Comparator.comparing(Hotel::getId));
        Map<String, Hotel> result = new LinkedHashMap<>();
        for (Hotel hotel : filtered) {
            result.put(hotel.getId(), hotel);
        }
        return result;
    }

    /**
     * 將符合條件的飯店資料輸出到指定 csv 檔案。
     * @param hotelMap 要輸出的 Map
     * @param outputCsvPath 輸出檔案路徑
     */
    public static void exportToCsv(Map<String, Hotel> hotelMap, String outputCsvPath) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputCsvPath))) {
            // 輸出標題
            bw.write("id,name,region,town,address,phone");
            bw.newLine();
            for (Hotel hotel : hotelMap.values()) {
                bw.write(hotel.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 根據指定欄位將資料分類。
     * @param hotelMap 原始飯店 Map
     * @param field 欄位名稱（如 region、town）
     * @return Map<分類名稱, List<Hotel>>
     */
    public static Map<String, List<Hotel>> classifyByField(Map<String, Hotel> hotelMap, String field) {
        Map<String, List<Hotel>> classified = new LinkedHashMap<>();
        for (Hotel hotel : hotelMap.values()) {
            String key = "";
            switch (field) {
                case "region": key = hotel.getRegion(); break;
                case "town": key = hotel.getTown(); break;
                case "name": key = hotel.getName(); break;
                case "id": key = hotel.getId(); break;
                case "address": key = hotel.getAddress(); break;
                case "phone": key = hotel.getPhone(); break;
            }
            classified.computeIfAbsent(key, k -> new ArrayList<>()).add(hotel);
        }
        return classified;
    }

    /**
     * 統計每個分類的數量。
     * @param classified Map<分類名稱, List<Hotel>>
     * @return Map<分類名稱, 數量>
     */
    public static Map<String, Integer> countByClassified(Map<String, List<Hotel>> classified) {
        Map<String, Integer> countMap = new LinkedHashMap<>();
        for (Map.Entry<String, List<Hotel>> entry : classified.entrySet()) {
            countMap.put(entry.getKey(), entry.getValue().size());
        }
        return countMap;
    }

    /**
     * 將分類結果列印並輸出到 csv 檔案。
     * @param classified Map<分類名稱, List<Hotel>>
     * @param outputCsvPath 輸出檔案路徑
     */
    public static void printAndExportClassified(Map<String, List<Hotel>> classified, String outputCsvPath) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputCsvPath))) {
            // 輸出標題
            bw.write("category,id,name,region,town,address,phone");
            bw.newLine();
            for (Map.Entry<String, List<Hotel>> entry : classified.entrySet()) {
                String category = entry.getKey();
                for (Hotel hotel : entry.getValue()) {
                    String line = category + "," + hotel.toString();
                    System.out.println(line);
                    bw.write(line);
                    bw.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
