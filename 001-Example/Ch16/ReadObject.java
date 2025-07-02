import java.io.*;

public class ReadObject {

  public static void main(String args[])
                throws IOException, ClassNotFoundException {

    System.out.println("�nŪ�����ǥͦ��Z���ɦW");
    System.out.print("��");

    BufferedReader br =
      new BufferedReader(new InputStreamReader(System.in));
    String filename = br.readLine();         // ���o�ɦW�r��

    int counter=0;                    // �ΨӰO��Ū�쪺��Ƶ���
     double Esum = 0;  // �^����ƥ[�`
    double Msum = 0;  // �ƾǤ��ƥ[�`
    double Jsum = 0;  // Java ���ƥ[�`
    Student ss = new Student();
 
    System.out.println("�m�W\t�^��\t�ƾ�\tJava\t����");
    System.out.println("------------------------------------------");
 
    try (ObjectInputStream ois =                  // �إߪ����J��y����
      new ObjectInputStream(new FileInputStream(filename))){
      while (true) {
        ss = (Student) ois.readObject();
        counter++;

        Esum += ss.getE();
        Msum += ss.getM();
        Jsum += ss.getJ();

        System.out.println(ss.getN() + '\t' + ss.getE() + '\t' +
                           ss.getM() + '\t' + ss.getJ() + '\t' +
                           ss.getAvg());
      }
    }
    catch (EOFException e) {
      System.out.println("\n�w�q�ɮ� " + filename + " Ū�� " +
                         counter + " ���ǥ͸��");
      System.out.println("\n�����^�奭���G" + (Esum/counter));
      System.out.println("�����ƾǥ����G" + (Msum/counter));
      System.out.println("����Java�����G" + (Jsum/counter));
    }
  }
}