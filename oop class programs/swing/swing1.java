import javax.swing.*;  
public class swing1 extends JFrame{//inheriting JFrame  

swing1(){  
JButton b=new JButton("click");
b.setBounds(130,100,100, 40);  
          
add(b); 
setSize(400,500);  
setLayout(null);  
setVisible(true);  
}  
public static void main(String[] args) {  
swing1 a=new swing1();  
}}  