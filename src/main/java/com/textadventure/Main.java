package src.main.java.com.textadventure;
import src.main.java.com.textadventure.controllers.GameController;

// The main class that launches the application and initializes various components.

public class Main
{
    public static void main(String[] args)
    {
        GameController Game = new GameController();

        Game.startGame();
    }
}