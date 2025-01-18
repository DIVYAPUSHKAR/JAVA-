

public class ReThrow {
    
    static void one()throws Exception {
        try{
             two();
            }
            catch(Exception e){
                System.out.println(e);
                System.out.println("exception catched in metod one");
            }
    }
    static void two() throws Exception{
      throw new  Exception("Exception in second method ");
    }
    public static void main(String ...arg){
               
     try{
        one();
     }
     catch(Exception e){
        System.out.println(e);
        System.out.println("catched in main method");
     }
     System.out.println("completed");

    }
}
