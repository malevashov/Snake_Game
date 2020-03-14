import java.util.ArrayList;

public class Snake {
    private int width;
    private int height;
    
    
    /**
     * The Snake is represented as a list of positions.
     * The head is at position 0. 
     */
    public static ArrayList<Position> positions = new ArrayList<Position>();
    
    /**
     * The direction of motion of the snake can be either
     * UP, DOWN, LEFT or RIGHT. Default is to the right.
     */
    private String direction = "RIGHT";
    
    public void setDirection(String direction) {
        if (direction.equals("UP")) {
            if (this.direction.equals("DOWN")) {
                return;
            }    
        } else if (direction.equals("DOWN")) {
            if (this.direction.equals("UP")) {
                return;
            } 
        } else if (direction.equals("LEFT")) {
            if (this.direction.equals("RIGHT")) {
                return;
            }
        } else if (direction.equals("RIGHT")) {
            if (this.direction.equals("LEFT")) {
                return;
            }    
        }
        
        
        if (direction.equals("UP")) {
            this.direction = "UP";
        } else if (direction.equals("DOWN")) {
            this.direction = "DOWN";
        } else if (direction.equals("RIGHT")) {
            this.direction = "RIGHT";
        } else if (direction.equals("LEFT")) {
            this.direction = "LEFT";
        }
    }

        
    /**
     * Create a new Snake object. You will need to add to the
     * constructor here to pass it more information
     */
     
    public Snake(int x, int y) {
        Position head = new Position(x, y);
        positions.add(head);
        Position tail1 = new Position(x - 1, y);
        positions.add(tail1);
        Position tail2 = new Position(x - 2, y);
        positions.add(tail2);
        
    }

    /**
     * This method should draw the snake
     */
    public void draw(Gui gui) {
        Position head = positions.get(0);
        
        if (direction == "RIGHT") {
            gui.drawCharacter(head.x, head.y, '>', "GREEN", "BLUE");
        } else if (direction == "LEFT") {
            gui.drawCharacter(head.x, head.y, '<', "GREEN", "BLUE");
        } else if (direction == "UP") {
            gui.drawCharacter(head.x, head.y, '^', "GREEN", "BLUE");
        } else if (direction == "DOWN") {
            gui.drawCharacter(head.x, head.y, 'V', "GREEN", "BLUE");
        }
        
        for (int i = 1; i < positions.size(); i++) {
            gui.drawCharacter(positions.get(i).x, positions.get(i).y, '+', "GREEN", "BLUE");
        }
        
    }

    /**
     * Move the snake in its direction of motion
     */
    public void move() {
        Position head = positions.get(0);
        
        if (direction == "RIGHT") {
            for (int i = positions.size() - 1; i > 0; i--) {
                positions.get(i).y = positions.get(i - 1).y;
                positions.get(i).x = positions.get(i - 1).x;
            }   
            head.x += 1;
            
            
        } else if (direction == "LEFT") {
            for (int i = positions.size() - 1; i > 0; i--) {
                positions.get(i).y = positions.get(i - 1).y;
                positions.get(i).x = positions.get(i - 1).x;
            }  
            head.x -= 1;
            
        } else if (direction == "UP") {
            for (int i = positions.size() - 1; i > 0; i--) {
                positions.get(i).y = positions.get(i - 1).y;
                positions.get(i).x = positions.get(i - 1).x;
            }
            head.y -= 1;
            
        } else if (direction == "DOWN") {
            for (int i = positions.size() - 1; i > 0; i--) {
                positions.get(i).y = positions.get(i - 1).y;
                positions.get(i).x = positions.get(i - 1).x;
            }
            head.y += 1;

        }
    }
    
    public void grow() {
        Position tail3 = new Position(positions.get(2).x - 1, 
            positions.get(2).y - 1);
        positions.add(tail3);
    }
    
}
