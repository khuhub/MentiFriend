package menti.ui;

import javax.swing.*;
import java.awt.event.InputMethodEvent;
import java.awt.event.InputMethodListener;

public class MentiFriend {
    private JPanel mainPanel;
    private JPasswordField login;
    private JLabel welcomeLabel;


public MentiFriend() {
    login.addInputMethodListener(new InputMethodListener() {
        @Override
        public void inputMethodTextChanged(InputMethodEvent event) {

        }

        @Override
        public void caretPositionChanged(InputMethodEvent event) {

        }
    });
}
}
