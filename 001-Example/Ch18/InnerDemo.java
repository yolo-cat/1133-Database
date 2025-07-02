import javax.swing.*;
import java.awt.event.*;

public class InnerDemo extends JFrame {

  int act = 0;     // �ΨӰO�����s�Q���ƪ��ܼ�

  public static void main(String[] args) {
    InnerDemo test = new InnerDemo();
  }

  // �Ϋغc��k�إߤ���B�N����[�J�����B��ܵ���
  public InnerDemo() {
    setTitle("Listener �ܽd");
    JButton mybutton = new JButton("���Ӽ��D");
    mybutton.addActionListener(new InnerListener());
                              // �H�������O���󬰶�ť��

    getContentPane().add(mybutton);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(420,140);
    setVisible(true);
  }

  // ��@ ActionListener �������������O
  class InnerListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      act++;       // �s���~�����O�� act ����
      setTitle("�o�� " + act + " �����s�ƥ�");
    }
  }
}
