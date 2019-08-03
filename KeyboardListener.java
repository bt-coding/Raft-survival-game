import java.awt.event.*;
public class KeyboardListener extends KeyAdapter{
    private Game game;
    public KeyboardListener(Game g){
        game = g;
    }
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_ESCAPE)
            game.quitGame();
        if(key == KeyEvent.VK_W)
            game.updateControls(0,true);
        if(key == KeyEvent.VK_D)
            game.updateControls(1,true);
        if(key == KeyEvent.VK_S)
            game.updateControls(2,true);
        if(key == KeyEvent.VK_A)
            game.updateControls(3,true);
    }
    public void keyReleased(KeyEvent e){
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_W)
            game.updateControls(0,false);
        if(key == KeyEvent.VK_D)
            game.updateControls(1,false);
        if(key == KeyEvent.VK_S)
            game.updateControls(2,false);
        if(key == KeyEvent.VK_A)
            game.updateControls(3,false);
    }
}