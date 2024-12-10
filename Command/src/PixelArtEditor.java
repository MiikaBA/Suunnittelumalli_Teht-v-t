import java.util.Scanner;

public class PixelArtEditor {
    private static final int GRID_SIZE = 8;
    private int cursorX = 0;
    private int cursorY = 0;
    private boolean[][] grid = new boolean[getGridSize()][getGridSize()];

    public static void main(String[] args) {
        PixelArtEditor editor = new PixelArtEditor();
        editor.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printGrid();
            System.out.println("Commands: W=Up, S=Down, A=Left, D=Right, T=Toggle, G=Generate Code, Q=Quit");
            System.out.print("Enter command: ");
            String command = scanner.nextLine().toUpperCase();

            switch (command) {
                case "W":
                    executeCommand(new MoveCursorUpCommand(this));
                    break;
                case "S":
                    executeCommand(new MoveCursorDownCommand(this));
                    break;
                case "A":
                    executeCommand(new MoveCursorLeftCommand(this));
                    break;
                case "D":
                    executeCommand(new MoveCursorRightCommand(this));
                    break;
                case "T":
                    executeCommand(new TogglePixelCommand(this));
                    break;
                case "G":
                    executeCommand(new GenerateCodeCommand(this));
                    break;
                case "Q":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid command.");
            }
        }
    }

    private void printGrid() {
        System.out.println("\nCurrent Grid:");
        for (int y = 0; y < getGridSize(); y++) {
            for (int x = 0; x < getGridSize(); x++) {
                if (x == cursorX && y == cursorY) {
                    System.out.print(grid[y][x] ? "[1]" : "[0]");
                } else {
                    System.out.print(grid[y][x] ? " 1 " : " 0 ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private void executeCommand(Command command) {
        command.execute();
    }

    // Accessor and Mutator methods
    public boolean[][] getGrid() {
        return grid;
    }

    public int getCursorX() {
        return cursorX;
    }

    public int getCursorY() {
        return cursorY;
    }

    public void setCursorX(int cursorX) {
        this.cursorX = cursorX;
    }

    public void setCursorY(int cursorY) {
        this.cursorY = cursorY;
    }

    public void togglePixel() {
        grid[cursorY][cursorX] = !grid[cursorY][cursorX];
    }

	public static int getGridSize() {
		return GRID_SIZE;
	}
}
