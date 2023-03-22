package menti.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnterApp extends JFrame {

    private JPanel enterPanel;
    private JLabel enterLabel;
    private JButton loginButton;
    private JButton signupButton;

    public EnterApp(){
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Login frame = new Login();
                frame.setVisible(true);
                frame.setSize(800,400);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });
    }
    public static void main(String[] args) {
        EnterApp m = new EnterApp();
        m.setContentPane(m.enterPanel);
        m.setSize(800,400);
        m.setVisible(true);
        m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
