import java.util.*;
class addmatrix
{
public static void main(String args[])
{
int r,c,r1,c1,i,j;
Scanner s=new Scanner(System.in);
System.out.println("enter row and column size of matrix 1");
r=s.nextInt();
c=s.nextInt();
System.out.println("enter row and column size of matrix 2");
r1=s.nextInt();
c1=s.nextInt();
int a[][]=new int[r][c];
int b[][]=new int[r1][c1];
int result[][]=new int[r][c];
if(r==r1 && c==c1)
{
System.out.println("enter elements of matrix 1");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
a[i][j]=s.nextInt();
}
}
System.out.println("enter elements of matrix 2");
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
b[i][j]=s.nextInt();
}
}
System.out.println("Addition of matrices is ");
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
result[i][j]=a[i][j]+b[i][j];
}
}
for(i=0;i<r;i++)
{
for(j=0;j<c;j++)
{
System.out.print(result[i][j]+" ");
}
System.out.println();
}
}
else
System.out.println("addition is not possible");
}
}
