public class RandomBall extends Ball {
    
    public RandomBall(int width, int height) {
        super(0, 0, width, height);
    }
    
    public void move() {
        position.x = (int) (Math.random() * width); // always return DOUBLE b/w 0 and 1 // casting (int) <-- (...)
        position.y = (int) (Math.random() * height);
    }
}