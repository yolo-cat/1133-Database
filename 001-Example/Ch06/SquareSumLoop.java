public class SquareSumLoop {
  public static void main(String args[]) {

    int sum = 0; //�x�s 1-10 ����M�֭p��

    for (int i=1;i<=10;i++) {  // �|���ư���϶������e 10 ��
      sum  += i*i;
      System.out.println("1-" + i +" ������M���G"+ sum);
    }
  }
}
