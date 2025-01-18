class exp3 {  
  
    public static void main(String[] args) {  
        try{ 
        int data=50/0; //may throw exception   
  }
        
        catch(ArithmeticException e)  
        {  
            System.out.println("exception is handled");  
        }  
        System.out.println("rest of the code");  
    }  
      
}  