import java.awt.*; //abstract window toolkit for components
import java.awt.event.*; //for event listeners
import java.applet.*; //for main applet

/*
 <applet code = "Calcu.class" width = "210" height = "210"></applet>
 */

public class Calcu extends Applet implements ActionListener{
    //declaring awt components
    TextField tf1, tf2, tf3; 
    Button plusBtn, minusBtn, mulBtn, divBtn, clrBtn;

    public void init(){
        setLayout(null); //disabling the default layout manager for applet container

        // initializing text field components
        tf1 = new TextField();
        tf2 = new TextField();
        tf3 = new TextField();

        // initializing button components
        plusBtn = new Button("+");
        minusBtn = new Button("-");
        mulBtn = new Button("*");
        divBtn = new Button("/");
        clrBtn = new Button("Clear");


        //setting the position and size of elements using setBounds()
        tf1.setBounds(5, 5, 100, 50);
        tf2.setBounds(105, 5, 100, 50);

        plusBtn.setBounds(5, 60, 50, 50);
        minusBtn.setBounds(55, 60, 50, 50);
        mulBtn.setBounds(105, 60, 50, 50);
        divBtn.setBounds(155, 60, 50, 50);

        clrBtn.setBounds(5, 115, 200, 50);

        tf3.setBounds(5, 170, 200, 50);

        //adding all elements to applet container
        add(tf1);
        add(tf2);
        add(tf3);

        add(plusBtn);
        add(minusBtn);
        add(mulBtn);
        add(divBtn);
        add(clrBtn);

        // adding ActionListeners on buttons
        plusBtn.addActionListener(this);
        minusBtn.addActionListener(this);
        mulBtn.addActionListener(this);
        divBtn.addActionListener(this);
        clrBtn.addActionListener(this);
    }
    // adding action handler(function) for action listener
    public void actionPerformed(ActionEvent ae){
        int oprA = Integer.parseInt(tf1.getText());
        int oprB = Integer.parseInt(tf2.getText());
        int result;

        Button clickedBtn = (Button)ae.getSource(); //getSource return type if Object so we type convert it to get a Button type reference

        if(clickedBtn == clrBtn){
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
            return;
        }

        if(clickedBtn == plusBtn) result = oprA + oprB;
        else if(clickedBtn == minusBtn) result = oprA - oprB;
        else if(clickedBtn == mulBtn) result = oprA * oprB;
        else result = oprA / oprB;

        tf3.setText(String.valueOf(result));
    }
}
