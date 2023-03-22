package menti.ui;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{

    private JPanel loginPanel;
    private JLabel welcomeLabel;

    private JLabel passwordLabel;
    private JPasswordField passwordInput;
    private JButton passwordButton;
    private JPasswordField login;


    public Login() {
        setContentPane(loginPanel);
        passwordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(passwordButton, "you entered: " + passwordInput.getText());
            }
        });
    }

    public static void main(String[] args){

    }




}
