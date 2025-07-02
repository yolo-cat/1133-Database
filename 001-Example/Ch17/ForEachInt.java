import java.util.*;

public class ForEachInt {
  public static void main(String args[]) {

    // �n�� <Integer> �y�k�Х� TreeSet ���X�O�ΨӦs���ƪ���
    TreeSet<Integer> IntTS = new TreeSet<Integer>();

    for (int i=1;i<=100;i++) // �N 1 �� 100 ���Ʀr�[�춰�X��
      IntTS.add(i);

    System.out.print("1��100 �� 9 �����Ʀ��G");

    for (Integer i:IntTS)    // �� IntTS �����C�Ӥ��� i ���j��B�z
      if (i%9 == 0)          // ���� i �Y��Q 9 �㰣
        System.out.print(i + " ");
  }
}
