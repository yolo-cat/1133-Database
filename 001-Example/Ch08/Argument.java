public class Argument {
  public static void main(String[] argv){
    Argument a = new Argument(); // �إߴ��ժ���
    int i = 20;

    System.out.println("�I�s��k�e  i = " + i);
    a.changePara(i);   // �ǤJ i
    System.out.println("�I�s��k��  i = " + i);
  }

  void changePara(int x) {       // �|�ק�ѼƭȪ���k
    System.out.println("...��k�Ѽ� x = "+ x);
    System.out.println("...�ק襤");
    x ++;   // ��ﱵ���쪺�Ѽƭ�
    System.out.println("...�{�b�Ѽ� x = "+ x);
  }
}