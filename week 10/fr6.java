import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;
public class fr6 extends Applet{
public static void main(String[] args) {
new fr6();

Frame f=new Frame("Calculator");
Button b1=new Button("7");
Button b2=new Button("8");
Button b3=new Button("9");
Button b4=new Button("/");
Button b5=new Button("4");
Button b6=new Button("5");
Button b7=new Button("6");
Button b8=new Button("x");
Button b9=new Button("1");
Button b10=new Button("2");
Button b11=new Button("3");
Button b12=new Button("-");
Button b13=new Button("=");
Button b14=new Button("0");
Button b15=new Button(".");
Button b16=new Button("+");
f.add(b1);
f.add(b2);f.add(b3);f.add(b4);f.add(b5);
f.add(b6);f.add(b7);f.add(b8);f.add(b9);f.add(b10);
f.add(b11);f.add(b12);f.add(b13);f.add(b14);
f.add(b15);f.add(b16);
f.setLayout(new GridLayout(2,2,2,2));
f.setSize(250,250);
f.setVisible(true);
f.addWindowListener(new WindowAdapter() 
{
public void windowClosing(WindowEvent e) 
{
System.exit(0);
}
 }
 ); 
 }
 }
