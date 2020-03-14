public class CrazyBall extends Ball {
    public CrazyBall(int width, int height) {
        super(0, 0, width, height);
    }
    
    public void draw(Gui gui) {
        gui.drawCharacter(position.x, position.y, '0', "RED", "BLUE");
        gui.drawCharacter(position.x, position.y + 1, '0', "RED", "BLUE");
        gui.drawCharacter(position.x, position.y + 2, '0', "RED", "BLUE");
        gui.drawCharacter(position.x, position.y + 3, '0', "RED", "BLUE");
        gui.drawCharacter(position.x + 1, position.y + 1, '0', "RED", "BLUE");
        gui.drawCharacter(position.x + 2, position.y + 2, '0', "RED", "BLUE");
        gui.drawCharacter(position.x + 3, position.y + 3, '0', "RED", "BLUE");
        
        gui.drawCharacter(position.x + 2, position.y + 4, '0', "RED", "BLUE");
        gui.drawCharacter(position.x + 2, position.y + 2, '0', "RED", "BLUE");
    }
    
    
}