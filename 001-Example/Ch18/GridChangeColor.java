import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GridChangeColor extends JPanel
                         implements ActionListener {
  JButton red = new JButton("��");
  JButton orange = new JButton("���");
  JButton yellow = new JButton("��");
  JButton green = new JButton("�ܺ��");
  JButton blue = new JButton("��");

  public static void main(String[] args) {
    // �إ� ChangeColor (JPanel ���l���O) ����
    GridChangeColor p = new GridChangeColor();
    p.setLayout(new GridLayout(3,2));  // �ϥ� 3x2 ���t�m

    // �N JPanel ����[�� JFrame ��
    JFrame f = new JFrame("�ܴ������I��GridLayout��");
    f.getContentPane().add(p);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(360,80);
    f.setVisible(true);
  }

  public GridChangeColor() {
    // �N 5 �ӫ��s����[�쭱�O��
    add(red);
    add(orange);
    add(yellow);
    add(green);
    add(blue);

    // �N���ӫ��s����ť�̳��]��������
    red.addActionListener(this);
    orange.addActionListener(this);
    yellow.addActionListener(this);
    green.addActionListener(this);
    blue.addActionListener(this);
  }

  // ���ӫ��s���ƥ�B�z��k
  public void actionPerformed(ActionEvent e) {
    JButton s = (JButton) e.getSource();   // ���o���ͨƥ󪺫��s

    // �N���O�I���C�⴫�����s�������C��
    if ( s == red) setBackground(Color.red);
    else if ( s == orange) setBackground (Color.orange);
    else if ( s == yellow) setBackground (Color.yellow);
    else if ( s == green)  setBackground (Color.green);
    else setBackground (Color.blue);
  }
}
