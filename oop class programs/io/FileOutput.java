import java.io.*;  
public class FileOutput {  
    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("f1.txt");    
             fout.write(65);    
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  