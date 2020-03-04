import javax.swing.*;
import java.awt.*;

public class Test
{
    public static void main(String[] args) {
        Convertitore c1 = new Convertitore(3);
        System.out.println(c1.converti());

        MyFrame frame = new MyFrame("Convertitore");
        MyPanel panel = new MyPanel();
        Container c = frame.getContentPane();
        c.add(panel);
        frame.setVisible(true);
    }
}
