package com.company;

public class TypeSentence
{
    public static boolean typeSentence(String sentence, String typedSentence)
    {
        sentence = sentence.toUpperCase();
        typedSentence = typedSentence.toUpperCase();

        if (sentence.contains(typedSentence) && sentence.length() == typedSentence.length())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
