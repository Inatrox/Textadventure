package src.main.java.com.textadventure.views;

// This class could be responsible for the presentation of information and user interface elements.

import src.main.java.com.textadventure.models.Player;

public class GameView
{
    public static Player.PlayerClasses characterCreation()
    {
        Player.PlayerClasses playerClass;

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Which Class do you wanna Play: [F]ighter, [M]age, [P]aladin, [R]ouge");
        char selection = checkInput(new char[]{'F', 'M', 'P', 'R'});

        switch (selection)
        {
            case 'F':
                System.out.println("You choose the Fighter!");
                playerClass = Player.PlayerClasses.FIGHTER;
                return playerClass;

            case 'M':
                System.out.println("You choose the Mage!");
                playerClass = Player.PlayerClasses.MAGE;
                return playerClass;

            case 'P':
                System.out.println("You choose the Paladin!");
                playerClass = Player.PlayerClasses.PALADIN;
                return playerClass;

            case 'R':
                System.out.println("You choose Rogue!");
                playerClass = Player.PlayerClasses.ROGUE;
                return playerClass;
        }

        System.out.println("Invalid selection. Defaulting to Fighter.");
        return Player.PlayerClasses.FIGHTER;
    }

    public static char checkInput(char[] inputs)
    {
        return 'M';
    }
}