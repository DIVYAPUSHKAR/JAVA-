import java.io.*;  
public class ByteInput {  
  public static void main(String[] args) throws IOException {  
    byte[] buf = { 65, 66, 67, 68 };  

    ByteArrayInputStream byt = new ByteArrayInputStream(buf);  
    int k = 0;  
    while ((k = byt.read()) != -1) {  
      //Conversion of a byte into character  
      char ch = (char) k;  
      System.out.println("character is: " + ch);  
    }  
  }  
}  