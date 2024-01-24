package src.main.java.com.textadventure.models;// A class that inherits from Character and includes specific functions and properties for the player.


import java.util.HashMap;
import java.util.Map;

public class Player extends Character{

    public enum PlayerClasses
    {
        FIGHTER,
        MAGE,
        PALADIN,
        ROGUE
    }

    public Player(PlayerClasses playerClasses){
        if(playerClasses == PlayerClasses.FIGHTER){
            this.setHealth(3);
            this.setStrength(2);
            this.setIntelligence(1);
            this.setEndurance(2);
            this.setSpeed(1);
        }else if(playerClasses == PlayerClasses.MAGE){
            this.setHealth(1);
            this.setStrength(1);
            this.setIntelligence(3);
            this.setEndurance(1);
            this.setSpeed(2);
        }else if(playerClasses == PlayerClasses.PALADIN){
            this.setHealth(2);
            this.setStrength(2);
            this.setIntelligence(1);
            this.setEndurance(3);
            this.setSpeed(1);
        }else {
            this.setHealth(1);
            this.setStrength(1);
            this.setIntelligence(2);
            this.setEndurance(1);
            this.setSpeed(3);
        }
    }

    public Map<String, Integer> stats;

    public String getStats(){
        stats = new HashMap<>();
        stats.put("Health", this.getHealth());
        stats.put("Strength", this.getStrength());
        stats.put("Intelligence", this.getIntelligence());
        stats.put("Endurance", this.getEndurance());
        stats.put("Speed", this.getSpeed());
        return stats.toString();
    }
}
