import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class ShowImage extends JPanel {
  Image img = null; // �N��v��������

  public ShowImage(String filename) {
    img = getToolkit().getImage(filename);  // ���J���w���v����
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D) g;

    Dimension d = getSize();                // ���o���O���j�p

    // �إ߮y���ഫ����
    AffineTransform at = new AffineTransform();

    // �� Panel ���ϰ�j�p�ӽվ���ܤ��
    double sc = Math.min(d.width/(double)img.getWidth(null),
                         d.height/(double)img.getHeight(null));
    at.scale(sc,sc);

    g2.drawImage(img, at, this);            // ��ܼv��
  }

  public static void main(String[] args) {
    try {
      ShowImage dimg = new ShowImage(args[0]);

      JFrame f = new JFrame(args[0]);
      f.getContentPane().add(dimg);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setSize(640,480);
      f.setVisible(true);
    }
    catch (Exception e) {
      System.out.println("�Ϊk: java ShowImage <�v���ɦW��>");
      System.exit(0);
    }
  }
}
