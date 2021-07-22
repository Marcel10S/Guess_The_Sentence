package com.company;

public class HideSentences
{
    public static String hideSentence(String sentence)
    {
        String answer = "";
        char[] sentenceToChars = sentence.toCharArray();
        for (int i = 0; i < sentence.length(); i++)
        {
            if (sentenceToChars[i] != ' ')
            {
                answer += '-';
            }
            else
            {
                answer += ' ';
            }
        }
        return answer;
    }
}