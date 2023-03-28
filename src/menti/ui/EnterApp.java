package menti.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnterApp extends JFrame {

    //items on user interface
    private JPanel enterPanel;
    private JLabel enterLabel;
    private JButton loginButton;
    private JButton signupButton;

    private static boolean signedUp = false;

    public EnterApp(){

        setContentPane(enterPanel);

        //when loginButton is clicked, change screen to Login screen
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login frame = new Login();
                frame.setVisible(true);
                frame.setSize(800,500);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });

        //when signUpButton is clicked, change screen to SignUp screen
        signupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //if user has not made an account, allow them to create an account
                if (signedUp == false) {
                    SignUp frame = new SignUp();
                    signedUp = true;
                    frame.setVisible(true);
                    frame.setSize(800,500);
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
                //if user has made an account, show message and do not let them create another account
                else {
                    JOptionPane.showMessageDialog(signupButton, "You have already created an account");
                }
            }
        });
    }

    public static void main(String[] args) {
        //create an EnterApp screen
        EnterApp m = new EnterApp();
        m.setContentPane(m.enterPanel);
        m.setSize(800,500);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
