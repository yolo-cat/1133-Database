import java.io.*;

public class CheckID {
        
  public static void main(String[] argv) throws IOException {
    BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

    String str;   // �O���ϥΪ̿�J���
    boolean isID; // �ϥΪ̿�J���榡�O�_���T
    do {
      isID = true;
      System.out.print("�п�J�����Ҧr���G");
      str = br.readLine(); // Ū���ϥΪ̿�J���

      if(!str.matches("[a-zA-Z]\\d{9}")) { // �����T
        System.out.println(
                "�����Ҧr�����ӬO1�ӭ^��r������9�ӼƦr�I");
        isID = false;
      }
    } while (!isID);

    int[] letterNums = {10,11,12,13,14,15,16,
            17,34,18,19,20,21,22,
            35,23,24,25,26,27,28,
            29,32,30,31,33};

    str = str.toUpperCase();     // ���N�Ĥ@�ӭ^��r���ର�j�g
    char letter = str.charAt(0); // ���X�Ĥ@�Ӧr��
    // �N�Ĥ@�Ӧr���d�����N���Ʀr
    str = letterNums[letter - 'A'] + str.substring(1);

    int total = str.charAt(0) - '0'; // �}�l�[�`
    for(int i = 1;i < 10;i++) {
      total += (str.charAt(i) - '0') * (10 - i); // �̧ǥ[�`
    }

    // �H10��h�[�`�Ȥ��Ӧ�ƫ���Ӧ��
    int checkNum = (10 - total % 10) % 10;

    //�p�⵲�G�M�̫�@��Ƥ��
    if(checkNum == (str.charAt(10) - '0')) {
      System.out.println("�ˮֳq�L");
    } else {
      System.out.println("�ˮֿ��~�A�нT���g");
    }
  }
}
