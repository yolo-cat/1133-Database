public class MyRes implements AutoCloseable {
  String name; // �x�s�W��

  MyRes(String str) {name = str;} // �غc��k

  public void close() { // AutoCloseable ��������k
    System.out.println("���b�����귽-"+name);
  }

  public static void main(String args[]) {

    try(MyRes one=new MyRes("1");  // �إ� 2 �Ӹ귽����
        MyRes two=new MyRes("2") ){
       System.out.println("...try...");
    }
    finally{
      System.out.println("...finally...");
    }

  }
}
