package com.company;

import javax.swing.*;

public class RestartGame extends JFrame
{
    public static int gamesCounter = 1;
    public static void reset()
    {
        int answer = JOptionPane.showConfirmDialog(null,"Do you want to restart game?","restart game?",JOptionPane.YES_NO_OPTION);
        if (answer == JOptionPane.YES_OPTION)
        {
            if (TryCounter.lives > 0)
            {
                gamesCounter++;
            }
            else
            {
                gamesCounter = 1;
                TryCounter.guesses = 0;
            }
            TryCounter.lives = 10;
            AlertMessages.startNewGame();

        }
        else if (answer == JOptionPane.NO_OPTION || answer == JOptionPane.CLOSED_OPTION)
        {
            AlertMessages.exitGame();
            System.out.println("thanks for playing my game <3");
        }
    }
}
