import java.io.*;  
public class ByteStream {  
public static void main(String args[])throws Exception{    
      FileOutputStream fout1=new FileOutputStream("f3.txt");    
      FileOutputStream fout2=new FileOutputStream("f4.txt");    
        
      ByteArrayOutputStream bout=new ByteArrayOutputStream();    
      bout.write(65);    
      bout.writeTo(fout1);    
      bout.writeTo(fout2);    
        
      bout.flush();    
         
      System.out.println("Success...");    
     }    
    }   