import java.awt.*;
import javax.swing.*;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.image.BufferedImage;
import java.io.IOException;
public class Display extends JComponent{
    private Game game;
    int screenHeight;
    int screenWidth;
    BufferedImage boat;
    public Display(Game g){
        super();
        game = g;
        screenHeight = 0;
        screenWidth = 0;
        System.out.println(screenWidth);
        try{
           boat = ImageIO.read(new File("boat.png")); 
        }
        catch(Exception e){ 
            System.out.println("Display class: "+e);
        }
    }
    public void setScreenSize(int sh,int sw){
        screenHeight = sh;
        screenWidth = sw;
    }
    public void draw(){
        System.out.println("repainting");
        super.repaint();
        System.out.println("repainted");
    }
    public void paintComponent(Graphics g){
        System.out.println("test");
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D)g;
        g.setColor(Color.BLACK);
        g.drawString("X: "+game.getPlayerLoc()[0]+" Y: "+game.getPlayerLoc()[1],20,20);
        g2d.rotate(Math.toRadians(game.getRotation()),(int)(screenWidth*0.5),(int)(screenHeight*0.5));
        g2d.drawImage(boat,(int)(screenWidth*.45),(int)(screenHeight*.40),(int)(screenWidth*.1),(int)(screenHeight*.2),this);
        //g2d.drawImage(boat,200,200,200,230,this);
        g2d.rotate(Math.toRadians(game.getRotation())*-1,(int)(screenWidth*0.5),(int)(screenHeight*0.5));
        
    }
}