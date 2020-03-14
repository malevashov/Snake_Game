public class Room {
    /**
     * The background color of the wall
     */
    private static final String BACKGROUND_COLOR = "BLUE";

    /**
     * The foreground color of the wall
     */
    private static final String FOREGROUND_COLOR = "WHITE";

    /**
     * Character to use to represent the wall
     */
    private static final char WALL_CHARACTER = 'X';

    /**
     * Hold the width of the screen
     */
    private int width;

    /**
     * Hold the height of the screen
     */
    private int height;

    /**
     * This constructs a new room
     */
    public Room(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * This draws the room on the GUI
     */
    public void draw(Gui gui) {
        // Draw the top wall
        gui.drawLine(0, 0, this.width - 1, 0, WALL_CHARACTER,
            FOREGROUND_COLOR, BACKGROUND_COLOR);
        gui.drawLine(0, 0, 0, this.height - 1, WALL_CHARACTER,
            FOREGROUND_COLOR, BACKGROUND_COLOR);
        gui.drawLine(0, this.height - 1, this.width - 1, this.height - 1, 
            WALL_CHARACTER, FOREGROUND_COLOR, BACKGROUND_COLOR);
        gui.drawLine(this.width - 1, 0, this.width - 1, this.height - 1, 
            WALL_CHARACTER, FOREGROUND_COLOR, BACKGROUND_COLOR);
    }
}
