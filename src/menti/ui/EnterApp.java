package menti.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnterApp extends JFrame {

    private JPanel enterPanel;
    private JLabel enterLabel;
    private JButton loginButton;
    private JButton signupButton;

    private static boolean signedUp = false;

    public EnterApp(){
        setContentPane(enterPanel);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login frame = new Login();
                frame.setVisible(true);
                frame.setSize(800,500);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });

        signupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (signedUp == false) {
                    SignUp frame = new SignUp();
                    signedUp = true;
                    frame.setVisible(true);
                    frame.setSize(800,500);
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
                else {
                    JOptionPane.showMessageDialog(signupButton, "You have already created an account");
                }
            }
        });
    }
    public static void main(String[] args) {
        EnterApp m = new EnterApp();
        m.setContentPane(m.enterPanel);
        m.setSize(800,500);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
