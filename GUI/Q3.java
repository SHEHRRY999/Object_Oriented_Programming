import javax.swing.*;
import java.awt.*;

public class Q3 extends JFrame {
    public Q3() {
        setLayout(new GridLayout(2, 3, 10, 10));

        add(new JButton("one"));
        add(new JButton("two"));
        add(new JButton("three"));
        add(new JButton("four"));
        add(new JButton("five"));
        add(new JButton("six"));
    }

    public static void main(String[] args) {
        Q3 frame = new Q3();
        frame.setTitle("GridLayout Demo");
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}