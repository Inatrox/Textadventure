package src.main.java.com.textadventure.models;// A class that inherits from Character and includes specific functions and properties for the player.

public class Player extends Character{

    public enum PlayerClasses
    {
        FIGHTER,
        MAGE,
        PALADIN,
        ROGUE
    }

    private final int fighterInitialHealth = 10;
    private final int fighterInitialStrength = 10;
    private final int fighterInitialIntelligence = 10;
    private final int fighterInitialEndurance = 10;
    private final int fighterInitialSpeed = 10;

    private final int mageInitialHealth = 10;
    private final int mageInitialStrength = 10;
    private final int mageInitialIntelligence = 10;
    private final int mageInitialEndurance = 10;
    private final int mageInitialSpeed = 10;

    private final int paladinInitialHealth = 10;
    private final int paladinInitialStrength = 10;
    private final int paladinInitialIntelligence = 10;
    private final int paladinInitialEndurance = 10;
    private final int paladinInitialSpeed = 10;

    private final int rougeInitialHealth = 10;
    private final int rougeInitialStrength = 10;
    private final int rougeInitialIntelligence = 10;
    private final int rougeInitialEndurance = 10;
    private final int rougeInitialSpeed = 10;

    public Player(PlayerClasses playerClass)
    {

    }
}
