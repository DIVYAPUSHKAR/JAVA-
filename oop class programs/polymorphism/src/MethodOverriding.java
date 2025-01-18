/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RGUKT
 */
public class MethodOverriding {

	void Print()
	{
	System.out.println("parent class");
	}
}


class subclass1 extends MethodOverriding{

	// Method
	void Print() { System.out.println("subclass1"); }
}

// Class 3
// Helper class
class subclass2 extends MethodOverriding {

	// Method
	void Print()
	{

		// Print statement
		System.out.println("subclass2");
	}
}


class GFG {

	
	public static void main(String[] args)
	{

			MethodOverriding a;
                                a = new subclass1();
		          a.Print();

		a = new subclass2();
		a.Print();
          
                
            
	}
}


