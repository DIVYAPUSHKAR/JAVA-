import java.awt.*;    
import javax.swing.*;    
    
 class FlowLayoutExample  
{   
   
JFrame frameObj;  
  
FlowLayoutExample()  
{    
      frameObj = new JFrame();    
        
     // creating the buttons  
    JButton b1 = new JButton("1");    
    JButton b2 = new JButton("2");    
    JButton b3 = new JButton("3");    
    JButton b4 = new JButton("4");    
    JButton b5 = new JButton("5");  
    JButton b6 = new JButton("6");    
    
    frameObj.add(b1); frameObj.add(b2); frameObj.add(b3); frameObj.add(b4);      
    frameObj.add(b5); frameObj.add(b6);
     
    frameObj.setLayout(new FlowLayout());    
        
    frameObj.setSize(300, 300);    
    frameObj.setVisible(true);    
}    
 
public static void main(String argvs[])   
{    
    new FlowLayoutExample();    
}    
}    