package menti.ui;

import javax.swing.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Diary extends JFrame{

    //items on user interface
    private JButton newEntryButton;
    private JButton toDoButton;
    private JButton diaryButton;
    private JButton inspoButton;
    private JButton fidgetButton;
    private JButton logOutButton;
    private JTextPane diaryTextSpace1;
    private JPanel diaryPanel;
    private JTextPane diaryTextSpace2;
    private JTextPane diaryTextSpace3;
    private JTextPane diaryTextSpace4;
    private JTextPane diaryTextSpace5;
    private JTextPane diaryTextSpace6;
    private JTextPane diaryTextSpace7;
    private JButton clearDiaryButton;
    private JLabel happyLabel;
    private JLabel mehLabel;
    private JLabel sadLabel;
    private JSlider slider1;
    private JSlider slider2;
    private JSlider slider3;
    private JSlider slider4;
    private JSlider slider5;
    private JSlider slider6;
    private JSlider slider7;
    private JButton summaryButton;
    private JLabel mondayLabel;
    private JLabel tuesdayLabel;
    private JLabel wednesdayLabel;
    private JLabel thursdayLabel;
    private JLabel fridayLabel;
    private JLabel saturdayLabel;
    private JLabel sundayLabel;

    //text content of diary entries
    private static String text1;
    private static String text2;
    private static String text3;
    private static String text4;
    private static String text5;
    private static String text6;
    private static String text7;

    //visibility of the text boxes
    private static boolean visibility1;
    private static boolean visibility2;
    private static boolean visibility3;
    private static boolean visibility4;
    private static boolean visibility5;
    private static boolean visibility6;
    private static boolean visibility7;

    //slider status
    private static int val1;
    private static int val2;
    private static int val3;
    private static int val4;
    private static int val5;
    private static int val6;
    private static int val7;

    //visibility of day labels
    private static boolean dayVisibility1;
    private static boolean dayVisibility2;
    private static boolean dayVisibility3;
    private static boolean dayVisibility4;
    private static boolean dayVisibility5;
    private static boolean dayVisibility6;
    private static boolean dayVisibility7;

    private int count = 1;

    public Diary() {

        setContentPane(diaryPanel);

        //set text content as previous diary entries
        diaryTextSpace1.setText(text1);
        diaryTextSpace2.setText(text2);
        diaryTextSpace3.setText(text3);
        diaryTextSpace4.setText(text4);
        diaryTextSpace5.setText(text5);
        diaryTextSpace6.setText(text6);
        diaryTextSpace7.setText(text7);

        //set slider value to previous value
        slider1.setValue(val1);
        slider2.setValue(val2);
        slider3.setValue(val3);
        slider4.setValue(val4);
        slider5.setValue(val5);
        slider6.setValue(val6);
        slider7.setValue(val7);

        //hide day labels
        mondayLabel.setVisible(dayVisibility1);
        tuesdayLabel.setVisible(dayVisibility2);
        wednesdayLabel.setVisible(dayVisibility3);
        thursdayLabel.setVisible(dayVisibility4);
        fridayLabel.setVisible(dayVisibility5);
        saturdayLabel.setVisible(dayVisibility6);
        sundayLabel.setVisible(dayVisibility7);

        //save text content of diary entries
        diaryTextSpace1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                text1 = diaryTextSpace1.getText();
            }
        });
        diaryTextSpace2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                text2 = diaryTextSpace2.getText();
            }
        });
        diaryTextSpace3.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                text3 = diaryTextSpace3.getText();
            }
        });
        diaryTextSpace4.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                text4 = diaryTextSpace4.getText();
            }
        });
        diaryTextSpace5.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                text5 = diaryTextSpace5.getText();
            }
        });
        diaryTextSpace6.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                text6 = diaryTextSpace6.getText();
            }
        });
        diaryTextSpace7.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                text7 = diaryTextSpace7.getText();
            }
        });

        //save slider status
        slider1.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                val1 = slider1.getValue();
            }
        });
        slider2.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                val2 = slider2.getValue();
            }
        });
        slider3.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                val3 = slider3.getValue();
            }
        });
        slider4.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                val4 = slider4.getValue();
            }
        });
        slider5.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                val5 = slider5.getValue();
            }
        });
        slider6.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                val6 = slider6.getValue();
            }
        });
        slider7.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                val7 = slider7.getValue();
            }
        });

        //when inspoButton is clicked, change the screen to Inspo screen
        inspoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Inspo frame = new Inspo();
                frame.setVisible(true);
                frame.setSize(800,500);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });

        //when fidgetButton is clicked, change the screen to Fidget Screen
        fidgetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fidget frame = new Fidget();
                frame.setVisible(true);
                frame.setSize(800,500);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });

        //when logOutButton is clicked, change the screen to EnterApp screen
        logOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EnterApp frame = new EnterApp();
                frame.setVisible(true);
                frame.setSize(800,500);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });

        //when toDoButton is clicked, change the screen to ToDo screen
        toDoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ToDo frame = new ToDo();
                frame.setVisible(true);
                frame.setSize(800,500);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });

        //set visibility of emotion labels
        happyLabel.setVisible(visibility1);
        mehLabel.setVisible(visibility1);
        sadLabel.setVisible(visibility1);

        //hide text boxes and slider
        diaryTextSpace1.setVisible(visibility1);
        slider1.setVisible(visibility1);

        diaryTextSpace2.setVisible(visibility2);
        slider2.setVisible(visibility2);

        diaryTextSpace3.setVisible(visibility3);
        slider3.setVisible(visibility3);

        diaryTextSpace4.setVisible(visibility4);
        slider4.setVisible(visibility4);

        diaryTextSpace5.setVisible(visibility5);
        slider5.setVisible(visibility5);

        diaryTextSpace6.setVisible(visibility6);
        slider6.setVisible(visibility6);

        diaryTextSpace7.setVisible(visibility7);
        slider7.setVisible(visibility7);

        //when newEntryButton is clicked set the visibility of the text box, slider, and emotion labels to true
        newEntryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (count == 1) {
                    visibility1 = true;
                    diaryTextSpace1.setVisible(visibility1);
                    slider1.setVisible(visibility1);
                    happyLabel.setVisible(visibility1);
                    mehLabel.setVisible(visibility1);
                    sadLabel.setVisible(visibility1);
                    mondayLabel.setVisible(true);
                    dayVisibility1 = true;
                } else if (count == 2) {
                    visibility2 = true;
                    diaryTextSpace2.setVisible(visibility2);
                    slider2.setVisible(visibility2);
                    tuesdayLabel.setVisible(true);
                    dayVisibility2 = true;
                } else if (count == 3) {
                    visibility3 = true;
                    diaryTextSpace3.setVisible(visibility3);
                    slider3.setVisible(visibility3);
                    wednesdayLabel.setVisible(true);
                    dayVisibility3 = true;
                } else if (count == 4) {
                    visibility4 = true;
                    diaryTextSpace4.setVisible(visibility4);
                    slider4.setVisible(visibility4);
                    thursdayLabel.setVisible(true);
                    dayVisibility4 = true;
                } else if (count == 5) {
                    visibility5 = true;
                    diaryTextSpace5.setVisible(visibility5);
                    slider5.setVisible(visibility5);
                    fridayLabel.setVisible(true);
                    dayVisibility5 = true;
                } else if (count == 6) {
                    visibility6 = true;
                    diaryTextSpace6.setVisible(visibility6);
                    slider6.setVisible(visibility6);
                    saturdayLabel.setVisible(true);
                    dayVisibility6 = true;
                } else if (count == 7) {
                    visibility7 = true;
                    diaryTextSpace7.setVisible(visibility7);
                    slider7.setVisible(visibility7);
                    sundayLabel.setVisible(true);
                    dayVisibility7 = true;
                }
                count++;
            }
        });

        //when clearDiaryButton is clicked, clear the text content of the diary entries
        clearDiaryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                count = 1;

                diaryTextSpace1.setText("");
                diaryTextSpace2.setText("");
                diaryTextSpace3.setText("");
                diaryTextSpace4.setText("");
                diaryTextSpace5.setText("");
                diaryTextSpace6.setText("");
                diaryTextSpace7.setText("");

                slider1.setValue(50);
                slider2.setValue(50);
                slider3.setValue(50);
                slider4.setValue(50);
                slider5.setValue(50);
                slider6.setValue(50);
                slider7.setValue(50);

                visibility1 = false;
                visibility2 = false;
                visibility3 = false;
                visibility4 = false;
                visibility5 = false;
                visibility6 = false;
                visibility7 = false;

                diaryTextSpace1.setVisible(visibility1);
                slider1.setVisible(visibility1);
                happyLabel.setVisible(visibility1);
                mehLabel.setVisible(visibility1);
                sadLabel.setVisible(visibility1);

                diaryTextSpace2.setVisible(visibility2);
                slider2.setVisible(visibility2);

                diaryTextSpace3.setVisible(visibility3);
                slider3.setVisible(visibility3);

                diaryTextSpace4.setVisible(visibility4);
                slider4.setVisible(visibility4);

                diaryTextSpace5.setVisible(visibility5);
                slider5.setVisible(visibility5);

                diaryTextSpace6.setVisible(visibility6);
                slider6.setVisible(visibility6);

                diaryTextSpace7.setVisible(visibility7);
                slider7.setVisible(visibility7);

                mondayLabel.setVisible(false);
                tuesdayLabel.setVisible(false);
                wednesdayLabel.setVisible(false);
                thursdayLabel.setVisible(false);
                fridayLabel.setVisible(false);
                saturdayLabel.setVisible(false);
                sundayLabel.setVisible(false);

                dayVisibility1 = false;
                dayVisibility2 = false;
                dayVisibility3 = false;
                dayVisibility4 = false;
                dayVisibility5 = false;
                dayVisibility6 = false;
                dayVisibility7 = false;
            }
        });

        //when summaryButton is clicked, summarize and score the emotions of the users
        summaryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sum = 0;
                int numDaysEntered = 0;
                if(slider1.isVisible() == true){
                    sum += slider1.getValue();
                    numDaysEntered ++;
                }
                if(slider2.isVisible() == true){
                    sum += slider2.getValue();
                    numDaysEntered ++;
                }
                if(slider3.isVisible() == true) {
                    sum += slider3.getValue();
                    numDaysEntered++;
                }
                if(slider4.isVisible() == true){
                    sum += slider4.getValue();
                    numDaysEntered ++;
                }
                if(slider5.isVisible() == true){
                    sum += slider5.getValue();
                    numDaysEntered ++;
                }
                if(slider6.isVisible() == true){
                    sum += slider6.getValue();
                    numDaysEntered ++;
                }
                if(slider7.isVisible() == true){
                    sum += slider7.getValue();
                    numDaysEntered ++;
                }

                //total score divided by the number of entries
                int summaryScore = sum / numDaysEntered;
                JOptionPane.showMessageDialog(summaryButton, "Your happiness score for the week is: " + summaryScore + " out of " + 100);
            }
        });
    }

}
