package menti.ui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inspo extends JFrame{

    //items on user interface
    private JPanel inspoPanel;
    private JButton toDoButton;
    private JButton diaryButton;
    private JButton inspoButton;
    private JButton fidgetButton;
    private JLabel inspoLabel;
    private JButton generateInspoButton;
    private JButton logOutButton;

    private String[] quotes = {"When you have a dream, you've got to grab it and never let go", "Nothing is impossible, the word itself says I'm possible!",
                                "It is often the small steps, not the giant leaps, that bring about the most lasting change.",
                                "If you want to lift yourself up, lift up someone else.", "Attitude is the 'little' thing that makes a big difference",
                                "We will fail when we fail to try.", "All our dreams can come true, if we have the courage to pursue them",
                                "Once you face your fear, nothing is ever as hard as you think.", "A person who never made a mistake never tried anything new",
                                "We can't help everyone, but everyone can help someone.", "Tough times never last, but tough people do.",
                                "Go confidently in the direction of your dreams. Live the life you have imagined", "Act as if what you do makes a difference. IT DOES.",
                                "There is nothing impossible to they who will try.", "Success is not final, failure is not fatal: it is the COURAGE TO CONTINUE that counts.",
                                "The most difficult thing is the decision to act; the rest is merely tenacity", "Never bend your head. Always hold it high. Look the world straight in the eye",
                                "What you get by achieving your goals is not as important as what you become by achieving your goals.",
                                "Where there's hope there's life. It fills us with fresh courage and makes us strong again.",
                                "Believe you can and you're halfway there.", "It is during our darkest moments that we must focus to see the light",
                                "Once you replace negative thoughts with positive ones, you'll start having positive results.",
                                "In the long run, you make your own luck-good, bad, or indifferent.", "I can't change the direction of the wind, but I can adjust my sails to reach my destination.",
                                "Life is like riding a bicycle. To keep your balance, you must keep moving"};

    public Inspo() {

        setContentPane(inspoPanel);

        //when toDoButton is clicked, change screen to ToDo screen
        toDoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ToDo frame = new ToDo();
                frame.setVisible(true);
                frame.setSize(800,500);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });

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

        //when fidgetButton is clicked, change screen to Fidget screen
        fidgetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fidget frame = new Fidget();
                frame.setVisible(true);
                frame.setSize(800,500);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        });

        //when generateInspoButton is clicked, change the quote text to a random quote in quotes
        generateInspoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inspoLabel.setText(quotes[(int)(Math.random() * 26)]);
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
    }

}
