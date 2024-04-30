import java.applet.*;
import java.awt.*;
import java.awt.event.*;

//<applet code="Bus.class" height="1000" width="1900"></applet>

public class Bus extends Applet implements Runnable, ActionListener{
  Thread th;
  Button start, stop;
  int pos;
  boolean isRunning;  

  //-------------------------->>>
  public void init(){
    //initializing the setup
    setLayout(null);
    setBackground(Color.black);
    th = new Thread(this);
    th.start();
    start = new Button("Start");
    stop= new Button("Stop");
    pos = 0;
    isRunning = false;

    //locating the buttons
    start.setBounds(800, 500, 150, 50);
    stop.setBounds(950, 500, 150, 50);

    add(start);
    add(stop);

    //adding actionListeners on buttons
    start.addActionListener(this);
    stop.addActionListener(this);
  }
  //-------------------------->>>
  public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==start) isRunning = true;
    else isRunning = false;
  }
  //-------------------------->>>
  public void run(){
    while(true){
      if(isRunning) pos+=50;
      pos%=1800;

      repaint();
      try{Thread.sleep(100);}
      catch(Exception e){}
    }
  }
  //-------------------------->>>
  public void paint(Graphics g){
    //drawing the actual bus

    g.setColor(Color.yellow);
    g.fillRect(pos, 50, 300, 100);
    g.setColor(Color.magenta);
    g.fillOval(pos+10, 100, 70, 70);
    g.fillOval(pos+200, 100, 70, 70);
  }
}

//init()
//actionPerformed()
//run()
//repaint()
//paint()
