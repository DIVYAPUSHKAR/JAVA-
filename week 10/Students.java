import java.applet.Applet;
import java.awt.event.*;
import java.awt.*; 
import javax.swing.*;
public class register extends Applet
{
public static Label l,l1,l2,l3,l4,l5,l6;
public static TextField t1,t2,t3,t4;
public static JComboBox cb;
public static JRadioButton mRadio,fRadio;
public static void main(String[] args) 
{
Frame f=new Frame("STUDENT");
l1=new Label("NAME");
l1.setBounds(50,80,80,20);
l2=new Label("ROLL NO");
l2.setBounds(50,110,60,20);
l3=new Label("CLASS");
l3.setBounds(50,140,50,20);
l4=new Label("GENDER");
l4.setBounds(50,170,80,20);
l5=new Label("COURSES");
l5.setBounds(50,200,80,20);
l6=new Label("ADDRESS");
l6.setBounds(50,230,80,20);
String course[]={"C","DSA","OOPS","DBMS"};
cb=new JComboBox(course);
cb.setBounds(140,200,80,20);
t1=new TextField();
t1.setBounds(140,80,100,20);
t2=new TextField();
t2.setBounds(140,110,100,20);
t3=new TextField();
t3.setBounds(140,230,100,20); 
CheckboxGroup cbg=new CheckboxGroup(); 
Checkbox box1=new Checkbox("C1",false,cbg); 
Checkbox box2=new Checkbox("C2",false,cbg); 
Checkbox box3=new Checkbox("C3",false,cbg);
Checkbox box4=new Checkbox("C4",false,cbg);
box1.setBounds(140,140,40,20);
box2.setBounds(200,140,40,20);
box3.setBounds(240,140,40,20); 
box4.setBounds(280,140,40,20); 

ButtonGroup genderGroup=new ButtonGroup();
mRadio=new JRadioButton("Male");
mRadio.setBackground(Color.yellow);
mRadio.setBounds(140,170,60,20);
fRadio=new JRadioButton("Female");
fRadio.setBackground(Color.green);
fRadio.setBounds(200,170,100,20); 

Button b=new Button("SUBMIT");
b.setBounds(140,280,70,30);
l=new Label("DETAILS SUBMITTED");
l.setBounds(140,320,180,30);
l.setVisible(false);

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
f.add(t1);
f.add(t2);
f.add(box1);
f.add(box2);
f.add(box3);
f.add(box4);
f.add(mRadio);
f.add(fRadio);
f.add(l5);
f.add(cb);
f.add(t3);
f.add(b);
f.add(l);
f.setSize(800,800);
f.setLayout(null);
f.setVisible(true);

f.addWindowListener(new WindowAdapter() { public
void windowClosing(WindowEvent e) {
System.exit(0);}
});
}
}
