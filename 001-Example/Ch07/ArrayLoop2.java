public class ArrayLoop2 {
  public static void main(String[] argv) {
    double[] students = {70, 65, 90, 85, 95};
    double sum = 0;

    for(int i = 0;i <  students.length;i++) {
      double score = students[i];
      sum += score; // �[�`
    }

    double average =  sum / students.length; // �p�⥭��
    System.out.println("�������Z�G" + average);
  }
}
