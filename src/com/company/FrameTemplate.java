package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameTemplate extends JFrame implements ActionListener
{
    public static String sentence;
    public static JTextField typeSentence, typeChar;
    public static JLabel hiddenSentence, yourHiddenSentence, reactionField, trialsCounter;
    public static JButton buttonForChar, buttonForSentence;
    public void createTemplate()
    {
        // Simple data about our frame
        setSize(1000,700);
        setTitle("Guess the sentence - Create by Marcel Stulczewski");
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add some Labels and Buttons...
        //left upper corner button that informs you about how many lives do you have
        trialsCounter = new JLabel("You have 10 lives and 0 good guesses in 1 game");
        trialsCounter.setBounds(10,10,1000,40);
        trialsCounter.setFont(new Font("Palatino",Font.BOLD,25));
        add(trialsCounter);

        //This is some type of ititle
        yourHiddenSentence = new JLabel("Your Hidden Sentence", SwingConstants.CENTER);
        yourHiddenSentence.setBounds(80,110,840,80);
        yourHiddenSentence.setFont(new Font("Palatino",Font.BOLD,40));
        add(yourHiddenSentence);

        sentence = GetRandomSentence.getSentence();

        //This is text field that shows ours sentence in progress of guessing
        hiddenSentence = new JLabel();
        hiddenSentence.setHorizontalAlignment(JLabel.CENTER);
        hiddenSentence.setText(HideSentences.hideSentence(sentence));
        hiddenSentence.setBounds(140,210,720,80);
        hiddenSentence.setFont(new Font("Palatino",Font.BOLD,40));
        add(hiddenSentence);

        // some not action fields
        JLabel guessChar = new JLabel("Guess a char -");
        guessChar.setBounds(60,318,200,80);
        guessChar.setFont(new Font("Palatino",Font.PLAIN,28));
        add(guessChar);

        JLabel guessSentence = new JLabel("Try to type sentence -  ");
        guessSentence.setBounds(60,398,380,80);
        guessSentence.setFont(new Font("Palatino", Font.PLAIN, 28));
        add(guessSentence);

        //text field for typed char
        typeChar = new JTextField();
        typeChar.setBounds(252,340,60,40);
        typeChar.setFont(new Font("Verdana",Font.PLAIN, 22));
        typeChar.setHorizontalAlignment(JTextField.CENTER);
        typeChar.setBackground(new Color(255,240,245));
        add(typeChar);
        //text field for whole sentence
        typeSentence = new JTextField();
        typeSentence.setBounds(334,420,250,40);
        typeSentence.setFont(new Font("Verdana", Font.PLAIN, 22));
        typeSentence.setHorizontalAlignment(JTextField.CENTER);
        typeSentence.setBackground(new Color(255,240,245));
        add(typeSentence);

        //actions buttons
        buttonForChar = new JButton();
        buttonForChar.setBounds(700,340,250,40);
        buttonForChar.setFont(new Font("Palatino", Font.BOLD, 22));
        buttonForChar.setText("Try this Char");
        buttonForChar.addActionListener(this);
        buttonForChar.setBackground(new Color(255,240,245));
        add(buttonForChar);

        buttonForSentence = new JButton();
        buttonForSentence.setBounds(700,420,250,40);
        buttonForSentence.setFont(new Font("Palatino", Font.BOLD, 22));
        buttonForSentence.setText("Try to type sentence");
        buttonForSentence.addActionListener(this);
        buttonForSentence.setBackground(new Color(255,240,245));
        add(buttonForSentence);

        //field that informs us is our types are correct or not
        reactionField = new JLabel();
        reactionField.setBounds(80,520,840,80);
        reactionField.setFont(new Font("Palatino", Font.BOLD, 40));
        reactionField.setHorizontalAlignment(JLabel.CENTER);
        reactionField.setVisible(false);
        add(reactionField);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        if (source == buttonForSentence)
        {
            ActionListenerForSentenceButton.actionListenerForSentenceButton(sentence);
        }
        else if (source == buttonForChar)
        {
            ActionListenerForCharButton.actionListenerForCharButton(sentence);
        }
    }
}