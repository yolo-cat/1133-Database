public class InvalidVariableName {
  public static void main(String[] argv) {
    int 3age;   // ����H�Ʀr�}�Y
    int #AGE;   // ����ϥ� "#" �r��
    int A#GE;   // ����ϥ� "#" �r��
    int while;  // ����ϥ�����r
    int true;   // ����ϥΤ��ثO�d���r���`��
    3age = 19;
    System.out.println("�A���~�֬O�G" + 3age);
  }
}
