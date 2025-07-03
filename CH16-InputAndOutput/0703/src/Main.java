import java.io.FileNotFoundException;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    LyricAnalyzer la = new LyricAnalyzer();

    try {
      List<String> lines =
          la.readLyric(
              "/Users/Guest/IdeaProjects/1133-Database/CH16-InputAndOutput/Lyric_EN.txt"
          );
      System.out.println("Number of lines: " + lines.size());

      la.writeResult("love", lines, "Result.txt");

    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + e.getMessage());
      e.printStackTrace();
    }
    System.out.println("End of program");
  }
}
