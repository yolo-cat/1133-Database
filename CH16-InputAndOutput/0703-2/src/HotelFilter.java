public class HotelFilter {

  //  傳入 Hotels.csv 檔名
  //  傳入縣市名稱
  //  傳入寫出的 csv 檔名

  public void generateHotelInCityFile(String hotelsFileName, String city, String resultFileName) {
    // 讀取 hotels.csv 檔案
    // 過濾出符合縣市名稱的飯店資料
    // 將過濾後的資料寫入 resultFileName 檔案
    try (var reader = new java.io.BufferedReader(new java.io.FileReader(hotelsFileName));
        var writer = new java.io.BufferedWriter(new java.io.FileWriter(resultFileName))) {

      String line;
      while ((line = reader.readLine()) != null) {
        if (line.contains(city)) {
          writer.write(line);
          writer.newLine();
        }
      }

//   讀取完成後，列出符合過濾要求的數量
      writer.flush();
      long count = java.nio.file.Files.lines(java.nio.file.Paths.get(resultFileName)).count();
      System.out.println("符合 " + city + " 的飯店數量: " + count);


//    讀取完成後，關閉資源
      System.out.println("完成讀取 " + hotelsFileName + " 檔案並寫入 " + resultFileName + " 檔案。");

    } catch (java.io.FileNotFoundException e) {
      System.out.println("檔案未找到: " + e.getMessage());
      e.printStackTrace();
    } catch (java.io.IOException e) {
      System.out.println("讀取或寫入檔案時發生錯誤: " + e.getMessage());
      e.printStackTrace();
    } catch (Exception e) {
      System.out.println("發生未知錯誤: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
