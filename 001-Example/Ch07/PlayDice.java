public class PlayDice {
  public static void main(String[] argv) {
    int[] data = new int[19]; // �x�s�Y���I�ƥX�{����
    int base=0;
    for(int i=1;i<=6;i++)     // 2 �Ӱj����O�N�� 2 �ӻ�l
      for(int j=1;j<=6;j++) { // i+j �N�O�Y�X���I��
        data[i+j]++;          // �N�N���ƪ������[ 1
        base++;               //
      }

    for(int point=0;point<data.length;point++)
      if(data[point]>0)
        System.out.println("�Y�X"+ point + "�I�����v��" +
                           base+ "����" + data[point]);
  }
}

