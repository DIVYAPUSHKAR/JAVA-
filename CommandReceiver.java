import java.io.*;
import java.net.*;
import java.awt.Desktop;

public class CommandReceiver {
    public static void main(String[] args) {
        int port = 5000; // Port to listen on
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server is listening on port " + port);

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("Client connected");

                BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String command = input.readLine();

                System.out.println("Received command: " + command);

                if ("open_file".equalsIgnoreCase(command)) {
                    // Replace with the file path you want to open
                    File file = new File("/home/rgukt-basar/Documents/java/horr.jpeg"); 
                    if (file.exists()) {
                        Desktop.getDesktop().open(file); // Open file using the default application
                        System.out.println("File opened successfully!");
                    } else {
                        System.out.println("File not found!");
                    }
                } else {
                    System.out.println("Unknown command received.");
                }

                socket.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

