public class AnonymousDemo  {

  public static void main(String[] args) {
    final int a= 10;

    (new Object() {  // �ΦW���O
       int b =10000;  // �ΦW���O������
       public void show() {  // �ΦW���O����k
         System.out.println ("�ΦW���O�G");
         System.out.println ("this  ->b= " +b);
         System.out.println ("main()->a= " +a);
       }
     }).show();      // ���ͰΦW���O�����Y�I�s�� show() ��k
  }
}
