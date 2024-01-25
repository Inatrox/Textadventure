package src.main.java.com.textadventure.controllers;
import src.main.java.com.textadventure.models.Player;
import src.main.java.com.textadventure.views.GameView;

// This class could control the game flow, process user inputs, and make decisions. It interacts with the models and views.

public class GameController {
    private Player.PlayerClasses playerClass;
    private Player player;

    public void startGame()
    {
       // GameView.startIntro
       createCharacter();
    }


    public void createCharacter() {
        player = new Player(GameView.characterCreation());
        System.out.println("These are your stats \n " + player.getStats());
    }



}
