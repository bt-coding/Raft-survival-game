public class GameUpdateThread extends Thread{
    private Game game;
    //updates per second 
    private double ups;
    public GameUpdateThread(Game g){
        game = g;
        ups = 30;
    }
    public void run(){
        while(true){
            game.update();
            if(game.getExit())
                System.exit(0);
            try{
                Thread.sleep((int)(1000/ups));
            }
            catch(Exception e){
                System.out.println("Game update thread: "+e);
            }
        }
    }
}