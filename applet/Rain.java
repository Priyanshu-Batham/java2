import java.applet.*;
import java.awt.*;

//<applet code="Rain.class" height="1000" width="1900"></applet>

public class Rain extends Applet implements Runnable{
    int drops[][];
    Thread th;
    public void init(){
        this.setBackground(Color.BLACK);
        drops = new int[1000][2];
        for(int i = 0; i<1000; i++){
            int x = (int) (Math.random()*10000)%1901; //x coords 0-1900
            int y = (int) (Math.random()*10000)%1001; //y coords 0-1000

            drops[i][0] = x;
            drops[i][1] = y;
        }
        th = new Thread(this);
    }

    public void start(){
        th.start();
    }

    //State Management occurs here
    public void run(){
        while(true){
            for(int i = 0; i<1000; i++){
                int mod = 1000;
                int x = drops[i][0];
                if(x > 800 && x < 1200) mod = 600; 
                drops[i][1] = (drops[i][1]+60)%mod;
            }
            repaint();
            try{Thread.sleep(100);}
            catch(Exception e){};
        }
    }

    //rendering occurs here
    public void paint(Graphics g){
        g.setColor(Color.BLUE);
        for(int i = 0; i<1000; i++){
            g.fillRect(drops[i][0], drops[i][1], 2, 10);
        }

        //umbrella
        g.setColor(Color.WHITE);
        g.fillArc(800, 600, 400, 100, 0, 180);
        g.fillRect(1000, 650, 10, 350);
        g.fillRect(900, 950, 200, 50);
    }
}