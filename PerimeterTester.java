import java.awt.*;

public class PerimeterTester {
    // برنامج رقم 1
    public static void main(String[] args) {

        Rectangle asmaa = new Rectangle(10,10);
        System.out.println( "expected perimeter ="+2*(10+10 ));
        System.out.println( "actual perimeter ="+2*(asmaa.getHeight()+asmaa.getWidth() ));

    }
}
