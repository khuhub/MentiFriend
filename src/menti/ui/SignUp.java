package menti.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;

public class SignUp extends JFrame{
    private JPanel signupPanel;
    private JTextField userNameInput;
    private JLabel userNameLabel;
    private JTextField passwordInput;
    private JLabel passwordLabel;
    private JButton createAccountButton;
    protected static String userName;
    protected static String password;

    public SignUp() {
        setContentPane(signupPanel);
        createAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EnterApp frame = new EnterApp();
                frame.setVisible(true);
                frame.setSize(800,400);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                userName = userNameInput.getText();
                password = passwordInput.getText();
            }
        });
    }

    public static void main(String[] args){

    }

    public static String getUserName(){
        return userName;
    }

    public static String getPassword(){
        return password;
    }
}
