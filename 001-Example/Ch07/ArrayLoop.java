public class ArrayLoop {
  public static void main(String[] argv) {
    double[] students = {70, 65, 90, 85, 95};
    double sum = 0;

    for(double score : students) { // �ϥίS��for�j��
      sum += score; // �[�`
    }

    double average =  sum / students.length; // �p�⥭��
    System.out.println("�������Z�G" + average);
  }
}
