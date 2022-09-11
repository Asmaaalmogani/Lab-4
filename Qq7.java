import javax.swing.*;
import java.awt.*;

public class Qq7 extends JComponent {
    public void paintComponent(Graphics g){
        Rectangle rectangle = new Rectangle(350,300,100,100);
        Rectangle rectangle2 = new Rectangle(200,300,100,100);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.PINK);
        g2.fill(rectangle);
        g2.draw(rectangle);
        Graphics2D g3 = (Graphics2D) g;
        g3.setColor(Color.MAGENTA.darker());
        g3.fill(rectangle2);
        g3.draw(rectangle2);


    }
}
