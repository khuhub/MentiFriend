package menti.ui;

import javax.swing.*;

public class EnterApp extends JFrame {

    private JPanel enterPanel;

    public static void main(String[] args) {
        EnterApp e = new EnterApp();
        e.setContentPane(e.enterPanel);
        e.setVisible(true);
    }

}
