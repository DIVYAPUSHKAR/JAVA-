import java.sql.*;
class Insert{
public static void main(String args[]){
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/oop1","root","Arjun@5808");
System.out.println("database connected");
PreparedStatement stmt=con.prepareStatement("insert into student2 values(?,?,?)");
stmt.setInt(1,15);
stmt.setString(2,"cse");
stmt.setInt(3,100);

int i=stmt.executeUpdate();
System.out.println(i+" records inserted");
con.close();
}catch(Exception e){ System.out.println("not connected with database");}
}
}
