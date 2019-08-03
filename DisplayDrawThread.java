public class DisplayDrawThread extends Thread{
    Display screen;
    int fps;
    public DisplayDrawThread(Display s, int FPS){
        screen = s;
        fps = FPS;
    }
    public void run(){
        while(true){
            screen.draw();
            System.out.println("drawing");
            try{
                Thread.sleep(1000/fps);
            }
            catch(Exception e){
                System.out.println("Display Draw Thread: "+e);
            }
        }
    }
}   