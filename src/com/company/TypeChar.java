package com.company;

public class TypeChar
{
    public static String typeChar(String sentence, char[] typedChar, String actualSentence)
    {
        boolean isGuessedChar = false;
        char[] acualSentenceToArray = actualSentence.toCharArray();
        char[] sentenceToArray = sentence.toCharArray();
        String answer = "";
        typedChar[0] = Character.toUpperCase(typedChar[0]);
        if (typedChar.length != 1)
        {
            System.out.println("invalid character entered");
            System.out.println("Only the first selected character will be taken into account");
        }
        for (int i = 0; i < sentenceToArray.length; i++)
        {
            if (typedChar[0] == sentenceToArray[i] && acualSentenceToArray[i] == '-')
            {
                answer += String.valueOf(typedChar[0]);
                isGuessedChar = true;
            }
            else if (sentenceToArray[i] == ' ')
            {
                answer += ' ';
            }
            else if (acualSentenceToArray[i] == '-')
            {
                answer += '-';
            }
            else if (typedChar[0] != sentenceToArray[i] && acualSentenceToArray[i] != '-')
            {
                answer += String.valueOf(sentenceToArray[i]);
            }
        }
        if (isGuessedChar)
        {
            TryCounter.countGuesses();
            return answer;
        }

        else
        {
            TryCounter.countLives(sentence);
            return "bad luck";
        }
    }
}