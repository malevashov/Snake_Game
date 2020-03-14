import java.util.ArrayList;

public class Demo2 {
    public static void main(String[] args) {
        Gui gui = new Gui();
        int width = gui.getScreenWidth();
        int height = gui.getScreenHeight();
        
        gui.start(); //start using gui - clears the screen to staty drawing
        
        ArrayList<Ball> balls = new ArrayList<Ball>();
        
        Ball b = new Ball(5, 6, width, height); // width and height of the screen 
        balls.add(b);
        
        Ball b2 = new CrazyBall(width, height);
        balls.add(b2);
        
        //Ball b3 = new RandomBall(width, height);
        //balls.add(b3);
        
        while(gui.getKeypress() != 'q') {  // ==0  -- hasnt pressed any key // !='q' only when press q it will quit
            
            gui.clear();
            
            for (int i = 0; i < balls.size(); i++) {
                Ball ball = balls.get(i);
                ball.draw(gui);
                ball.move();
            }
            /*
            
            b.draw(gui);
            b.move();
            
            b2.draw(gui);
            b2.move();
            
            b3.draw(gui);
            b3.move();
            */
            
            gui.refresh();
            gui.sleep(1000);
            
            
        }
        
        gui.stop(); //stops gui - returns the screen 
    }
}