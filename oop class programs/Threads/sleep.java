
class SleepExp1 extends Thread  
{    
    public void run()  
    {    
        for(int i=1;i<5;i++)  
        {    
            try  
            {  
                Thread.sleep(1500);  
            }catch(InterruptedException e){
	System.out.println(e);}    
            System.out.println(i);    
        }    
    }    
    public static void main(String args[])  
    {    
        SleepExp1 t1=new SleepExp1();    
        SleepExp1 t2=new SleepExp1(); 
 

    System.out.println("before starting thread isAlive: "+t1.isAlive());  
        t1.start();  

      System.out.println("after starting thread isAlive: "+t1.isAlive());  
  t2.start(); 

System.out.println("Name of t1: "+t1.getName());  
        System.out.println("Id of t1: "+t1.getId());   
         System.out.println("Name of t2: "+t2.getName()); 
t2.setName("oops"); 
     System.out.println("after changing,Name of t2: "+t2.getName()); 
 

    }    
}  