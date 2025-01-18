import java.util.*;
class E_bookstall
{
    int book_count,customer_id,customer_b_c;
    String book_name,book_author,customer_name,customer_add;
    void book_details( int B_c,String B_n,String B_a)
    {
        book_count=B_c;
        book_name=B_n;
        book_author=B_a;
    }
    void customer_details( int C_i,int customer_b_c,String C_n,String C_add)
    {
        customer_id=C_i;
        this.customer_b_c=customer_b_c;
        customer_name=C_n;
        customer_add=C_add;
    }
    void display(String b_n,int b_c)
    {
        book_name=b_n;
        book_count=b_c;
        System.out.println("book name: "+b_n+"\n"+"book_count: "+(b_c-customer_b_c));
    }
    public static void main(String...args)
    {
        E_bookstall obj=new E_bookstall();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the n value:");
        int n=sc.nextInt();
        System.out.println("enter the customer name");
        String c_n=sc.next();
        System.out.println("enter the customer id");
        int c_id=sc.nextInt();
        System.out.println("enter the customer Adderess");
        String c_add=sc.next();
        for( int i=1;i<=n;i++)
        {
            System.out.println("enter the customer book count  for  book"+i);
            int c_b_c=sc.nextInt();
            obj.customer_details(c_id,c_b_c,c_n,c_add);
            
            System.out.println("enter the  book name: ");
            String b_n=sc.next();
            System.out.println("enter the  book author: ");
            String b_a=sc.next();
            System.out.println("entre the   book's count available in E_bookstall: ");
            int b_c=sc.nextInt();
            obj.book_details(b_c,b_n,b_a);
            obj.display(b_n,b_c);
        }
    }
}
