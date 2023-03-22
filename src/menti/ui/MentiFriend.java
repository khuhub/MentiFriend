package menti.ui;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MentiFriend extends JFrame{

    private JPanel loginPanel;
    private JLabel welcomeLabel;

    private JLabel passwordLabel;
    private JPasswordField passwordInput;
    private JButton passwordButton;
    private JPasswordField login;

    private JPanel enterAppPanel;


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
        m.setContentPane(m.loginPanel);
        m.setSize(800,400);
        m.setVisible(true);
        m.setContentPane(m.enterAppPanel);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }




}
