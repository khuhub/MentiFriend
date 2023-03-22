package menti.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp extends JFrame{
    private JPanel signupPanel;
    private JTextField userNameInput;
    private JLabel userNameLabel;
    private JTextField passwordInput;
    private JLabel passwordLabel;
    private JButton createAccountButton;

    public SignUp() {
        setContentPane(signupPanel);
        createAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args){

    }
}
