import java.io.*;  
public class BufferedOutput{    
public static void main(String args[])throws Exception{    
     FileOutputStream fout=new FileOutputStream("f5.txt");    
     BufferedOutputStream bout=new BufferedOutputStream(fout);    
     String s="Hello world.";    
     byte b[]=s.getBytes();    
     bout.write(b);    
     bout.flush();    
     bout.close();    
     fout.close();    
     System.out.println("success");    
}    
}  