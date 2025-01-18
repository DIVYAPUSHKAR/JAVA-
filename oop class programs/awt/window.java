import java.awt.*;    
import java.awt.event.WindowEvent;    
import java.awt.event.WindowListener;   
  
   class WindowExample extends Frame implements WindowListener {    
  
 
    WindowExample() {   
  
 
        addWindowListener(this);   
         
        setSize (400, 400);    
        setLayout (null);    
        setVisible (true);    
    }   

public static void main(String[] args) {    
    new WindowExample();    
}    
  

public void windowActivated (WindowEvent arg0) {    
    System.out.println("activated");    
}    
  

public void windowClosed (WindowEvent arg0) {    
    System.out.println("closed");    
}    
  

public void windowClosing (WindowEvent arg0) {    
    System.out.println("closing");    
    dispose();    
}    
  
// overriding windowDeactivated() method of WindowListener interface which prints the given string when window is not active  
public void windowDeactivated (WindowEvent arg0) {    
    System.out.println("deactivated");    
}    
  
// overriding windowDeiconified() method of WindowListener interface which prints the given string when window is modified from minimized to normal state  
public void windowDeiconified (WindowEvent arg0) {    
    System.out.println("deiconified");    
}    
  

public void windowIconified(WindowEvent arg0) {    
    System.out.println("iconified");    
}    
  

public void windowOpened(WindowEvent arg0) {    
    System.out.println("opened");    
}    
}    