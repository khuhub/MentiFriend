package menti.ui;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import menti.ui.SignUp;

public class Login extends JFrame{

    private JPanel loginPanel;
    private JLabel welcomeLabel;

    private JLabel passwordLabel;
    private JPasswordField passwordInput;
    private JButton passwordButton;
    private JTextField userNameInput;
    private JLabel userNameLabel;
    private JPasswordField login;


    public Login() {
        setContentPane(loginPanel);
        passwordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(userNameInput.getText().equals(SignUp.getUserName()) && passwordInput.getText().equals(SignUp.getPassword())){
                    //move on to menu screen
                    Inspo frame = new Inspo();
                    frame.setVisible(true);
                    frame.setSize(800,400);
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                } else {
                    JOptionPane.showMessageDialog(passwordButton, "Invalid login attempt");
                }
            }
        });
    }

    public static void main(String[] args){

    }




}
