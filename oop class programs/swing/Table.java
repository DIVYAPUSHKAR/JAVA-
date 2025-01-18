import javax.swing.*;    
public class Table {    
    JFrame f;    
    Table(){    
    f=new JFrame();    
    String data[][]={ {"101","anu","rgukt"},    
                          {"102","rohan","IITH"},    
                          {"101","arjun","HCU"}};    
    String column[]={"ID","NAME","college"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(300,400);    
    f.setVisible(true);    
}     
public static void main(String[] args) {    
    new Table();    
}    
}  
