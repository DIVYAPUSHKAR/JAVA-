import javax.swing.*;   
public class Scroll extends JFrame  
{  
public Scroll() {  

ImageIcon img = new ImageIcon("rguktlogo.jpg");  
  
JScrollPane png = new JScrollPane(new JLabel(img));  
  
getContentPane().add(png);  
setSize(200,150);  
setVisible(true);  
}  
  
public static void main(String[] args) {  
new Scroll();  
}  
}  