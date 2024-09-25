package States;

public class NoviceState implements IState {

    @Override
    public void train(GameCharacter character) {
        System.out.println("Novice is training...");
        character.increaseExperience(10);
        checkForLevelUp(character);
    }

    @Override
    public void meditate(GameCharacter character) {
        System.out.println("Novice can't meditate!");
    }

    @Override
    public void fight(GameCharacter character) {
        System.out.println("Novice can't fight!");
    }

    private void checkForLevelUp(GameCharacter character) {
        if (character.getExperience() >= 50) {
            character.setState(new IntermediateState());
            System.out.println("Character has leveled up to Intermediate!");
        }
    }
}

