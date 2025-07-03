
public class Main {
  public static void main(String[] args) {

    // 建立 HotelFilter 物件
    HotelFilter hotelFilter = new HotelFilter();

    // 呼叫 generateHotelInCityFile 方法
    hotelFilter.generateHotelInCityFile(
        "/Users/Guest/IdeaProjects/1133-Database/CH16-InputAndOutput/hotels.csv",
        "台中市",
        "台中飯店.csv"
    );
  }
}
