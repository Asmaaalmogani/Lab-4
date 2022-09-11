import javax.swing.*;
import java.awt.*;

public class Q10 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400,400);
        JLabel label= new JLabel("Hello, Asmaa!");
        label.setOpaque(true);
        label.setBackground(Color.green);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
