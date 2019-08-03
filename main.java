import javax.swing.*;
public class main{
    public static void main(String[] args){
        JFrame frame = new JFrame("Raft Survival");
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setUndecorated(true);
        frame.pack();
      
        Game game = new Game();
        Display screen = new Display(game);
        KeyboardListener keyboard = new KeyboardListener(game);
        frame.add(screen);
        frame.addKeyListener(keyboard);
        
        frame.setVisible(true);
        int height = frame.getHeight();
        int width = frame.getWidth();
        screen.setScreenSize(height,width);
        GameUpdateThread gameThread = new GameUpdateThread(game);
        DisplayDrawThread drawThread = new DisplayDrawThread(screen,60);
        System.out.println("begining thread start");
        gameThread.start();
        drawThread.start();
        System.out.println("threads started");
    }
}