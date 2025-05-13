import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame implements ActionListener {
    private Container container;
    private JLabel userLabel;
    private JLabel passLabel;
    private JTextField userText;
    private JPasswordField passText;
    private JButton loginButton;
    private JLabel messageLabel;

    public LoginForm() {
        setTitle("Login Form");
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        container = getContentPane();
        container.setLayout(null);

        userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 30, 80, 25);
        container.add(userLabel);

        userText = new JTextField();
        userText.setBounds(140, 30, 150, 25);
        container.add(userText);

        passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 70, 80, 25);
        container.add(passLabel);

        passText = new JPasswordField();
        passText.setBounds(140, 70, 150, 25);
        container.add(passText);

        loginButton = new JButton("Login");
        loginButton.setBounds(100, 110, 100, 25);
        loginButton.addActionListener(this);
        container.add(loginButton);

        messageLabel = new JLabel();
        messageLabel.setBounds(50, 140, 250, 25);
        messageLabel.setForeground(Color.RED);
        container.add(messageLabel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String username = userText.getText();
        String password = new String(passText.getPassword());
        if (username.equals("admin") && password.equals("password")) {
            messageLabel.setForeground(Color.BLUE);
            messageLabel.setText("Login successful!");
        } else {
            messageLabel.setForeground(Color.RED);
            messageLabel.setText("Invalid username or password.");
        }
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}
