package menti.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame{

    //items on user interface
    private JPanel loginPanel;
    private JLabel welcomeLabel;
    private JLabel passwordLabel;
    private JPasswordField passwordInput;
    private JButton passwordButton;
    private JTextField userNameInput;
    private JLabel userNameLabel;
    private JButton returnEnterButton;

    public Login() {

        setContentPane(loginPanel);

        //when passwordButton is clicked, let user into the app or prompt them to reenter a username/password
        passwordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //if the username and password are accurate change the screen to Inspo screen
                if(userNameInput.getText().equals(SignUp.getUserName()) && passwordInput.getText().equals(SignUp.getPassword())){
                    Inspo frame = new Inspo();
                    frame.setVisible(true);
                    frame.setSize(800,500);
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //if the username/password are wrong, show message
                } else {
                    JOptionPane.showMessageDialog(passwordButton, "Invalid login attempt");
                }
            }
        });

        //if returnEnterButton is clicked, change screen to EnterApp screen
        returnEnterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EnterApp frame = new EnterApp();
                frame.setVisible(true);
                frame.setSize(800,500);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }

}
