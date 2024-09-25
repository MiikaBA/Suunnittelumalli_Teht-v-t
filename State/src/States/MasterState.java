package States;

public class MasterState implements IState {

    @Override
    public void train(GameCharacter character) {
        System.out.println("Master has no need to train.");
    }

    @Override
    public void meditate(GameCharacter character) {
        System.out.println("Master is at peace.");
    }

    @Override
    public void fight(GameCharacter character) {
        System.out.println("Master has transcended fighting.");
    }
}

