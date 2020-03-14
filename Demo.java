public class Demo {
    public static void main(String[] args) {
        Gui gui = new Gui();
        int height = gui.getScreenHeight();
        int width = gui.getScreenWidth();
        
        System.out.println("height= " + height);
        System.out.println("width= " + width);
        
        gui.start();
        
        for (int i = 1; i <= 10; i++) {
            gui.clear();
            gui.drawCharacter(0 + i, 15, 'Y', "RED", "BLUE");
            gui.refresh();
            gui.sleep(100);
        }
        
        //gui.refresh();
        
        gui.drawLine(0, 0, width, height, 'Y', "BLACK", "WHITE");
        
        gui.refresh(); // double buffering. swaps picture frames
        
        // wait for keypress to exit 
        while (gui.getKeypress() != 'x') { // ==0 press any key and the program will stop. !='x' press any key -- gets message, press 'x' stops the program
        
            // go to sleep for a while 
            gui.sleep(100); // 100 ms -- miliseconds 1/10 seconds 
            
        }
        
        gui.stop();
    }
}