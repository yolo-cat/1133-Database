public class BubbleSort {

  public static void main(String[] argv) {
    int[] data = {23,54,33,5,7,46,99,35}; // ���ƧǪ����
    int temp; // �Ψӥ洫�������Ȧs�ܼ�

    for(int i = 0;i < data.length - 1;i++) {
      // �@�ݶi�椸���Ӽ�-1��
      for(int j = 0;j < data.length - 1 - i;j++ ) {
        // ��i������˼Ʋ�i+1�Ӥ���
        if(data[j] > data[j + 1]) {
          temp = data[j];
          data[j] = data[j + 1];
          data[j + 1] = temp;
        }
      }

      for(int k:data) {
        System.out.print(" " + k);
      }
      System.out.println("");
    }
  }
}
