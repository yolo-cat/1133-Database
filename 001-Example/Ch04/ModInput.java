import java.util.*;

public class ModInput {
  public static void main(String[] argv) {
    int apple, people=7, q, r;

    System.out.print(people+"�H��ī�G, �n���X��ī�G�H");
    Scanner sc = new Scanner(System.in);   // �� System.in ���o��J
    apple = sc.nextInt();   // �ѿ�J�ݨ��o�@�Ӿ��,
                            // �ë��w�� apple
    q = apple / people;  // ���Ӽ�
    r = apple % people;  // ���l��

    System.out.println(people+"�H��"+apple+"��ī�G,");
    System.out.println("�C�H��" + q + "��, �ٳ�" + r + "��");
  }
}
