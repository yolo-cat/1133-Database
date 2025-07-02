import java.io.*;

public class Filer {
  // �H�U��k�i�̰��浲�G, ��ܦ��\�Υ��Ѫ��T��
  static boolean go(String act, boolean isSucceed) {
    System.out.println(act + (isSucceed? " ���\" : " ����"));
    return isSucceed;
  }
  
  public static void main(String[] args) throws IOException {
    Console c = System.console();
    String s, name;
    File f, dir = new File("").getAbsoluteFile(); //���o�ثe�Ҧb
                                                      //  ��������|
    c.printf("�п�J [�ާ@]+[�ɦW], �Ҧp na.txt ��ܫإ� a.txt�C\n");
    c.printf("<n>����<m>�ا�<r>��W<d>�R��<c>�i��<u>�W�h��" + 
             "<l>�ؿ�<x>�����G\n");
    while (true) {
      s = c.readLine("> ");
      if(s.length() == 0) s = "x";  // ��J�ť�, ���P�n�����{��
      name = s.substring(1).trim();
      f = new File(dir, name);  // �H���|�ΦW�٫غc File ����
      switch(s.toLowerCase().charAt(0)) {
        case 'n':
          go("���� " + name, f.createNewFile());
          break;
        case 'm': 
          go("�ظ�Ƨ� " + name, f.mkdir());
          break;
        case 'r': 
          s = c.readLine("�п�J�s�W�١G");
          go("��W " + name, f.renameTo(new File(dir,s)));
          break;
        case 'd': 
          go("�R�� " + name, f.delete());
          break;
        case 'c': 
          if( go("�i��Ƨ� " + f, f.isDirectory()) )
            dir = f;
          break;
        case 'u': 
          f = f.getParentFile(); // ���o�W�h��Ƨ�, null ����
          if( go("�W�h��Ƨ� " + f, f != null) )
            dir = f;
          break;
        case 'l':    
          c.printf("%s ���ؿ��C��\n", dir);
          for(String t : dir.list()) 
            c.printf("%s\n", t);
          break;
        case 'x':
          c.printf("����\n");
          return; 
        default:
          c.printf("�п�J [�ާ@]+[�ɦW]�C\n");
}}}}