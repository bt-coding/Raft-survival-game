import java.awt.*;
public class Button{
    //Stored in percents of the screen so they can be easily adjusted to any screen size
    private double[] loc;
    private double[] size;
    private String item;
    public Button(double[] l, double[] s, String i){
        loc = l;
        size = s;
        item = i;
    }
    public double[] getLoc(){
        return loc;
    }
    public double getX(){
        return loc[0];
    }
    public double getY(){
        return loc[1];
    }
    public double[] getSize(){
        return size;
    }
    public double getWidth(){
        return size[0];
    }
    public double getHeight(){
        return size[1];
    }
    public boolean clicked(int[] mouseLoc, double[] screenSize){
        if(new Rectangle(mouseLoc[0],mouseLoc[1],1,1).intersects(new Rectangle((int)(loc[0]*screenSize[0]),(int)(loc[1]*screenSize[1]),(int)(size[0]*screenSize[0]),(int)(size[1]*screenSize[1]))))
            return true;
        return false;
    }
}