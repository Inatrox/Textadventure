package src.main.java.com.textadventure.models;

// An abstract base class for all characters in the game, including player characters and non-player characters (NPCs).
public class Character
{
    private int health;
    private int strength;
    private int intelligence;
    private int endurance;
    private int speed;

    public Character() {}

    public void setHealth(int healthValue)
    {
        this.health = healthValue;
    }

    public void setStrength(int stregthValue)
    {
        this.strength = stregthValue;
    }

    public void setIntelligence(int intelligenceValue)
    {
        this.intelligence = intelligenceValue;
    }

    public void setEndurance(int enduranceValue)
    {
        endurance = enduranceValue;
    }

    public void setSpeed(int speedValue)
    {
        speed = speedValue;
    }

    public int getHealth()
    {
        return this.health;
    }

    public int getStrength()
    {
        return this.strength;
    }

    public int getIntelligence()
    {
        return intelligence;
    }

    public int getEndurance()
    {
        return endurance;
    }

    public int getSpeed()
    {
        return speed;
    }
}