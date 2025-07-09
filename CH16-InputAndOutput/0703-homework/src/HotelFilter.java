import java.io.*;
import java.util.*;

public class HotelFilter {
    public static Map<String, Hotel> loadHotels(String csvFilePath) {
        Map<String, Hotel> hotelMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line = br.readLine(); // 讀取標題
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(",");
                if (tokens.length >= 4) {
                    String id = tokens[0];
                    String name = tokens[1];
                    String address = tokens[2];
                    String phone = tokens[3];
                    Hotel hotel = new Hotel(id, name, address, phone);
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
            if (hotel.getName().contains(keyword) ||
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
        return new String[]{"id", "name", "address", "phone"};
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
            bw.write("id,name,address,phone");
            bw.newLine();
            for (Hotel hotel : hotelMap.values()) {
                bw.write(hotel.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
