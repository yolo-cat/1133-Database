public class ArrayAverage {
  public static void main(String[] argv) {
    double[] students; // �ŧi�}�C
    students = new double[5]; // �t�m�}�C

    students[0] = 70; // ������1�ӫO�޽c�����e
    students[1] = 65; // ������2�ӫO�޽c�����e
    students[2] = 90; // ������3�ӫO�޽c�����e
    students[3] = 85; // ������4�ӫO�޽c�����e
    students[4] = 95; // ������5�ӫO�޽c�����e

    double sum = 0;
    for(int i = 0;i < students.length;i++) {
      sum += students[i]; // �[�`
    }

    double average =  sum / students.length; // �p�⥭��

    System.out.println("�������Z�G" + average);
  }
}
