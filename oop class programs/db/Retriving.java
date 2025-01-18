import java.sql.*;
public class Retriving {
public static void main(String[] args) {
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/oop1","root","Arjun@5808");
System.out.println("database connected");
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("select * from student2");
while(rs.next()) {
System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
}
con.close();
}catch(Exception e)
{
System.out.println("not connected");

}
}
}