import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class ColorShape extends JPanel {
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;

    // �ھڼe�P���ӽվ�Ϯפj�p
    float Width  = getSize().width - 10;
    float Height = getSize().height/3 - 10;

    // �e�������u
    g2.setPaint(Color.red);
    g2.draw(new Line2D.Float(5,5,5+Width,5+Height));
    g2.draw(new Line2D.Float(5,5+Height,5+Width,5));

    // �e�ۭq�C�⪺�x��
    g2.setPaint(new Color(97,210,214));
    g2.fill(new Rectangle2D.Float(5,10+Height,Width,Height));

    // �e���h���
    g2.setPaint(new GradientPaint (5,5,Color.white,
                                   5+Width,5,Color.black));
    g2.fill(new Ellipse2D.Float(5,20+2*Height,Width,Height));
  }

  public static void main(String[] args) {
    JFrame f = new JFrame("��m����");
    ColorShape p = new ColorShape();
    p.setBackground(Color.white); // �N�I���]���զ�
    f.getContentPane().add(p);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setSize(640,480);
    f.setVisible(true);
  }
}
