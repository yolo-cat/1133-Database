public class Factory {
  public static void main(String[] argv) {
    double fact = 1;
    int i = 5;          // �]�w�w�]�� 5
    if(argv.length > 0) // �p�G���]�w�R�O�C�Ѽ�
      i = Integer.parseInt(argv[0]); // �N�Ѽ��ഫ�� int

    System.out.print(i + "!=");  // ��X�T���}�Y
    for(;i > 0;i--)  // �p�� i!
      fact *= i;
    System.out.println(fact);    // ��X�p�⵲�G
  }
}
