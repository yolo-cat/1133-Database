class Utility {
  public static int min(int[] data) {
    int min = data[0];  // ���N���� 0 ���̤p��

    // �v�@�ˬd�}�C����, ���L�� min ��p����
    for(int i = 1;i < data.length;i++) {
      min = (min <= data[i]) ? min : data[i];
    }
    return min;
  }

  public static int max(int[] data) {
    int max = data[0];  // ���N���� 0 ���̤j��

    // �v�@�ˬd�}�C����, ���L�� max ��j����
    for(int i = 1;i < data.length;i++) {
      max = (max >= data[i]) ? max : data[i];
    }
    return max;
  }

}

public class MinMax {

  public static void main(String[] argv){
    int[] data = {9,10,37,3,29,44,9};

    System.out.println("�̤p�ȡG" + Utility.min(data));
    System.out.println("�̤j�ȡG" + Utility.max(data));
  }
}
