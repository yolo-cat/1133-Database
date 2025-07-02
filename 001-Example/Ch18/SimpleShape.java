import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class SimpleShape extends JPanel {

  public void paintComponent(Graphics g) {
    // �ФW�h�e�����e, �H�M���즳���e
    super.paintComponent(g);

    // ���o���O���e�P��
    double Width  = getSize().width - 10;
    double Height = getSize().height / 4 - 10;

    Graphics2D g2 = (Graphics2D) g;

    g2.draw(new         // �e�u
       Line2D.Double(5,5,5+Width,5+Height));

    g2.draw(new         // �e�x��
       Rectangle2D.Double(5,10+Height,Width,Height));

    g2.draw(new         // �϶ꨤ�x��
       RoundRectangle2D.Double(5,15+2*Height,Width,Height,20,30));

    g2.draw(new         // �e���
       Ellipse2D.Double(5,20+3*Height,Width,Height));
  }

  public static void main(String[] args) {
    JFrame f = new JFrame("�X��Ϯ�");
    f.getContentPane().add(new SimpleShape());
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(640,480);
    f.setVisible(true);
  }
}
