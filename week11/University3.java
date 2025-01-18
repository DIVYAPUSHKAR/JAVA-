import java.applet.Applet;
import java.awt.event.*;
import java.awt.*; import
javax.swing.*;
public class University3 extends Applet{
public static Label l,l1,l2,l3,l4,l5,l6,l7;
 public static TextField t1,t2,t3,t4; 
public static JComboBox cb;

public static void main(String[] args) {
Frame f=new Frame("University Form");
l1=new Label("Name");
l1.setBounds(40,80,50,20);
l2=new Label("Age");
l2.setBounds(40,110,50,20);
l3=new Label("Qualification");
l3.setBounds(40,140,70,20);
l4=new Label("Gender");
l4.setBounds(40,170,50,20);
l5=new Label("Course");
l5.setBounds(40,200,50,20);
l6=new Label("Address");
l6.setBounds(40,230,50,20);
l7=new Label("Remarks");
l7.setBounds(40,260,50,20);

String course[]={"10th","11th","12th",};
cb=new JComboBox(course);
cb.setBounds(160,140,80,20);

t1=new TextField();
t1.setBounds(160,80,100,20);
t2=new TextField();
t2.setBounds(160,110,100,20);
t3=new TextField();
t3.setBounds(160,230,100,20);

TextArea ta=new TextArea("Add your remarks");
ta.setBounds(160,260,140,50);Checkbox box1=new Checkbox("C");
Checkbox box2=new Checkbox("Java");
box1.setBounds(160,200,40,20);
box2.setBounds(200,200,40,20);
CheckboxGroup cbg1=new CheckboxGroup();
Checkbox box3=new Checkbox("male",false,cbg1);
Checkbox box4=new Checkbox("female",false,cbg1);
box3.setBounds(160,170,60,20);
box4.setBounds(220,170,60,20);
Button b=new Button("submit");
b.setBounds(160,330,70,30); l=new
Label("Successfully Enrolled!");
l.setBounds(140,360,160,30); l.setVisible(false);
b.addActionListener(new ActionListener(){
@java.lang.Override
public void actionPerformed(ActionEvent e){
l.setVisible(true);
}
});
f.add(l1);
f.add(l2);
f.add(l3);
f.add(l4);
f.add(l6);
f.add(l7);
f.add(t1);
f.add(t2);
f.add(box1);
f.add(box2);
f.add(box3);
f.add(box4);
f.add(l5);
f.add(cb);
f.add(t3);
f.add(b);
f.add(l);
f.add(ta);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
f.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {
System.exit(0);}});
}}
