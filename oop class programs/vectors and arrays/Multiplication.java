
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RGUKT
 */
public class Multiplication {
    public static void main(String args[])
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
            int c[][] = new int[r1][c2];
            if(c1==r2)
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
        System.out.println("Multiplying the matrices...");
        for (int i = 0; i < r1; i++)
        {
            for (int j = 0; j < c2; j++)
            {
                c[i][j]=0;
                for (int k = 0; k < c1; k++)
                {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("The product is:");
        for (int i = 0; i < r1; i++)
        {
            for (int j = 0; j < c2; j++)
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
            }
            else
                System.out.println("multiplication not possible");
    }

}
