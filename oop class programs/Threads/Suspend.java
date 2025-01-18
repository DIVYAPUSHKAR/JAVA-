class Suspend extends Thread  
{    
    public void run()  
    {    
        for(int i=1;i<5;i++)  
        {    
            try  
            {  
                Thread.sleep(500);  
System.out.println(Thread.currentThread().getName()); 
            }catch(InterruptedException e){System.out.println(e);}    
            System.out.println(i);    
        }    
    }    
    public static void main(String args[])  
    {    
    Suspend t1=new Suspend();    
        Suspend t2=new Suspend(); 
     Suspend t3=new Suspend(); 
t1.start();
t2.start();
t2.suspend();
t3.start();
}
}