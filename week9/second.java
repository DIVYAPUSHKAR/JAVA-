

public class second {
     public static void main(String arg[]){
          int a;
         try{
          a=10/0;
          System.out.println(a);
         }
        //  catch(Exception e){
        //     System.out.println(e);
        //  }
         catch(IndexOutOfBoundsException e){
            System.out.println(e);
         }
         catch(NullPointerException e){
            System.out.println(e);
         }
         catch(ArithmeticException e){
            System.out.println(e);
         }
         catch(Exception e){
            System.out.println(e);
         }
     }
}
