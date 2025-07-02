class Sorter {
  int[] data;

  void quickSort(int start,int end) {
    // �p�G�u���@�Ӥ����A������^
    if(start >= end) {
      return;
    }

    // ���o������������
    int mid = data[(start + end) / 2];

    int left = start;
    int right = end;
    while(left < right) { // �٥��۹J
      // �����ݷj�M
      while((left < end) && (data[left] < mid)) {
        left++;
      }

      // ���e�ݷj�M
      while((right > start) && (data[right] > mid)) {
        right--;
      }

      // �٥����
      if(left <= right) {
        int temp = data[left]; // �洫����
        data[left] = data[right];
        data[right] = temp;
        left++; // �����ݲ���
        right--; // ���e�ݲ���
        show();
      }
    }

    // ���j�Ƨǫe���q
    quickSort(start,right);
    quickSort(left,end);
  }

  void show() {
    for(int i:data) {
      System.out.print(i +" ");
    }
    System.out.println("");
  }

  void sort(int[] data) {
    this.data = data;
    show();
    quickSort(0,data.length - 1); // �ƧǾ�Ӱ}�C
  }
}

public class QuickSort {

  public static void main(String[] argv) {

    // argv�ǤJ�n�ƧǪ����
    int[] data = new int[argv.length];

    // �N�ǤJ������ର���
    for(int i = 0;i < data.length;i++) {
            data[i] = java.lang.Integer.parseInt(argv[i]);
    }

    // �Ƨ�
    Sorter s = new Sorter();
    s.sort(data);
  }
}