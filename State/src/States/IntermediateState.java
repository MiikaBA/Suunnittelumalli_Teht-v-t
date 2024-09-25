package States;

public class IntermediateState implements IState {

    @Override
    public void train(GameCharacter character) {
        System.out.println("Intermediate is training...");
        character.increaseExperience(20);
        checkForLevelUp(character);
    }

    @Override
    public void meditate(GameCharacter character) {
        System.out.println("Intermediate is meditating...");
        character.increaseHealth(15);
    }

    @Override
    public void fight(GameCharacter character) {
        System.out.println("Intermediate can't fight yet!");
    }

    private void checkForLevelUp(GameCharacter character) {
        if (character.getExperience() >= 150) {
            character.setState(new ExpertState());
            System.out.println("Character has leveled up to Expert!");
        }
    }
}

