import java.applet.*;
import java.awt.*;

/*<applet code="CircularMotion" width="1920" height="1050"></applet> */
public class CircularMotion extends Applet implements Runnable{
    Rectangle rect;
    Thread th;
   
    public void init(){
        rect = new Rectangle(960, 525, 50, 100);
        th = new Thread(this, "myThread");
        th.start();
    }

    public void run(){
        while(true){
            rect.offsetX = rect.radius * Math.cos(rect.angle);
            rect.offsetY = rect.radius * Math.sin(rect.angle);
            rect.angle = (rect.angle+0.1) % (2*Math.PI);

            System.out.println("X: "+rect.offsetX+" Y: "+rect.offsetY);
            repaint();

            try{Thread.sleep(62);}
            catch(Exception e){}
        }
    }

    public void paint(Graphics g){
        g.fillRect((int)(rect.x + rect.offsetX), (int)(rect.y + rect.offsetY), rect.width, rect.height);
    }
}

class Rectangle{
    double x;
    double y;
    int height;
    int width;

    double offsetX;
    double offsetY;
    double angle = 0;
    double radius = 400;

    Rectangle(double x, double y, int height, int width){
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }
}
