class Test {
  void showMultipleString(String[] strs) {
    for(String s : strs) {
      System.out.println(s);
    }
  }
}

public class ShowMultiStr {

  public static void main(String[] argv){
    Test a = new Test();
      String[] strs = { "�Ĥ@��T��",
      "�ĤG��T��",
      "�ĤT��T��"}; // �ŧi�}�C�H�K�@���Ѽ�

    a.showMultipleString(strs);
  }
}