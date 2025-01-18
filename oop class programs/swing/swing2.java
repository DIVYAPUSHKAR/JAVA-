import javax.swing.*;  
public class swing2{  

swing2()
{
JFrame f=new JFrame();
          
JButton b=new JButton("click");
b.setBounds(130,100,100, 40);
          
f.add(b);
          
f.setSize(400,500);
f.setLayout(null);  
f.setVisible(true);
}  
public static void main(String[] args) {  
swing2 obj=new swing2();
}
}