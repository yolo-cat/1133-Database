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
}

