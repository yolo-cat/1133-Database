import java.io.IOException;
import java.util.Scanner;

public class iphoneInfoSwitch {
  public static void main(String[] args) throws IOException {

    System.out.print("�п�J�Ǹ������ĥ|�X ->");
    Scanner sc = new Scanner(System.in);
    String year = sc.next();
    year = year.toUpperCase();  // ���N�r���ର�j�g

    System.out.print("�z�� iPhone �s�y�~���O�b ");

    switch (year){
      case "M": case "N":
        System.out.println("2014 �~"); 
        break;
      case "P": case "Q":
        System.out.println("2015 �~");
        break;
      case "R": case "S":
        System.out.println("2016 �~");
        break;
      case "T": case "V":
        System.out.println("2017 �~");
        break;
      case "W": case "X":
        System.out.println("2018 �~");
        break;
      case "Y": case "Z":
        System.out.println("2019 �~");
        break;
      case "C": case "D":
        System.out.println("2020 �~");
        break;
      case "F": case "G":
        System.out.println("2021 �~");
        break;
      case "H": case "J":
        System.out.println("2022 �~");
        break;
      case "K": case "L":
        System.out.println("2023 �~");
        break;
      default:
        System.out.println("�z��J���Ǹ����~");
    }
  }
}