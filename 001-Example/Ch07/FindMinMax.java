public class FindMinMax {

  public static void main(String[] argv) {
    int[] temp = {21,18,21,23,25,25,24,22,22,16}; // �ū�
    int min = temp[0]; // ���N�̧C�ū׳]�����@�Ӥ���
    int max = temp[0]; // ���N�̰��ū׳]�����@�Ӥ���

    for(int i : temp) { // �@�@����C�Ӥ�����
      if(i < min){
        min = i; // ��s�̧C�ū�
      }
      if(i > max) {
        max = i; // ��s�̰��ū�
      }
    }

    System.out.println("���x�ثe�̧C���ū׬O�G" + min + "��");
    System.out.println("���x�ثe�̰����ū׬O�G" + max + "��");
  }
}
