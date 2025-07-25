import java.io.*;

/**
 * ReadTxtFile
 * ---------------
 * 此程式會提示使用者輸入檔案名稱（含路徑），
 * 並將該文字檔案的所有內容逐字元讀取並輸出到螢幕上。
 *
 * 步驟：
 * 1. 由使用者輸入檔案名稱。
 * 2. 使用 FileReader 開啟檔案。
 * 3. 逐字元讀取檔案內容並輸出。
 * 4. 關閉檔案。
 */
public class ReadTxtFile {

  public static void main(String args[]) throws IOException {

    System.out.println("要讀取的檔案名稱 (路徑)");
    System.out.print("→");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();           // 取得檔名字串
    FileReader fr = new FileReader(str);  // 建立 FileReader 物件

    System.out.println("\n以下是文字檔 " + str + " 的內容：");
    int ch;
    while ((ch=fr.read()) != -1)    // 在讀到 -1 之前, 持續讀取
      System.out.print((char)ch);   // 直接將讀到的文字輸出

    fr.close();
  }
}
