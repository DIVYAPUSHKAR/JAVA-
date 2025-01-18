import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class dd extends Applet
{
public static JLabel L1,L2,L3,L,d1,d2,d3,d4,d5;
public static JComboBox cb,cb1,cb2;
public static void main(String...args)
{
Frame f= new Frame("select the date");
f.setSize(1000,1000);
Integer days[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
Integer months[]={1,2,3,4,5,6,7,8,9,10,11,12};
Integer years[]=new Integer[61];
int k=0;
for(int i=1990;i<=2050;i++)
{
years[k]=i;
k++;
}
L1=new JLabel("date");
L1.setBounds(50,80,80,20);
L2=new JLabel("month");
L2.setBounds(160,80,80,20);
L3=new JLabel("year");
L3.setBounds(260,80,80,20);
cb=new JComboBox(days);
cb.setBounds(50,100,80,20);
cb1=new JComboBox(months);
cb1.setBounds(160,100,70,20);
cb2=new JComboBox(years);
cb2.setBounds(260,100,70,20);
L=new JLabel("Selected date");
L.setBounds(105,160,200,100);
d1=new JLabel("01");
d1.setBounds(105,200,300,100);
d2=new JLabel("/");
d2.setBounds(130,200,300,100);

d3=new JLabel("01");
d3.setBounds(140,200,300,100);

d4=new JLabel("/");
d4.setBounds(160,200,300,100);

d5=new JLabel("2000");
d5.setBounds(175,200,300,100);
f.add(cb);
f.add(cb1);
f.add(cb2);
f.add(L1);
f.add(L2);
f.add(L3);
f.add(d1);
f.add(d2);
f.add(d3);
f.add(d4);
f.add(d5);
f.add(L);


cb.addActionListener(new ActionListener()
{
@java.lang.Override
public void actionPerformed(ActionEvent e)
{
int date=(int)cb.getSelectedItem();
d1.setText(String.valueOf(date));
}
}
);

cb1.addActionListener(new ActionListener()
{
@java.lang.Override
public void actionPerformed(ActionEvent e)
{
int mt=(int)cb1.getSelectedItem();
d3.setText(String.valueOf(mt));
}
}
);
cb2.addActionListener(new ActionListener()
{
@java.lang.Override
public void actionPerformed(ActionEvent e)
{
int yr=(int)cb2.getSelectedItem();
d5.setText(String.valueOf(yr));
}
}
);
f.setLayout(null);
f.setVisible(true);
}
}


