import javax.swing.*;
import java.awt.*;

public class Q2 extends JFrame {
    public Q2() {
        setLayout(new BorderLayout(5, 5));

        JPanel colorPanel = new JPanel();
        colorPanel.setLayout(new GridLayout(1, 3));

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.CYAN);

        JPanel whitePanel = new JPanel();
        whitePanel.setBackground(Color.WHITE);

        JPanel grayPanel = new JPanel();
        grayPanel.setBackground(Color.GRAY);

        colorPanel.add(bluePanel);
        colorPanel.add(whitePanel);
        colorPanel.add(grayPanel);

        add(colorPanel, BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(new JButton("Select"));
        buttonPanel.add(new JButton("White"));
        buttonPanel.add(new JButton("Delete"));

        add(buttonPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        Q2 frame = new Q2();
        frame.setTitle("Panel Demonstrator");
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}