import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q2 extends JFrame {
    private JTextField tf;
    private JRadioButton plain, bold, italic, boldItalic;
    private ButtonGroup group;

    public Q2() {
        setLayout(new BorderLayout(5, 5));

        tf = new JTextField("Watch the font style change");
        tf.setFont(new Font("SansSerif", Font.PLAIN, 14));
        add(tf, BorderLayout.NORTH);

        JPanel radioPanel = new JPanel();
        radioPanel.setLayout(new FlowLayout());

        plain = new JRadioButton("Plain", true);
        bold = new JRadioButton("Bold", false);
        italic = new JRadioButton("Italic", false);
        boldItalic = new JRadioButton("Bold/Italic", false);

        group = new ButtonGroup();
        group.add(plain);
        group.add(bold);
        group.add(italic);
        group.add(boldItalic);

        myHandler handler = new myHandler();
        plain.addActionListener(handler);
        bold.addActionListener(handler);
        italic.addActionListener(handler);
        boldItalic.addActionListener(handler);

        radioPanel.add(plain);
        radioPanel.add(bold);
        radioPanel.add(italic);
        radioPanel.add(boldItalic);

        add(radioPanel, BorderLayout.SOUTH);
    }

    class myHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == plain) {
                tf.setFont(new Font("SansSerif", Font.PLAIN, 14));
            }
            if (e.getSource() == bold) {
                tf.setFont(new Font("SansSerif", Font.BOLD, 14));
            }
            if (e.getSource() == italic) {
                tf.setFont(new Font("SansSerif", Font.ITALIC, 14));
            }
            if (e.getSource() == boldItalic) {
                tf.setFont(new Font("SansSerif", Font.BOLD + Font.ITALIC, 14));
            }
        }
    }

    public static void main(String[] args) {
        Q2 frame = new Q2();
        frame.setTitle("RadioButton Test");
        frame.setSize(400, 150);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}