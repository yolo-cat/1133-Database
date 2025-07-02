import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TempConverter implements ActionListener {

  JFrame myframe = new JFrame("�ؤ�P���ūת��ഫ");
  // �ഫ���G��ܰ�
  JLabel result = new JLabel(" ",SwingConstants.CENTER);
  JTextField degree = new JTextField();  // ��J��
  JButton f2c = new JButton("�ؤ������");
  JButton c2f = new JButton("�����ؤ�");

  public static void main(String[] args) {
    TempConverter test = new TempConverter();
  }

  public TempConverter () {
    // �����o ContentPane ����
    Container contentPane = myframe.getContentPane();

    // �N 5 �Ӥ���[�� BorderLayout �����Ӧ�m
    contentPane.add(new JLabel("�п�J�ū�",SwingConstants.CENTER),
                    BorderLayout.NORTH);
    contentPane.add(f2c,BorderLayout.EAST);
    contentPane.add(c2f,BorderLayout.WEST);
    contentPane.add(degree,BorderLayout.CENTER);
    contentPane.add(result,BorderLayout.SOUTH);

    // �]�w this ���󬰶�ť��
    f2c.addActionListener(this);
    c2f.addActionListener(this);

    myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myframe.setSize(400,120);
    myframe.setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    try {
      // ���o��J�Ϫ��r��, ���ন�B�I��
      double value = Double.parseDouble(degree.getText());

      String msg="";     // ����ഫ���G���r��
      if(e.getSource() == f2c) // �̫��s�M�w�ഫ�覡
       msg= "�ؤ� " + value + " �׵������ " +
                      ((value-32)*5/9) +" ��";
      else
        msg= "��� " + value + " �׵���ؤ� " +
                      (value/5*9 + 32) +" ��";
      // �ñN���G�g������̤U��
      result.setText(msg);
    } catch (NumberFormatException ne) {
      degree.setText("");   // �o�ͨҥ~�ɲM����J�Ϥ��e
    }
  }
}
