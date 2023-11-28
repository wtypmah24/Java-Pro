package lesson_18_client_server;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.nio.charset.Charset;

public class Main {
    /*
    * Напишите простое клиент-серверное приложение, которое сообщает клиенту текущую дату и время при подключении.*/
    public static void main(String[] args) {
        String host = "localhost";
        int port = 1515;
        try (Socket client = new Socket(host, port)) {
            System.out.println("Connect to server " + client.getRemoteSocketAddress());
            DataOutputStream toServer = new DataOutputStream(client.getOutputStream());
            toServer.writeUTF("Date");
            InputStream fromServer = client.getInputStream();
            String date = new String(fromServer.readAllBytes(), Charset.defaultCharset());
            System.out.println(date);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}