public class FloatingItem{
    private double[] loc;
    private String name;
    private int quantity;
    //percent of the screen size
    private double[] size;
    public FloatingItem(String n, double[] l, int q){
        name = n;
        loc = l;
        quantity = q;
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
    public String getName(){
        return name;
    }
    public int getQuantity(){
        return quantity;
    }   
    public boolean clicked(int[] ml,int w,int h){
        return new Button(loc,size,null).clicked(ml,new double[]{(double)w,(double)h});
    }
    public void pickUpSome(int a){
        quantity -= a;
    }
}