import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends JFrame implements ActionListener {
    private JTextField textField;
    private double num1 = 0, num2 = 0, result = 0;
    private char operator;

    public SimpleCalculator() {
        setTitle("Simple Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        textField = new JTextField();
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setFont(new Font("Arial", Font.BOLD, 24));

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 20));
            button.addActionListener(this);
            panel.add(button);
        }

        setLayout(new BorderLayout(10, 10));
        add(textField, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String input = e.getActionCommand();
        if (input.charAt(0) >= '0' && input.charAt(0) <= '9') {
            textField.setText(textField.getText() + input);
        } else if (input.equals("C")) {
            textField.setText("");
            num1 = num2 = result = 0;
        } else if (input.equals("=")) {
            try {
                num2 = Double.parseDouble(textField.getText());
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            textField.setText("Error: Div by 0");
                            return;
                        }
                        break;
                }
                textField.setText(String.valueOf(result));
            } catch (NumberFormatException ex) {
                textField.setText("Invalid Input");
            }
        } else {
            try {
                num1 = Double.parseDouble(textField.getText());
                operator = input.charAt(0);
                textField.setText("");
            } catch (NumberFormatException ex) {
                textField.setText("Invalid Input");
            }
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
