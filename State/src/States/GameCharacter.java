package States;

public class GameCharacter {
    private String name;
    private int experience;
    private int health;
    private IState state;

    public GameCharacter(String name) {
        this.name = name;
        this.experience = 0;
        this.health = 100;
        this.state = new NoviceState();  // Start at novice level
    }

    public void setState(IState state) {
        this.state = state;
    }
    
    public IState getState() {
    	return this.state;
    }

    public void increaseExperience(int points) {
        experience += points;
        System.out.println(name + " gained " + points + " experience points. Total experience: " + experience);
    }

    public void increaseHealth(int points) {
        health += points;
        System.out.println(name + " gained " + points + " health points. Total health: " + health);
    }

    public void decreaseHealth(int points) {
        health -= points;
        System.out.println(name + " lost " + points + " health points. Total health: " + health);
    }

    public int getExperience() {
        return experience;
    }

    public int getHealth() {
        return health;
    }

    public String getName() {
        return name;
    }

    public void train() {
        state.train(this);
    }

    public void meditate() {
        state.meditate(this);
    }

    public void fight() {
        state.fight(this);
    }

    public void showStatus() {
        System.out.println("\n" + name + "'s current status:");
        System.out.println("Experience: " + experience);
        System.out.println("Health: " + health);
        System.out.println("Current State: " + state.getClass().getSimpleName());
        System.out.println("Available actions: train, meditate, fight\n");
    }
}

