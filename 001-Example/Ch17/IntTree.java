import java.util.*;

public class IntTree {

  public static void main(String args[]) {

    // �� Integer ����إ� TreeSet ���X����
    TreeSet<Integer> IntTS = new TreeSet<>();
    for (int i=1;i<=10;i++)
      IntTS.add(i*10);
    System.out.println("���X IntTS ���j�p�� " + IntTS.size());

    // ���o�@�Ӥl���X�ò����䤺�e
    TreeSet subInt =  (TreeSet) IntTS.headSet(50);
    System.out.println("�l���X subInt ���j�p�� " + subInt.size());
    subInt.clear();    // �M�� subInt ���X���Ҧ�����

    System.out.println("�����l���X��, ���X IntTS ���j�p�� "
                       + IntTS.size());
  }
}
