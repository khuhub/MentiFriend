package menti.ui;

import javax.swing.*;
import java.awt.event.*;

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
    private JButton clearButton;

    private static String toDoText1;
    private static String toDoText2;
    private static String toDoText3;
    private static String toDoText4;
    private static String toDoText5;
    private static String toDoText6;
    private static String toDoText7;
    private static String toDoText8;
    private static String toDoText9;


    private static boolean toDoBox1;
    private static boolean toDoBox2;
    private static boolean toDoBox3;
    private static boolean toDoBox4;
    private static boolean toDoBox5;
    private static boolean toDoBox6;
    private static boolean toDoBox7;
    private static boolean toDoBox8;
    private static boolean toDoBox9;

    private static String longTermText1;
    private static String longTermText2;
    private static String longTermText3;
    private static String longTermText4;
    private static String longTermText5;
    private static String longTermText6;
    private static String longTermText7;
    private static String longTermText8;
    private static String longTermText9;

    private static boolean longTermBox1;
    private static boolean longTermBox2;
    private static boolean longTermBox3;
    private static boolean longTermBox4;
    private static boolean longTermBox5;
    private static boolean longTermBox6;
    private static boolean longTermBox7;
    private static boolean longTermBox8;
    private static boolean longTermBox9;

    public ToDo(){
        setContentPane(toDoPanel);

        toDoEnterText1.setText(toDoText1);
        toDoEnterText2.setText(toDoText2);
        toDoEnterText3.setText(toDoText3);
        toDoEnterText4.setText(toDoText4);
        toDoEnterText5.setText(toDoText5);
        toDoEnterText6.setText(toDoText6);
        toDoEnterText7.setText(toDoText7);
        toDoEnterText8.setText(toDoText8);
        toDoEnterText9.setText(toDoText9);

        ToDoCheck1.setSelected(toDoBox1);
        ToDoCheck2.setSelected(toDoBox2);
        ToDoCheck3.setSelected(toDoBox3);
        ToDoCheck4.setSelected(toDoBox4);
        ToDoCheck5.setSelected(toDoBox5);
        ToDoCheck6.setSelected(toDoBox6);
        ToDoCheck7.setSelected(toDoBox7);
        ToDoCheck8.setSelected(toDoBox8);
        ToDoCheck9.setSelected(toDoBox9);

        longTermEnterText1.setText(longTermText1);
        longTermEnterText2.setText(longTermText2);
        longTermEnterText3.setText(longTermText3);
        longTermEnterText4.setText(longTermText4);
        longTermEnterText5.setText(longTermText5);
        longTermEnterText6.setText(longTermText6);
        longTermEnterText7.setText(longTermText7);
        longTermEnterText8.setText(longTermText8);
        longTermEnterText9.setText(longTermText9);

        longTermCheck1.setSelected(longTermBox1);
        longTermCheck2.setSelected(longTermBox2);
        longTermCheck3.setSelected(longTermBox3);
        longTermCheck4.setSelected(longTermBox4);
        longTermCheck5.setSelected(longTermBox5);
        longTermCheck6.setSelected(longTermBox6);
        longTermCheck7.setSelected(longTermBox7);
        longTermCheck8.setSelected(longTermBox8);
        longTermCheck9.setSelected(longTermBox9);


        diaryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Diary frame = new Diary();
                frame.setVisible(true);
                frame.setSize(800,500);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

        toDoEnterText1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                toDoText1 = toDoEnterText1.getText();
            }
        });
        toDoEnterText2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                toDoText2 = toDoEnterText2.getText();
            }
        });
        toDoEnterText3.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                toDoText3 = toDoEnterText3.getText();
            }
        });
        toDoEnterText4.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                toDoText4 = toDoEnterText4.getText();
            }
        });
        toDoEnterText5.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                toDoText5 = toDoEnterText5.getText();
            }
        });
        toDoEnterText6.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                toDoText6 = toDoEnterText6.getText();
            }
        });
        toDoEnterText7.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                toDoText7 = toDoEnterText7.getText();
            }
        });
        toDoEnterText8.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                toDoText8 = toDoEnterText8.getText();
            }
        });
        toDoEnterText9.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                toDoText9 = toDoEnterText9.getText();
            }
        });
        ToDoCheck1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                toDoBox1 = ToDoCheck1.isSelected();
            }
        });
        ToDoCheck2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                toDoBox2 = ToDoCheck2.isSelected();
            }
        });
        ToDoCheck3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                toDoBox3 = ToDoCheck3.isSelected();
            }
        });
        ToDoCheck4.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                toDoBox4 = ToDoCheck4.isSelected();
            }
        });
        ToDoCheck5.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                toDoBox5 = ToDoCheck5.isSelected();
            }
        });
        ToDoCheck6.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                toDoBox6 = ToDoCheck6.isSelected();
            }
        });
        ToDoCheck7.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                toDoBox7 = ToDoCheck7.isSelected();
            }
        });
        ToDoCheck8.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                toDoBox8 = ToDoCheck8.isSelected();
            }
        });
        ToDoCheck9.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                toDoBox9 = ToDoCheck9.isSelected();
            }
        });
        longTermEnterText1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                longTermText1 = longTermEnterText1.getText();
            }
        });
        longTermEnterText2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                longTermText2 = longTermEnterText2.getText();
            }
        });
        longTermEnterText3.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                longTermText3 = longTermEnterText3.getText();
            }
        });
        longTermEnterText4.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                longTermText4 = longTermEnterText4.getText();
            }
        });
        longTermEnterText5.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                longTermText5 = longTermEnterText5.getText();
            }
        });
        longTermEnterText6.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                longTermText6 = longTermEnterText6.getText();
            }
        });
        longTermEnterText7.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                longTermText7 = longTermEnterText7.getText();
            }
        });
        longTermEnterText8.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                longTermText8 = longTermEnterText8.getText();
            }
        });
        longTermEnterText9.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                longTermText9 = longTermEnterText9.getText();
            }
        });
        longTermCheck1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                longTermBox1 = longTermCheck1.isSelected();
            }
        });

        longTermCheck2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                longTermBox2 = longTermCheck2.isSelected();
            }
        });
        longTermCheck3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                longTermBox3 = longTermCheck3.isSelected();
            }
        });
        longTermCheck4.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                longTermBox4 = longTermCheck4.isSelected();
            }
        });
        longTermCheck5.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                longTermBox5 = longTermCheck5.isSelected();
            }
        });
        longTermCheck6.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                longTermBox6 = longTermCheck6.isSelected();
            }
        });
        longTermCheck7.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                longTermBox7 = longTermCheck7.isSelected();
            }
        });
        longTermCheck8.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                longTermBox8 = longTermCheck8.isSelected();
            }
        });
        longTermCheck9.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                longTermBox9 = longTermCheck9.isSelected();
            }
        });


        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ToDoCheck1.setSelected(false);
                ToDoCheck2.setSelected(false);
                ToDoCheck3.setSelected(false);
                ToDoCheck4.setSelected(false);
                ToDoCheck5.setSelected(false);
                ToDoCheck6.setSelected(false);
                ToDoCheck7.setSelected(false);
                ToDoCheck8.setSelected(false);
                ToDoCheck9.setSelected(false);

                longTermCheck1.setSelected(false);
                longTermCheck2.setSelected(false);
                longTermCheck3.setSelected(false);
                longTermCheck4.setSelected(false);
                longTermCheck5.setSelected(false);
                longTermCheck6.setSelected(false);
                longTermCheck7.setSelected(false);
                longTermCheck8.setSelected(false);
                longTermCheck9.setSelected(false);
            }
        });
    }


}
