import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q1 extends JFrame {
    private JTextField tf;
    private JLabel label;
    private JButton b;

    public Q1() {
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));

        tf = new JTextField(10);
        add(tf);

        label = new JLabel("Text will appear here");
        add(label);

        b = new JButton("Display");
        b.addActionListener(new myHandler());
        add(b);
    }

    class myHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tf.getText();
            label.setText(s);
            tf.setText("");
        }
    }

    public static void main(String[] args) {
        Q1 frame = new Q1();
        frame.setTitle("Display Text");
        frame.setSize(400, 150);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
