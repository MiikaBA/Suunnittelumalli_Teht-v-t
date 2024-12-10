

class MoveCursorUpCommand implements Command {
    private PixelArtEditor editor;

    public MoveCursorUpCommand(PixelArtEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        int newY = Math.max(0, editor.getCursorY() - 1);
        editor.setCursorY(newY);
    }
}

class MoveCursorDownCommand implements Command {
    private PixelArtEditor editor;

    public MoveCursorDownCommand(PixelArtEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        int newY = Math.min(PixelArtEditor.getGridSize() - 1, editor.getCursorY() + 1);
        editor.setCursorY(newY);
    }
}

class MoveCursorLeftCommand implements Command {
    private PixelArtEditor editor;

    public MoveCursorLeftCommand(PixelArtEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        int newX = Math.max(0, editor.getCursorX() - 1);
        editor.setCursorX(newX);
    }
}

class MoveCursorRightCommand implements Command {
    private PixelArtEditor editor;

    public MoveCursorRightCommand(PixelArtEditor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        int newX = Math.min(PixelArtEditor.getGridSize() - 1, editor.getCursorX() + 1);
        editor.setCursorX(newX);
    }
}
