import java.util.*;

public class ListLotto {

  public static void main(String args[]) {

    System.out.println("�ֳz�q���︹�w�wJava/ArrayList ��");
    System.out.println("�H�U�O�����H�����X�G");

    ArrayList<Integer> num = new ArrayList<>();
    for (int i=1;i<50;i++)     // ��l�ƶ��X������
      num.add(i);

    for(int i=1;i<=5;i++) {
      Collections.shuffle(num);       // �N���X�y�~�P�z
      System.out.println(num.subList(0, 6));
    }                        // �����X���e 6 �Ӥ������l���X
    System.out.println("�����Q�K�����o�ʶR�ΧI���m��I");
  }
}
