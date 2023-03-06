import java.util.Random;

public class Dice extends Game{

    private int[] results;
    private final int goal = 18;

    @Override
    void initializeGame() {
        results = new int[playersCount];
        for(int i = 0;i<results.length;i++){
            results[i] = 0;
        }
    }

    @Override
    void makePlay(int player) {
        Random rn = new Random();
        int diceThrow = rn.nextInt(6) + 1;

        results[player] = results[player] + diceThrow;
    }

    @Override
    boolean endOfGame() {
        for(int i = 0;i<results.length;i++){
            if(results[i] >= goal){
                return true;
            }
        }
        return false;
    }

    @Override
    void printWinner() {
        System.out.println("The winner is player number: " + getWinner());
    }

    private int getWinner(){
        int winner = 68;
        for(int i = 0;i<results.length;i++){
            if(results[i] >= goal){
                winner = i;
            }
        }
        return winner + 1;
    }
}
