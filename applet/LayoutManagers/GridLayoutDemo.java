import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="GridLayoutDemo.class" height="500" width="200"></applet>
 */

public class GridLayoutDemo extends Applet {
    public void init() {
        int n = 4;
        this.setLayout(new GridLayout(n, n));

        for (int i = 0; i < n*n; i++) {
            this.add(new Button(String.valueOf(i+1)));
        }
    }
    public Insets getInsets(){
        return new Insets(50, 50, 50, 50);
    }
}
