package menti.ui;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Diary extends JFrame{
    private JButton newEntryButton;
    private JScrollPane diarySpace;
    private JButton toDoButton;
    private JButton diaryButton;
    private JButton inspoButton;
    private JButton gameButton;
    private JButton logOutButton;
    private JTextPane diaryTextSpace;
    private JPanel diaryPanel;
    private JTextPane diaryTextSpace2;
    private JTextPane diaryTextSpace3;
    private JTextPane diaryTextSpace4;
    private JTextPane diaryTextSpace5;
    private JTextPane diaryTextSpace6;
    private JTextPane diaryTextSpace7;

    public Diary() {
        setContentPane(diaryPanel);
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


        newEntryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = diaryTextSpace.getText();
                diaryTextSpace.setText(temp + "\n\n\n");
            }
        });

    }
}
