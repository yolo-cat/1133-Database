import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LyricAnalyzer {

  public List<String> readLyric(String fileName) throws FileNotFoundException {
    List<String> lyricLines = new ArrayList<>();

    try (FileReader fr = new FileReader(fileName);
        LineNumberReader lnr = new LineNumberReader(fr)) {
      String line = null;
      while ((line = lnr.readLine()) != null) {
        lyricLines.add(line);
        System.out.println(line);
      }
      System.out.println("before close");

    } catch (IOException e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    } finally {
      System.out.println("finally process");
    }
    return lyricLines;
  }

  public void writeResult(String keyword, List<String> lines, String fileName) {
    int index = 0;
    for (String line : lines) {
      while (line.indexOf(keyword) != -1) {
        index++;
        line = line.substring(line.indexOf(keyword) +1 );
      }
    }
    System.out.println("The keyword '" + keyword + "' appears " + index + " times in the lyrics.");
    try (FileWriter fw = new FileWriter(fileName);
         BufferedWriter bw = new BufferedWriter(fw)) {
      bw.write("The keyword '" + keyword + "' appears " + index + " times in the lyrics.");
    } catch (IOException e) {
      System.out.println("Error writing to file: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
