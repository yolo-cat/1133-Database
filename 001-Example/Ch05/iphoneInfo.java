import java.io.*;
import java.util.Scanner;

public class iphoneInfo {
  public static void main(String[] args) throws IOException {

    System.out.print("�п�J�Ǹ������ĥ|�X ->");
    Scanner sc = new Scanner(System.in);
    String year = sc.next();    
    year = year.toUpperCase();  // ���N�r���ର�j�g
    
    System.out.print("�z�� iPhone �s�y�~���O�b ");

    if (year.equals("M") || year.equals("N"))
      System.out.println("2014 �~");
    else if (year.equals("P") || year.equals("Q"))
      System.out.println("2015 �~");
    else if (year.equals("R") || year.equals("S"))
      System.out.println("2016 �~");
    else if (year.equals("T") || year.equals("V"))
      System.out.println("2017 �~");
    else if (year.equals("W") || year.equals("X"))
      System.out.println("2018 �~");
    else if (year.equals("Y") || year.equals("Z"))
      System.out.println("2019 �~");
    else if (year.equals("C") || year.equals("D"))
      System.out.println("2020 �~");
    else if (year.equals("F") || year.equals("G"))
      System.out.println("2021 �~");
    else if (year.equals("H") || year.equals("J"))
      System.out.println("2022 �~");
    else if (year.equals("K") || year.equals("L"))
      System.out.println("2023 �~");
    else
      System.out.println("�z��J���Ǹ����~");
  }
}
