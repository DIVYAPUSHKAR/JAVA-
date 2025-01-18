class Command {
 
    public static void main(String[] args)
    {
        // Printing the first argument
        System.out.println("first arguement " +args[0]);
int i;
for(i=0;i<args.length;i++)
{
System.out.println("args["+i+"]:"+args[i]);
}
    }
}