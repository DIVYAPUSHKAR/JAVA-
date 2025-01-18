import java.io.*;  
import java.sql.*;  
  
class StoreFile {  
public static void main(String[] args) {  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/latha","root","Arjun@5808");  
 Statement s = con.createStatement();
        s.executeUpdate(
            "CREATE TABLE documents (id INT, text LONGTEXT)");

        // - first, create an input stream
        InputStream fis = new FileInputStream("asciifile.txt");
              
  PreparedStatement ps = con.prepareStatement(
            "INSERT INTO documents VALUES (?, ?)");
        ps.setInt(1, 1477);

        // - set the value of the input parameter to the input stream
        ps.setAsciiStream(2, fis);
      
int i=ps.executeUpdate();  
System.out.println(i+" records affected");  
              
con.close();  
              
}catch (Exception e) {e.printStackTrace();}  
}  
}  