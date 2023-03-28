package menti.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp extends JFrame{

    //items on user interface
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

        //when createAccountButton is clicked, save username and password and change screen to EnterApp screen
        createAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EnterApp frame = new EnterApp();
                frame.setVisible(true);
                frame.setSize(800,500);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                userName = userNameInput.getText();
                password = passwordInput.getText();
            }
        });
    }

    //accessor to compare with username user enters in Login
    public static String getUserName(){
        return userName;
    }

    //accessor to compare with password user enters in Login
    public static String getPassword(){
        return password;
    }

}
