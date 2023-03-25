package menti.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ToDo extends JFrame {
    private JPanel toDoPanel;
    private JCheckBox ToDoCheck1;
    private JCheckBox ToDoCheck2;
    private JCheckBox ToDoCheck3;
    private JCheckBox ToDoCheck4;
    private JCheckBox ToDoCheck5;
    private JCheckBox ToDoCheck6;
    private JCheckBox ToDoCheck7;
    private JCheckBox ToDoCheck8;
    private JCheckBox ToDoCheck9;
    private JCheckBox longTermCheck1;
    private JCheckBox longTermCheck2;
    private JCheckBox longTermCheck3;
    private JCheckBox longTermCheck4;
    private JCheckBox longTermCheck5;
    private JCheckBox longTermCheck6;
    private JCheckBox longTermCheck7;
    private JCheckBox longTermCheck8;
    private JCheckBox longTermCheck9;
    private JTextField toDoEnterText1;
    private JTextField toDoEnterText2;
    private JTextField toDoEnterText3;
    private JTextField toDoEnterText4;
    private JTextField toDoEnterText5;
    private JTextField toDoEnterText6;
    private JTextField toDoEnterText7;
    private JTextField toDoEnterText8;
    private JTextField toDoEnterText9;
    private JTextField longTermEnterText1;
    private JTextField longTermEnterText2;
    private JTextField longTermEnterText3;
    private JTextField longTermEnterText4;
    private JTextField longTermEnterText5;
    private JTextField longTermEnterText6;
    private JTextField longTermEnterText7;
    private JTextField longTermEnterText8;
    private JTextField longTermEnterText9;
    private JLabel toDoLabel;
    private JLabel longTermLabel;
    private JToolBar menuOptions;
    private JButton toDoButton;
    private JButton diaryButton;
    private JButton inspoButton;
    private JButton gameButton;
    private JButton logOutButton;

    public ToDo(){
        setContentPane(toDoPanel);
        diaryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        inspoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Inspo frame = new Inspo();
                frame.setVisible(true);
                frame.setSize(800,500);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }
        });
        gameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        logOutButton.addActionListener(new ActionListener() {
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
