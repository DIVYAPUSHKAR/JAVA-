
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RGUKT
 */
public class binary {
  
	public static void main(String[] args){
	int i,j,n,search;
	int first,mid,last,temp;
	Scanner s=new Scanner(System.in);
	System.out.print("Enter size:");
	n=s.nextInt();			
	int a[]=new int[n];
                   System.out.print("Enter elements:");
                   for(i=0;i<n;i++){
      	a[i]=s.nextInt();
    		}
    			
    	    	//sorting
    	for(i=0;i<n;i++){
    	for(j=i+1;j<n;j++){
    	if(a[i]>a[j]){
    	temp=a[i];
    	a[i]=a[j];
    	a[j]=temp;
    	}
    	}
    	}
	for(i=0;i<n;i++){
	System.out.print(a[i]+" ");
	}
        System.out.print("Enter search element:");
    	search=s.nextInt();
   	first=0;
   	last=n-1;
   	
    while(first<=last){
        mid=((first+last)/2);
      if(search==a[mid]){
    System.out.println("Search found  at "+(mid+1)+"location");
    break;
    }
   else if(search>a[mid]){
    first=mid+1;
    }
    else{
    	   last=mid-1;
	}

	}
  
    System.out.println("Search not found");
}
}



