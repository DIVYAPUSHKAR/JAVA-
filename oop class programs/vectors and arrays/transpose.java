
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RGUKT
 */
public class transpose {
     public static void main(String[] args) 
    {
        int r,c,i,j;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows  and columns of  matrix:");
        r = s.nextInt();
    
         c= s.nextInt();
         int a[][]=new int[r][c];
         int b[][]=new int[c][r];
             System.out.print("Enter number elements of  matrix:");
            for (i = 0; i < r; i++) {
            for( j = 0; j < c; j++) {
                a[i][j]=s.nextInt();
            }
            }
             for (i = 0; i < r; i++) {
            for( j = 0; j < c; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
             //transpose
              for(i = 0; i < r; i++)
  for(j = 0; j < c; j++) {
    b[j][i] = a[i][j];
  }
                 System.out.println("matrix transpose");
   for (i = 0; i < c; i++) {
            for( j = 0; j < r; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }            
}
}
