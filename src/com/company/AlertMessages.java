package com.company;

public class AlertMessages
{
    public static void finishMessage(String sentence)
    {
        FrameTemplate.yourHiddenSentence.setText("Congratulations! You guessed that sentence!");
        FrameTemplate.hiddenSentence.setText(sentence);
        FrameTemplate.reactionField.setText("Do you want to play one more? ");
        RestartGame.reset();
    }
    public static void uncorrectTypedSentence()
    {
        FrameTemplate.reactionField.setText("Unfortunately this is not a correct sentence.");
    }
    public static void correctTypedChar(String returnedCharType, char[] typeCharacter)
    {
        FrameTemplate.hiddenSentence.setText(returnedCharType);
        FrameTemplate.reactionField.setText("Nice feeling about '" + typeCharacter[0] + "'. This letter is suitable.");
    }
    public static void uncorrectTypedChar(char[] typeCharacter)
    {
        FrameTemplate.reactionField.setText("Wrong char '" + typeCharacter[0] + "' ! Or char is already used!");
    }
    public static void startNewGame()
    {
        FrameTemplate.sentence = GetRandomSentence.getSentence();
        FrameTemplate.hiddenSentence.setText(HideSentences.hideSentence(FrameTemplate.sentence));
        FrameTemplate.trialsCounter.setText("You have 10 lives and " + TryCounter.guesses + " good guesses in " + RestartGame.gamesCounter + " game.");
        FrameTemplate.yourHiddenSentence.setText("Your Hidden Sentence.");
        FrameTemplate.reactionField.setVisible(false);
        FrameTemplate.typeSentence.setText("");
        FrameTemplate.typeChar.setText(null);
    }
    public static void countGuessesOrLives( int lives, int guesses)
    {
        FrameTemplate.trialsCounter.setText("You have " + lives + " lives and " + guesses + " good guesses in " + RestartGame.gamesCounter + " game.");
    }
    public static void endGameAlert(String sentence)
    {
        FrameTemplate.reactionField.setText("Do you want to play one more? ");
        FrameTemplate.trialsCounter.setText("unfortunately you don't guess your sentence, next time it will be better :)");
        FrameTemplate.hiddenSentence.setText(sentence);
        RestartGame.reset();
    }
    public static void exitGame()
    {
        FrameTemplate.reactionField.setText("your stats are " + TryCounter.guesses/RestartGame.gamesCounter + " correct moves per game.");
    }
}
