

public class fourth {
     public static void main(String ...arg){
        try{
            Class.forName("abcde");
        }
        catch(ClassNotFoundException e){
           System.out.println(e);
           e.printStackTrace();
        }
     }
}
