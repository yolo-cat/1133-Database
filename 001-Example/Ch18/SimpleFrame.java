import javax.swing.*;

public class SimpleFrame {
  public static void main(String[] args) {

    JFrame myframe = new JFrame("�[�ӫ��s");

    // �إ߫��s����
    JButton mybutton = new JButton("�T�w");

    // ���o Content Pane �å[�J���s
    myframe.getContentPane().add(mybutton);

    myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myframe.setSize(320,240);
    myframe.setVisible(true);
  }
}
