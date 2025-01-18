import java.util.Scanner;
class pro2
{
int quantity;
double price;String name;
String id;
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
pro2 p=new pro2();
System.out.println("Choose product from given list");
System.out.println("product 1: 99.90\nproduct 2: 20.20\nproduct 3: 6.87\nproduct 4: 45.50\nproduct 5: 45.59\n");
System.out.println("Please enter required product : ");
int n=sc.nextInt();
switch(n)
{
case 1:
{
p.price=99.90;
System.out.println("Enter the name of product :");
p.name=sc.next();
System.out.println("Enter the id :");
p.id=sc.next();
System.out.println("Enter the quantity of product :");
p.quantity=sc.nextInt();
System.out.println("Total price of product is: "+(p.quantity)*(p.price));
break;
}
case 2:
{
p.price=20.20;
System.out.println("Enter the name of product :");
p.name=sc.next();
System.out.println("Enter the id :");
p.id=sc.next();
System.out.println("Enter the quantity of product :");
p.quantity=sc.nextInt();System.out.println("Total price of product is: "+(p.quantity)*(p.price));
break;
}
case 3:
{
p.price=6.87;
System.out.println("Enter the name of product :");
p.name=sc.next();
System.out.println("Enter the id :");
p.id=sc.next();
System.out.println("Enter the quantity of product :");
p.quantity=sc.nextInt();
System.out.println("Total price of product is: "
+(p.price)*(p.quantity));
break;
}
case 4:
{
p.price=45.50;
System.out.println("Enter the name of product :");
p.name=sc.next();
System.out.println("Enter the id :");
p.id=sc.next();
System.out.println("Enter the quantity of product :");
p.quantity=sc.nextInt();
System.out.println("Total price of product is: "
+(p.price)*(p.quantity));
break;
}
case 5:
{
p.price=45.49;
System.out.println("Enter the name of product :");
p.name=sc.next();
System.out.println("Enter the id :");
p.id=sc.next();
System.out.println("Enter the quantity of product :");
p.quantity=sc.nextInt();
System.out.println("Total price of product is: "+(p.price)*(p.quantity));
break;
}
default :
System.out.println("Please enter valid number");
}
}
}
