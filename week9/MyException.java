

/*Create your own exception class using the extends keyword. Write a constructor for this
class that takes a String argument and stores it inside the object with a String reference.
Write a method that prints out the stored String. Create a try- catch clause to exercise your
new exception. */
 class MyException extends Exception {
    String str;
    MyException(String str){
      this.str=str;
    }
    String  print(){
     return str;
    }
}
 class test{
    public static void main(String ... arg){

        try{

            throw new  MyException(" CreatedException ");
        }
        catch(MyException e){
            System.out.println(e);
        }
    }

 }
