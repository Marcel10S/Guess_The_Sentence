package com.company;

public class ActionListenerForSentenceButton
{
    public static void actionListenerForSentenceButton
            (String sentence)
    {
        String typedSentence = FrameTemplate.typeSentence.getText();
        if (TypeSentence.typeSentence(sentence, typedSentence))
        {
            TryCounter.countGuesses();
            UnhideReactionField.unhide(FrameTemplate.reactionField);
            AlertMessages.finishMessage(sentence);
        }
        else if (TryCounter.lives > 1) // bigger than one because lives decrementation is later in code
        {
            TryCounter.countLives(sentence);
            UnhideReactionField.unhide(FrameTemplate.reactionField);
            AlertMessages.uncorrectTypedSentence();
        }
        else AlertMessages.endGameAlert(sentence);
    }
}
