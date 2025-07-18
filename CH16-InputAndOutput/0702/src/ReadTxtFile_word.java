import java.io.*;
import java.util.regex.*;

public class ReadTxtFile_word {

  public static void main(String args[]) throws IOException {

    try {
      System.out.println("要讀取的檔案名稱");
      System.out.print("→");

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      String filename = br.readLine(); // 取得檔名字串

      // 新增：讓使用者輸入查詢關鍵字
      System.out.println("請輸入要查詢的關鍵字：");
      System.out.print("→");
      String keyword = br.readLine();

      String basePath = "";
      String fullPath = basePath + filename;

      // 新增：檔案不存在時給予提示
      File file = new File(fullPath);
      if (!file.exists()) {
        System.out.println("檔案不存在：" + fullPath);
        System.out.println("請確認檔名拼寫正確（區分大小寫）或檔案是否存在於指定路徑。");
        return;
      }

      FileReader fr = new FileReader(fullPath);  // 建立 FileReader 物件

      System.out.println("\n以下是文字檔 " + filename + " 中包含 '" + keyword + "' 的行：");

      // 自動判斷中英文，選擇正則表達式
      boolean hasChinese = keyword.matches(".*[\\u4e00-\\u9fa5].*");
      Pattern pattern;
      if (hasChinese) {
        // 中文：不加 \b
        pattern = Pattern.compile(Pattern.quote(keyword), Pattern.CASE_INSENSITIVE);
      } else {
        // 英文：加 \b，精確匹配單字
        pattern = Pattern.compile("\\b" + Pattern.quote(keyword) + "\\b", Pattern.CASE_INSENSITIVE);
      }

      BufferedReader fileReader = new BufferedReader(fr);
      String line;
      int count = 0;
      while ((line = fileReader.readLine()) != null) {
        Matcher matcher = pattern.matcher(line);
        boolean found = false;
        while (matcher.find()) {
          count++;
          found = true;
        }
        if (found) {
          System.out.println(line);
        }
      }

      System.out.println("\n關鍵字 '" + keyword + "' 在檔案中精確出現了 " + count + " 次。");

      fileReader.close();
      fr.close();

    } catch (IOException e) {
      // 捕捉檔案讀取錯誤
      System.out.println("發生錯誤：" + e.getMessage());
    }
  }
}