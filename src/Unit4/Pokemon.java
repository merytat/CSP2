package Unit4;

public class Pokemon {
    private String name;
    private int health;
    private int speed;
    private String species;

    public Pokemon(String name, int health, int speed, String species) {
        this.name = name;
        this.health = health;
        this.speed = speed;
        this.species = species;
    }

    @Override
    public String toString(){
        return String.format("%-15s %-15s %-15s %-15s",
                name, health, speed, species + "\n");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
