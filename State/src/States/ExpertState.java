package States;

public class ExpertState implements IState {

    @Override
    public void train(GameCharacter character) {
        System.out.println("Expert is training...");
        character.increaseExperience(30);
        checkForLevelUp(character);
    }

    @Override
    public void meditate(GameCharacter character) {
        System.out.println("Expert is meditating...");
        character.increaseHealth(25);
    }

    @Override
    public void fight(GameCharacter character) {
        System.out.println("Expert is fighting...");
        character.decreaseHealth(20);
        character.increaseExperience(40);
        checkForLevelUp(character);
    }

    private void checkForLevelUp(GameCharacter character) {
        if (character.getExperience() >= 300) {
            character.setState(new MasterState());
            System.out.println("Character has leveled up to Master!");
        }
    }
}

