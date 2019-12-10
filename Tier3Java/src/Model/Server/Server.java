package Model.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {


    public Server() throws IOException {
        final int PORT = 6789;
        System.out.println("Starting Model.Server.Server...");
        // create welcoming socket at port 6789
        ServerSocket welcomeSocket = new ServerSocket(PORT);
        while (true) {
            System.out.println("Waiting for a client...");
            Socket socket = welcomeSocket.accept();
            Thread clientThread = new Thread(new ClientHandler(socket));
            clientThread.start();
        }
    }
}

