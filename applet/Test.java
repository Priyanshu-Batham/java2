import java.applet.*;
import java.awt.*;

/*
<applet code="Test.class" width="1500" height="900">
</applet>
*/

public class Test extends Applet implements Runnable {
    Thread th;
    int posX = 0;

    public void init() {
        // First phase of Applet Life Cycle
        th = new Thread(this, "myThread");
        // I am also supposed to do things like set color or any initializing things
    }

    public void start() {
        // Second phase of Applet Life Cycle
        th.start();
    }

    public void paint(Graphics g) {
        // Third phase of Applet Life Cycle
        g.fillRect(posX, 0, 100, 100);
        posX += 50;
        posX %= 1500;
    }

    // Fourth phase: Stop() & Fifth phase: destroy() are not used coz no need
    // now make the run() method for the thread to repetedly execute the paint()
    // using repaint()
    public void run() {
        while (true) {
            try {
                repaint();
                Thread.sleep(100);
            } catch (Exception e) {}
        }
    }
}