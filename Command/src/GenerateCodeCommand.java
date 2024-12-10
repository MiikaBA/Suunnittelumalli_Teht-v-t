

class GenerateCodeCommand implements Command {
    private PixelArtEditor editor;

    public GenerateCodeCommand(PixelArtEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        boolean[][] grid = editor.getGrid();
        System.out.println("\nGenerated Java Code:");
        System.out.println("int[][] pixelArt = {");
        for (int y = 0; y < PixelArtEditor.getGridSize(); y++) {
            System.out.print("    {");
            for (int x = 0; x < PixelArtEditor.getGridSize(); x++) {
                System.out.print(grid[y][x] ? "1" : "0");
                if (x < PixelArtEditor.getGridSize() - 1) System.out.print(", ");
            }
            System.out.println("}" + (y < PixelArtEditor.getGridSize() - 1 ? "," : ""));
        }
        System.out.println("};\n");
    }
}

