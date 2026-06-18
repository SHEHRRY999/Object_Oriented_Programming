import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Q4 extends JFrame {
    private JTextField tf;
    private double num1 = 0;
    private String operator = "";
    private boolean nextClear = false;

    public Q4() {
        setLayout(new BorderLayout(5, 5));

        tf = new JTextField();
        tf.setEditable(false);
        add(tf, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4, 4, 5, 5));

        myHandler handler = new myHandler();

        String[] labels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String label : labels) {
            JButton btn = new JButton(label);
            btn.addActionListener(handler);
            buttonPanel.add(btn);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    class myHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String cmd = ((JButton) e.getSource()).getText();

            if (cmd.equals("+") || cmd.equals("-") ||
                    cmd.equals("*") || cmd.equals("/")) {
                num1 = Double.parseDouble(tf.getText());
                operator = cmd;
                nextClear = true;

            } else if (cmd.equals("=")) {
                double num2 = Double.parseDouble(tf.getText());
                double result = 0;

                if (operator.equals("+"))
                    result = num1 + num2;
                if (operator.equals("-"))
                    result = num1 - num2;
                if (operator.equals("*"))
                    result = num1 * num2;
                if (operator.equals("/"))
                    result = num1 / num2;

                tf.setText(String.valueOf(result));
                nextClear = true;

            } else {
                if (nextClear) {
                    tf.setText("");
                    nextClear = false;
                }
                tf.setText(tf.getText() + cmd);
            }
        }
    }

    public static void main(String[] args) {
        Q4 frame = new Q4();
        frame.setTitle("Calculator");
        frame.setSize(250, 250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}