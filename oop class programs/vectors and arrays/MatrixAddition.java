import java.util.*;
 class MatrixAddition {
  public static void main(String[] args) 
    {
        int r1,c1,r2,c2;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows and columns of first matrix:");
        r1 = s.nextInt();
         c1 = s.nextInt();
        System.out.print("Enter number of rows and columns of second matrix:");
        r2= s.nextInt();
           c2= s.nextInt();
            int a[][] = new int[r1][c1];
            int b[][] = new int[r2][c2];
            int c[][] = new int[r2][c2];
        if (r1 == r2 && c1 == c2) 
        {
           
            System.out.println("Enter all the elements of first matrix:");
            for (int i = 0; i < r1; i++) 
            {
                for (int j = 0; j < c1; j++) 
                {
                    a[i][j] = s.nextInt();
                }
            }
            System.out.println("Enter all the elements of second matrix:");
            for (int i = 0; i < r2; i++) 
            {
                for (int j = 0; j < c2; j++) 
                {
                    b[i][j] = s.nextInt();
                }
            }
            System.out.println("First Matrix:");
            for (int i = 0; i < r1; i++) 
            {
                for (int j = 0; j < c1; j++) 
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println("Second Matrix:");
            for (int i = 0; i < r2; i++) 
            {
                for (int j = 0; j < c2; j++) 
                {
                    System.out.print(b[i][j]+" ");
                }
                System.out.println("");
            }
            for (int i = 0; i < r2; i++) 
            {
                for (int j = 0; j < c2; j++) 
                {
                  
                        c[i][j] = a[i][j] + b[i][j];
                    }
                }
            
            System.out.println("Matrix after addition:");
            for (int i = 0; i < r2; i++) 
            {
                for (int j = 0; j < c2; j++) 
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
    }
        else
        {
            System.out.println("Addition would not be possible");
        }
    }  
}
