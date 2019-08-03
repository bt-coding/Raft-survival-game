public class Game{
    private boolean exit;
    //0 == up, 1 == right, 2 == down, 3 == left
    private boolean[] controls;
    private double[] playerLoc;
    private double rotation;
    public Game(){
        exit = false;
        controls = new boolean[4];
        playerLoc = new double[2];
    }
    public void quitGame(){
        exit = true;
    }
    public boolean getExit(){
        return exit;
    }
    public void update(){
        if(controls[0])
            playerLoc[1] ++;
        if(controls[1])
            rotation += 2;
        if(controls[2])
            playerLoc[1] --;
        if(controls[3])
            rotation -= 2;
    }
    public void updateControls(int index,boolean e){
        controls[index] = e;
    }
    public double[] getPlayerLoc(){
        return playerLoc;
    }
    public double getRotation(){
        return rotation;
    }
}