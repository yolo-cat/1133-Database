class Test {
  void showMultipleString(String[] strs) {
    for(String s : strs) {
      System.out.println(s);
    }
  }
}

public class AnonymousArray {

  public static void main(String[] argv){
    Test a = new Test();

    a.showMultipleString(new String[] { "�Ĥ@��T��",
       "�ĤG��T��",
       "�ĤT��T��"});
  }
}