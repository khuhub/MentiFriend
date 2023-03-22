package menti.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class MentiFriend extends JFrame{

    private JPanel mainPanel;
    private JPasswordField passwordInput;
    private JButton enterPasswordButton;

    public MentiFriend() {
        enterPasswordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(enterPasswordButton, "you entered: " + passwordInput.getText());
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
