import javax.swing.*;
import java.awt.*;

public class Q4 extends JFrame {
    public Q4() {
        setLayout(new BorderLayout(5, 5));

        JPanel emptyPanel = new JPanel();
        add(emptyPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(new JButton("Button 1"));
        buttonPanel.add(new JButton("Button 2"));
        buttonPanel.add(new JButton("Button 3"));
        buttonPanel.add(new JButton("Button 4"));
        buttonPanel.add(new JButton("Button 5"));

        add(buttonPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        Q4 frame = new Q4();
        frame.setTitle("Panel Demo");
        frame.setSize(500, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}