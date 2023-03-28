package menti.ui;

import javax.swing.*;
import java.awt.event.*;

public class ToDo extends JFrame {

    //items on user interface
    private JPanel toDoPanel;
    private JCheckBox toDoCheck1;
    private JCheckBox toDoCheck2;
    private JCheckBox toDoCheck3;
    private JCheckBox toDoCheck4;
    private JCheckBox toDoCheck5;
    private JCheckBox toDoCheck6;
    private JCheckBox toDoCheck7;
    private JCheckBox toDoCheck8;
    private JCheckBox toDoCheck9;
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
    private JButton toDoButton;
    private JButton diaryButton;
    private JButton inspoButton;
    private JButton gameButton;
    private JButton logOutButton;
    private JButton clearButton;

    //text content for toDo text boxes
    private static String toDoText1;
    private static String toDoText2;
    private static String toDoText3;
    private static String toDoText4;
    private static String toDoText5;
    private static String toDoText6;
    private static String toDoText7;
    private static String toDoText8;
    private static String toDoText9;

    //isChecked booleans for toDo checkboxes
    private static boolean toDoBox1;
    private static boolean toDoBox2;
    private static boolean toDoBox3;
    private static boolean toDoBox4;
    private static boolean toDoBox5;
    private static boolean toDoBox6;
    private static boolean toDoBox7;
    private static boolean toDoBox8;
    private static boolean toDoBox9;

    //text content for longTerm text boxes
    private static String longTermText1;
    private static String longTermText2;
    private static String longTermText3;
    private static String longTermText4;
    private static String longTermText5;
    private static String longTermText6;
    private static String longTermText7;
    private static String longTermText8;
    private static String longTermText9;

    //isChecked booleans for longTerm checkboxes
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

        //set toDo text boxes as the previous entries
        toDoEnterText1.setText(toDoText1);
        toDoEnterText2.setText(toDoText2);
        toDoEnterText3.setText(toDoText3);
        toDoEnterText4.setText(toDoText4);
        toDoEnterText5.setText(toDoText5);
        toDoEnterText6.setText(toDoText6);
        toDoEnterText7.setText(toDoText7);
        toDoEnterText8.setText(toDoText8);
        toDoEnterText9.setText(toDoText9);

        //set toDo checkboxes as previous completion state
        toDoCheck1.setSelected(toDoBox1);
        toDoCheck2.setSelected(toDoBox2);
        toDoCheck3.setSelected(toDoBox3);
        toDoCheck4.setSelected(toDoBox4);
        toDoCheck5.setSelected(toDoBox5);
        toDoCheck6.setSelected(toDoBox6);
        toDoCheck7.setSelected(toDoBox7);
        toDoCheck8.setSelected(toDoBox8);
        toDoCheck9.setSelected(toDoBox9);

        //set longTerm text boxes as the previous entries
        longTermEnterText1.setText(longTermText1);
        longTermEnterText2.setText(longTermText2);
        longTermEnterText3.setText(longTermText3);
        longTermEnterText4.setText(longTermText4);
        longTermEnterText5.setText(longTermText5);
        longTermEnterText6.setText(longTermText6);
        longTermEnterText7.setText(longTermText7);
        longTermEnterText8.setText(longTermText8);
        longTermEnterText9.setText(longTermText9);

        //set longTerm checkboxes as previous completion state
        longTermCheck1.setSelected(longTermBox1);
        longTermCheck2.setSelected(longTermBox2);
        longTermCheck3.setSelected(longTermBox3);
        longTermCheck4.setSelected(longTermBox4);
        longTermCheck5.setSelected(longTermBox5);
        longTermCheck6.setSelected(longTermBox6);
        longTermCheck7.setSelected(longTermBox7);
        longTermCheck8.setSelected(longTermBox8);
        longTermCheck9.setSelected(longTermBox9);

        //when diaryButton is clicked, change screen to Diary screen
        diaryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Diary frame = new Diary();
                frame.setVisible(true);
                frame.setSize(800,500);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });

        //when inspoButton is clicked, change screen to Inspo screen
        inspoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Inspo frame = new Inspo();
                frame.setVisible(true);
                frame.setSize(800,500);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            }
        });

        //when gameButton is clicked, change screen to Game screen
        gameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        //when logOutButton is clicked, change screen to EnterApp screen
        logOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EnterApp frame = new EnterApp();
                frame.setVisible(true);
                frame.setSize(800,500);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });

        //when the user inputs into a toDo text box, save the user input
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

        //when the user checks a toDo checkbox, save the status of the checkbox
        toDoCheck1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                toDoBox1 = toDoCheck1.isSelected();
            }
        });
        toDoCheck2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                toDoBox2 = toDoCheck2.isSelected();
            }
        });
        toDoCheck3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                toDoBox3 = toDoCheck3.isSelected();
            }
        });
        toDoCheck4.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                toDoBox4 = toDoCheck4.isSelected();
            }
        });
        toDoCheck5.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                toDoBox5 = toDoCheck5.isSelected();
            }
        });
        toDoCheck6.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                toDoBox6 = toDoCheck6.isSelected();
            }
        });
        toDoCheck7.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                toDoBox7 = toDoCheck7.isSelected();
            }
        });
        toDoCheck8.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                toDoBox8 = toDoCheck8.isSelected();
            }
        });
        toDoCheck9.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                toDoBox9 = toDoCheck9.isSelected();
            }
        });

        //when the user inputs into a longTerm text box, save the user input
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

        //when the user checks a longTerm checkbox, save the status of the checkbox
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

        //when clearButton is clicked, clear all the text in the text boxes and the checkboxes
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                toDoCheck1.setSelected(false);
                toDoCheck2.setSelected(false);
                toDoCheck3.setSelected(false);
                toDoCheck4.setSelected(false);
                toDoCheck5.setSelected(false);
                toDoCheck6.setSelected(false);
                toDoCheck7.setSelected(false);
                toDoCheck8.setSelected(false);
                toDoCheck9.setSelected(false);

                toDoEnterText1.setText("");
                toDoEnterText2.setText("");
                toDoEnterText3.setText("");
                toDoEnterText4.setText("");
                toDoEnterText5.setText("");
                toDoEnterText6.setText("");
                toDoEnterText7.setText("");
                toDoEnterText8.setText("");
                toDoEnterText9.setText("");

                longTermCheck1.setSelected(false);
                longTermCheck2.setSelected(false);
                longTermCheck3.setSelected(false);
                longTermCheck4.setSelected(false);
                longTermCheck5.setSelected(false);
                longTermCheck6.setSelected(false);
                longTermCheck7.setSelected(false);
                longTermCheck8.setSelected(false);
                longTermCheck9.setSelected(false);

                longTermEnterText1.setText("");
                longTermEnterText2.setText("");
                longTermEnterText3.setText("");
                longTermEnterText4.setText("");
                longTermEnterText5.setText("");
                longTermEnterText6.setText("");
                longTermEnterText7.setText("");
                longTermEnterText8.setText("");
                longTermEnterText9.setText("");
            }
        });
    }

}
