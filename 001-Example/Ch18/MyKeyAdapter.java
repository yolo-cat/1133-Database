import java.awt.event.*;
import javax.swing.*;

public class MyKeyAdapter extends KeyAdapter {

  JFrame myframe = new JFrame("Adapetr ���O�ܽd");

  // �Ψ���ܰT��������
  JLabel whatkey = new JLabel("�п�J���@�r���I");

  public static void main(String[] args) {
    MyKeyAdapter test = new MyKeyAdapter();
    test.init();
  }

  // �إߤ���B�N����[�J�����B��ܵ�������k
  public void init() {
    myframe.addKeyListener(this);  // �]�w����ƥ󪺶�ť��

    myframe.getContentPane().add(whatkey);
    myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myframe.setSize(240,120);
    myframe.setVisible(true);
  }

  // �~�Ӧ� KeyAdapter ����k,
  public void keyTyped(KeyEvent e) {
    whatkey.setText("�z����J���O�w��" + e.getKeyChar() );
  } // keyPressed()�BkeyReleased() ��k�����κ�
}
