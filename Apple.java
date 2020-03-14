import java.lang.Math; 

public class Apple {
    /**
     * This creates an Apple
     */
    public static Position position; 
    
    
    public static int random(int max) {
        int min = 1; 
        int range = max - min - 1; 
        int rand = (int)(Math.random() * range) + min; 
        return rand;    
    }  
     
    public Apple(int x, int y, int width, int height) {
        position = new Position(x, y);
        for (;;) {
            position.x = random(width);
            position.y = random(height);
            
            for (int i = 0; i < Snake.positions.size() - 1; i++) {
                if (position.x != Snake.positions.get(i).x 
                    && position.y != Snake.positions.get(i).y) {
                    
                    break;
                } 
            }
            
            break;
        }
        
        
        /*
        position = new Position (x, y);
        for (int i = 0; i < Snake.positions.size(); i++) {
            if (position.x != Snake.positions.get(i).x && 
                position.y != Snake.positions.get(i).y) {
                
                position.x = random(width);
                position.y = random(height);
            } 
        }
        */
        
        /*
        while (position.x != Snake.positions.get(0).x &&
            position.x != Snake.positions.get(1).x &&
            position.x != Snake.positions.get(2).x &&
            position.y != Snake.positions.get(0).y &&
            position.y != Snake.positions.get(1).y &&
            position.y != Snake.positions.get(2).y) {
            
            position.x = random(width);
            position.y = random(height);    
        }
        */
    }

    /**
     * Draw the apple
     */
    public void draw(Gui gui) {
        gui.drawCharacter(position.x, position.y, '@', "GREEN", "RED");
    }

}
