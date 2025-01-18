
import java.util.Scanner;

public class PrintElements {
    
    public static void main(String []args)
    {

          
      //arr = new int[5];
      int arr[]=new int[5];
//int arr[]={1,2,3,4,5};
      /*arr[0] = 10;
          
          arr[1] = 20;
   
      arr[2] = 30;
      arr[3] = 40;
      arr[4] = 50;*/
      int i;
  Scanner s=new Scanner(System.in);
  System.out.println("enter the array elements");
          
       for(i=0;i<5;i++)
  {
  arr[i]=s.nextInt();
  }
      for ( i = 0; i < arr.length; i++)
         System.out.println("Element at index " + i + 
                                      " : "+ arr[i]);   
    }
            
}
