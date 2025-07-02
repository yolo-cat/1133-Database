import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TrigonoCalc extends KeyAdapter
                        implements ActionListener {
  JFrame f = new JFrame("�p��T�����");
  JRadioButton deg = new JRadioButton("����");
  JRadioButton rad = new JRadioButton("�y��");
  JTextField degree = new JTextField(16);
  JTextField sintxt = new JTextField();
  JTextField costxt = new JTextField();
  JTextField tantxt = new JTextField();
  JLabel sinlab =new JLabel(" SIN() ");
  JLabel coslab =new JLabel(" COS() ");
  JLabel tanlab =new JLabel(" TAN() ");
  JButton go = new JButton("�p��");
  double convert = 180 / Math.PI;  // �@�y�׵��� (180/�k) ��

  public static void main(String[] args) {
    TrigonoCalc tri = new TrigonoCalc();
    tri.init();
  }

  public void init() {
    Container contentPane = f.getContentPane();
    JPanel p = new JPanel();
    // �N��Ӥ���� JPanel �[�J JFrame
    contentPane.add(degree,"North");
    contentPane.add(p,"Center");
    contentPane.add(go,"South");

    // �N JPanel �]�w���ϥ� GridLayout (4 �C�B2 ��)
    p.setLayout(new GridLayout(4,2));
    // �N�U����[�� JPanel ��
    p.add(deg);      p.add(rad);
    p.add(sinlab);   p.add(sintxt);
    p.add(coslab);   p.add(costxt);
    p.add(tanlab);   p.add(tantxt);

    // �]�w��ܨ��׳�쪺�ֱ���
    deg.setMnemonic(KeyEvent.VK_D);
    rad.setMnemonic(KeyEvent.VK_R);

    // �N��ӳ��s�]���@��
    ButtonGroup group = new ButtonGroup();
    group.add(deg);
    group.add(rad);
    deg.setSelected(true);    // �N deg �]���w�]���������

    go.addActionListener(this);
    degree.addKeyListener(this);

    // ���s������ƥ󤧳B�z��k
    deg.addItemListener(
      new ItemListener() {
        public void itemStateChanged(ItemEvent e) {
          if (e.getStateChange() == ItemEvent.SELECTED)
            convert = 180 / Math.PI;
          else
            convert = 1;
        }
      }
    );

    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(250,200);
    f.setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    calc();
  }

  // �b��J�ϫ� ENTER ��]�|�i��p��
  public void keyPressed(KeyEvent e) {
    if (e.getKeyCode() == KeyEvent.VK_ENTER) calc();
  }

  public void calc() {
    try {
      // ���o��J�Ϫ��r��, �ন�B�I�ƫᰣ�H���״�����
      double theta = Double.parseDouble(degree.getText())/convert;
      // �p��T����ƭ�, �ñN���G�g��U��r��줤
      sintxt.setText(String.format("%.3f",Math.sin(theta)));
      costxt.setText(String.format("%.3f",Math.cos(theta)));
      tantxt.setText(String.format("%.3f",Math.tan(theta)));
    } catch (NumberFormatException e) {
      degree.setText("");   // �o�ͨҥ~�ɲM����J�Ϥ��e
    }
  }
}