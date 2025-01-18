import java.util.Scanner;

class Student {
    String name;

    // Constructor to initialize the name
    public Student(String name) {
        this.name = name;
    }
}

class C extends Student {
    String name;

    
    public C(String studentName, String name) {
        super(studentName);
        this.name = name;
    }

    void display() {
        System.out.println("Student name in class C: " + name);
        System.out.println("Student name in superclass (Student): " + super.name);
    }
}

 class B {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter student's name: ");
        String studentName = scanner.nextLine();


        System.out.print("Enter name for class C: ");
        String cName = scanner.nextLine();


        C obj = new C(studentName, cName);


        obj.display();


    }
}

