package com.company;

public class ActionListenerForCharButton
{
    public static void actionListenerForCharButton(String sentence)
    {
        String actualSentence = FrameTemplate.hiddenSentence.getText();
        String typedCharString = FrameTemplate.typeChar.getText();
        typedCharString.toUpperCase();
        char[] typeCharacter = typedCharString.toCharArray();
        sentence.toUpperCase();
        String returnedCharType = TypeChar.typeChar(sentence, typeCharacter, actualSentence);
        if (returnedCharType.equals(sentence))
        {
            UnhideReactionField.unhide(FrameTemplate.reactionField);
            AlertMessages.finishMessage(sentence);
        }
        else if (returnedCharType != "bad luck")
        {
            UnhideReactionField.unhide(FrameTemplate.reactionField);
            AlertMessages.correctTypedChar(returnedCharType,typeCharacter);
        }
        else
        {
            UnhideReactionField.unhide(FrameTemplate.reactionField);
            if (TryCounter.lives > 0) AlertMessages.uncorrectTypedChar(typeCharacter);
        }
    }
}
