public class PartOf9x9 {

  public static void main(String args[]) {

    outloop:for (int x=1; x<=9; x++) {    // �[�W���ҦW��
      for (int y=1; y<=9; y++) {  
        if (x*y > 25) {           // �Y���n�j�� 25
          System.out.println();   // ����
          continue outloop;       // ����o�@���� outloop �j��
        }
        System.out.print( x + "*" + y + "=" + x*y + "\t");
      }
      System.out.println();
    }
  }
}

