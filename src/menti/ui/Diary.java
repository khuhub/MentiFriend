package menti.ui;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Diary extends JFrame{
    private JButton newEntryButton;
    private JScrollPane diarySpace;
    private JButton toDoButton;
    private JButton diaryButton;
    private JButton inspoButton;
    private JButton gameButton;
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

    private static String text1;
    private static String text2;
    private static String text3;
    private static String text4;
    private static String text5;
    private static String text6;
    private static String text7;

    private static boolean visibility1;
    private static boolean visibility2;
    private static boolean visibility3;
    private static boolean visibility4;
    private static boolean visibility5;
    private static boolean visibility6;
    private static boolean visibility7;



    private int count = 1;

    public Diary() {
        setContentPane(diaryPanel);

        diaryTextSpace1.setText(text1);
        diaryTextSpace2.setText(text2);
        diaryTextSpace3.setText(text3);
        diaryTextSpace4.setText(text4);
        diaryTextSpace5.setText(text5);
        diaryTextSpace6.setText(text6);
        diaryTextSpace7.setText(text7);

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

        toDoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ToDo frame = new ToDo();
                frame.setVisible(true);
                frame.setSize(800,500);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });

        diaryTextSpace1.setVisible(visibility1);
        diaryTextSpace2.setVisible(visibility2);
        diaryTextSpace3.setVisible(visibility3);
        diaryTextSpace4.setVisible(visibility4);
        diaryTextSpace5.setVisible(visibility5);
        diaryTextSpace6.setVisible(visibility6);
        diaryTextSpace7.setVisible(visibility7);


        newEntryButton.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
                if(count == 1) {
                    visibility1 = true;
                    diaryTextSpace1.setVisible(visibility1);
                } else if(count == 2){
                    visibility2 = true;
                    diaryTextSpace2.setVisible(visibility2);
                } else if(count == 3){
                    visibility3 = true;
                    diaryTextSpace3.setVisible(visibility3);
                } else if(count == 4){
                    visibility4 = true;
                    diaryTextSpace4.setVisible(visibility4);
                } else if(count == 5) {
                    visibility5 = true;
                    diaryTextSpace5.setVisible(visibility5);
                } else if(count == 6){
                    visibility6 = true;
                    diaryTextSpace6.setVisible(visibility6);
                } else if(count == 7){
                    visibility7 = true;
                    diaryTextSpace7.setVisible(visibility7);
                }

                count ++;

            }



        });


        clearDiaryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                diaryTextSpace1.setText("");
                diaryTextSpace2.setText("");
                diaryTextSpace3.setText("");
                diaryTextSpace4.setText("");
                diaryTextSpace5.setText("");
                diaryTextSpace6.setText("");
                diaryTextSpace7.setText("");

            }
        });
    }
}
