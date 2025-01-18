

import java.util.Scanner;

public class Numberformat {
    public static void main(String[] arg){
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
    String str=sc.next();   
      try{
      int num1=Integer.valueOf(str);
      System.out.println("number is "+num1);
    }
    catch(NumberFormatException e){
       System.out.println(e);
    }
    catch(Exception e){
       System.out.println(e);
    }
    sc.close();
}
}
