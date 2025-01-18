import java.awt.*;    

class awt1 extends Frame {    
  
   awt1() {  
 
 
      // creating a button   
      Button b = new Button("Click!!");  
  
      // setting button position on screen  
      b.setBounds(30,100,80,30);  
b.setBackground(Color.red);
  
      // adding button into frame    
      add(b);  
  
      // frame size 300 width and 300 height    
      setSize(300,300);  
  
      // setting the title of Frame  
      setTitle("This is our basic AWT example");   
          
      // no layout manager   
      setLayout(null);   
  
      // now frame will be visible, by default it is not visible    
      setVisible(true);  
}    
  
// main method  
public static void main(String args[]) {   
  
// creating instance of Frame class   
awt1 f = new awt1();    
  
}  
  
}    