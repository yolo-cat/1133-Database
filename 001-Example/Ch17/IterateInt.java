import java.util.*;

public class IterateInt {

  public static void main(String args[]) {

    // �� Integer ����إ� TreeSet ���X����
    TreeSet<Integer> IntTS = new TreeSet<>();
    for (int i=1;i<=100;i++)  // �N 1 �� 100 ���Ʀr�[�춰�X��
      IntTS.add(i);
    System.out.println("��l���X�j�p���G" + IntTS.size());

    // �إ� Iterator ����
    Iterator i=IntTS.iterator();

    while (i.hasNext())  // �u�n�٦��U�Ӥ���, �N�~��j��
      if (((Integer)i.next()).intValue()%9 != 0)
        i.remove();    // ����Q 9 �㰣������, �N�|�Q����

    System.out.println("�̫ᶰ�X�����e���G" + IntTS);
  }
}
