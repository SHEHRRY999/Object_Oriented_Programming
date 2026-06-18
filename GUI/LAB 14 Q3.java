import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q3 extends JFrame {
    private JTextField tf;
    private JCheckBox boldBox, italicBox;

    public Q3() {
        setLayout(new BorderLayout(5, 5));

        tf = new JTextField("Watch the font style change");
        tf.setFont(new Font("SansSerif", Font.PLAIN, 14));
        add(tf, BorderLayout.NORTH);

        JPanel checkPanel = new JPanel();
        checkPanel.setLayout(new FlowLayout());

        boldBox = new JCheckBox("Bold");
        italicBox = new JCheckBox("Italic");

        myHandler handler = new myHandler();
        boldBox.addItemListener(handler);
        italicBox.addItemListener(handler);

        checkPanel.add(boldBox);
        checkPanel.add(italicBox);

        add(checkPanel, BorderLayout.SOUTH);
    }

    class myHandler implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            boolean isBold = boldBox.isSelected();
            boolean isItalic = italicBox.isSelected();

            if (isBold && isItalic) {
                tf.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 14));
            } else if (isBold) {
                tf.setFont(new Font("SansSerif", Font.BOLD, 14));
            } else if (isItalic) {
                tf.setFont(new Font("SansSerif", Font.ITALIC, 14));
            } else {
                tf.setFont(new Font("SansSerif", Font.PLAIN, 14));
            }
        }
    }

    public static void main(String[] args) {
        Q3 frame = new Q3();
        frame.setTitle("JCheckBox Test");
        frame.setSize(400, 150);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}