package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class GetRandomSentence
{
    public static String getSentence()
    {
        // Create list of sentences and then draw a number to get random sentence
        ArrayList<String> sentences = new ArrayList<>(Arrays.asList(
                "DATABASE DESIGNER",
                "CAR RENTAL",
                "RENAISSANCE MAN",
                "JUNIOR DEVELOPOER",
                "HOLIDAY DEPARTURE",
                "PREMIER LEAGUE MATCH",
                "BIG PAYOUT",
                "NEW PLAYER",
                "DIFFICULT SENTENCE",
                "LONG STORY",
                "GRAND THEFT AUTO",
                "SWEET DOGGY",
                "GARBAGE COLLECTOR",
                "CHRISTMAS",
                "IMPORTANT MEETING",
                "PROCEED",
                "BANK ROBBERY",
                "POLISH LEAGUE MATCH",
                "HELPFUL COLLEAGUE",
                "PHONE APP",
                "NEW PROJECT",
                "SOPHISTICATED",
                "NIGHT SHIFT",
                "NECESSARY",
                "COMPLEMENT",
                "WINE TASTING",
                "DORMITORY",
                "FORECASTER",
                "BUNGEE JUMP",
                "GRAPHIC DESIGN",
                "GERMAN SHEPHERD",
                "MINI COOPER",
                "ROCKET FUEL"
        ));
        int size = sentences.size();
        Random randomSentence = new Random();
        int randomId = randomSentence.nextInt(size);
        String returningSentence = sentences.get(randomId);
        return returningSentence;
    }
}
