import javax.swing.*;
import java.awt.event.*;  // �n�B�z�ƥ󥲶� import ���M��

public class SimpleListener extends JFrame
                            implements ActionListener {
  int act = 0;     // �ΨӰO�����s�Q���ƪ��ܼ�

  public static void main(String[] args) {
    SimpleListener test = new SimpleListener();
  }

  // �Ϋغc��k�ӫإߤ���B�N����[�J�����B��ܵ���
  public SimpleListener() {
    setTitle("Listener �ܽd");    // �]�w�������D
    JButton mybutton = new JButton("���Ӽ��D");

    // �q�����s����G������n���ť��
    mybutton.addActionListener(this);

    getContentPane().add(mybutton);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(420,140);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    act++;    // �N���s���ƥ[ 1

    // �N�������D��אּ��ܫ��s����
    setTitle("�o�� " + act + " �����s�ƥ�");
  }
}
