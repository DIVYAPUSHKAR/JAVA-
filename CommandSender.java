import java.io.*;
import java.net.*;

public class CommandSender {
    public static void main(String[] args) {
        // Replace with the IP address of the server
        String hostname = "127.0.0.1"; 
        int port = 5000; // Port to connect to

        try (Socket socket = new Socket(hostname, port);
             PrintWriter output = new PrintWriter(socket.getOutputStream(), true)) {

            String command = "open_file"; // Command to send
            output.println(command);
            System.out.println("Command sent: " + command);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

