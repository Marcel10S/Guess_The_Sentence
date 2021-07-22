package com.company;

public class TryCounter
{
    public static int lives = 10;
    public static int guesses = 0;
    public static void countGuesses()
    {
        guesses++;
        AlertMessages.countGuessesOrLives(lives,guesses);
    }
    public static void countLives(String sentence)
    {
        lives--;
        if (lives > 0)
        {
            AlertMessages.countGuessesOrLives(lives,guesses);
        }
        else
        {
            AlertMessages.endGameAlert(sentence);
            //powinno odkrywać hasło
        }
    }
}
