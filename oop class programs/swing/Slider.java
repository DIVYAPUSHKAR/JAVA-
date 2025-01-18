import javax.swing.*;  
public class Slider extends JFrame{  
Slider() {  
JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);  
JPanel panel=new JPanel();  
panel.add(slider);  
add(panel);  

setVisible(true); 
}  
  
public static void main(String s[]) {  
Slider f=new Slider();  

}  
}  
