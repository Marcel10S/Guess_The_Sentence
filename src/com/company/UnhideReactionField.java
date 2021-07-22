package com.company;

import javax.swing.*;

public class UnhideReactionField
{
    public static void unhide (JLabel reactionField)
    {
        if (!reactionField.isVisible())
        {
            reactionField.setVisible(true);
        }
    }
}
