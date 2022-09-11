import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Qq9 extends JComponent { public void printComponent (Graphics g) {
        Rectangle rectangle = new Rectangle(100,100,70,200);
        Graphics2D gg = (Graphics2D) g;
        gg.setColor(Color.BLACK.brighter());
        gg.fill(rectangle);
        gg.draw(rectangle);

        Ellipse2D.Double a =new Ellipse2D.Double(110,110,50,50);
        gg.setColor(Color.RED);
        gg.fill(a);


        Ellipse2D.Double a2 =new Ellipse2D.Double(110,170,50,50);
        gg.setColor(Color.YELLOW);
        gg.fill(a2);

        Ellipse2D.Double a3 =new Ellipse2D.Double(110,230,50,50);
        gg.setColor(Color.GREEN);
        gg.fill(a3);

    }
}
