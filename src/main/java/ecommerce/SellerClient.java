package ecommerce;

import socketTest.EchoClient;

import java.io.*;
import java.net.Socket;

public class SellerClient {
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public void startConnection(String ip, int port) {
        try {
            clientSocket = new Socket(ip, port);
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String sendMessage(String msg) {
        try {
            out.println(msg);
            return in.readLine();
        } catch (Exception e) {
            return null;
        }
    }

    public void stopConnection() {
        try {
            in.close();
            out.close();
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


        public static void main(String[] args) throws IOException {
            EchoClient client1 = new EchoClient();
            client1.startConnection("127.0.0.1", 5555);
            File file = new File("src/main/resources/file1.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null) {
                String msg1 = client1.sendMessage(st);
                System.out.println(msg1);
            }

    }
}
