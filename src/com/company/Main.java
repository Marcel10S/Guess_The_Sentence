package com.company;

import java.awt.*;

public class Main
{
    public static void main(String[] args)
    {
        // Main method induces method that creates our frame
        FrameTemplate gameFrame = new FrameTemplate();
        gameFrame.createTemplate();
        gameFrame.getContentPane().setBackground(new Color(255,239,213));
    }
}