import javax.swing.*;
import java.awt.event.*;

public class AnonymousListener extends JFrame {

  int act = 0;     // �ΨӰO�����s�Q���ƪ��ܼ�

  public static void main(String[] args) {
    AnonymousListener test = new AnonymousListener();
  }

  // �Ϋغc��k�إߤ���B�N����[�J�����B��ܵ���
  public AnonymousListener() {
    setTitle("Listener �ܽd");
    JButton mybutton = new JButton("���Ӽ��D");

    // addActionListener() ���ѼƬ��ΦW���O����
    mybutton.addActionListener(
      // �H�U�إߪ��ΦW���O���󬰫��s���󪺶�ť��
      new ActionListener() {
        public void actionPerformed(ActionEvent e) {
          act++;    // �N���s���ƥ[ 1
          setTitle("�o�� " + act + " �����s�ƥ�");
        }
      }
    );

    getContentPane().add(mybutton);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(420,140);
    setVisible(true);
  }
}
