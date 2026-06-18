import javax.swing.*;
import java.awt.*;

public class Q1 extends JFrame {
    public Q1() {
        setLayout(new BorderLayout(5, 5));
        add(new JTextField(), BorderLayout.NORTH);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));

        buttonPanel.add(new JButton("7"));
        buttonPanel.add(new JButton("8"));
        buttonPanel.add(new JButton("9"));
        buttonPanel.add(new JButton("/"));
        buttonPanel.add(new JButton("4"));
        buttonPanel.add(new JButton("5"));
        buttonPanel.add(new JButton("6"));
        buttonPanel.add(new JButton("*"));
        buttonPanel.add(new JButton("1"));
        buttonPanel.add(new JButton("2"));
        buttonPanel.add(new JButton("3"));
        buttonPanel.add(new JButton("-"));
        buttonPanel.add(new JButton("0"));
        buttonPanel.add(new JButton("."));
        buttonPanel.add(new JButton("="));
        buttonPanel.add(new JButton("+"));

        add(buttonPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        Q1 frame = new Q1();
        frame.setTitle("Calculator");
        frame.setSize(250, 250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
