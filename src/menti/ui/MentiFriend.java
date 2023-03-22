package menti.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class MentiFriend extends JFrame{

    private JPanel mainPanel;
    private JLabel welcomeLabel;

    private JLabel passwordLabel;
    private JPasswordField passwordInput;
    private JButton PasswordButton;
    private JPasswordField login;

    public MentiFriend() {
        passwordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(passwordButton, "you entered: " + passwordInput.getText());
            }
        });
    }

    public static void main(String[] args){
        MentiFriend m = new MentiFriend();
        m.setContentPane(m.mainPanel);
        m.setTitle("Hii");
        m.setSize(300,400);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }




}
