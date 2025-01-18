import javax.swing.*;
import java.awt.*; import
java.awt.event.*;
class Menu implements ActionListener{
static JLabel text;
public static void main(String args[]){
JFrame frame = new JFrame("Menu");
frame.setSize(500,500);
frame.setLayout(new FlowLayout());
Menu obj = new Menu();
JMenu menu = new JMenu("Select Here");
JMenuItem item[] = new JMenuItem[5];
for(int i=0;i<5;i++)
{
item[i]=new JMenuItem("Item "+(i+1));
item[i].addActionListener(obj);
menu.add(item[i]);
}
JMenuBar mb=new JMenuBar();
mb.add(menu);
frame.setJMenuBar(mb);
text = new JLabel();
frame.add(text);
frame.setVisible(true);
}
public void actionPerformed(ActionEvent e){
text.setText("Menu Item Selected : "+e.getActionCommand());
}}

