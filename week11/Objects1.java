import java.applet.Applet;
import java.awt.event.*;
import java.awt.*; 
import javax.swing.*;
public class Objects1 extends Applet{
public static void main(String[] args) {
JFrame f=new JFrame("JFrame");
JLabel l=new JLabel("Hello Java");
l.setBounds(100,50,100,100);
f.add(l);
f.setSize(300,300);
f.setLayout(null);
f.setVisible(true);
f.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {
System.exit(0);
}});
}
}
