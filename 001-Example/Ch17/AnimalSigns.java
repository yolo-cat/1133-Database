import java.util.*;

public class AnimalSigns {

  public static void main(String args[]) {

    char[] animal={'��','��','�K','�s','�D','�U','��','��','��'};
    ArrayList<Character> Twelve = new ArrayList<>();
    for (int i=0;i<animal.length;i++)   // �N�r���}�C�����e�[�춰�X
      Twelve.add(animal[i]);

    System.out.println("���X���j�p�� " + Twelve.size());
    System.out.println("���X���e���G" + Twelve); // �C�X�Ҧ�����

    Twelve.add(1,'��');  // ���J 3 �Ӥ���
    Twelve.add(6,'��');
    Twelve.add(7,'��');

    System.out.println("\n���X���j�p�� " + Twelve.size());
    System.out.print("���X���e���G");       // �C�X�Ҧ�����
    for (int i=0;i<Twelve.size();i++)       // �̧ǦC�X�Ҧ�����
      System.out.print(Twelve.get(i) + " ");
  }
}
