public class DeclareAndInit {
  public static void main(String[] argv) {
    // �ŧi�ë����}�C���e
    double[] students = {70, 65, 90, 85, 95};
    double sum = 0;

    for(int i = 0;i < students.length;i++) {
      sum += students[i]; // �[�`
    }

    double average =  sum / students.length; // �p�⥭��

    System.out.println("�������Z�G" + average);
  }
}
