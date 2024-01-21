package src.main.java.com.textadventure.views;

// This class could be responsible for the presentation of information and user interface elements.

import src.main.java.com.textadventure.models.Player;

import java.util.List;
import java.util.Scanner;

public class GameView
{
    public static Player.PlayerClasses characterCreation()
    {
        Player.PlayerClasses playerClass;

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Which Class do you wanna Play: [F]ighter, [M]age, [P]aladin, [R]ouge");
        char selection = checkInput(List.of('F', 'M', 'P', 'R'));

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

    public static char checkInput(List inputs)
    {
        while(true){
            Scanner sc=new Scanner(System.in);
            String selection = sc.nextLine().toUpperCase();
            boolean b = selection.length() == 1 && inputs.contains(selection.toUpperCase().charAt(0));
            if(b){
                return selection.charAt(0);
            }
            else {
                System.out.println("Invalid input, Please try again");
            }
        }
    }
}