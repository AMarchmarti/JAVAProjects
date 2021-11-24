package org.lasencinas;

import java.util.Scanner;

import java.io.*;
import java.net.*;

public class Server {
    private ServerSocket serverSocket;
    private Socket socket;
    private BufferedReader bufferedReader;
    private OutputStream bufferExit;

    public void toConnect(int port) {
        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Waiting for input connection...");
            socket = serverSocket.accept();
            System.out.println("Established connection with: " + socket.getInetAddress());
        } catch (Exception e) {
            System.out.println("Error to connect: " + e.getMessage());
        }
    }

    public void channels() {
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            bufferExit = socket.getOutputStream();
            bufferExit.flush();
        } catch (Exception e) {
            System.out.println("Error at channels " + e.getMessage());
        }
    }

    public void toReceive() {
        String input;
        try {
            do {
                input = bufferedReader.readLine();
                System.out.println(input);
            } while (!input.isEmpty());
        } catch (Exception e) {
            System.out.println("Error when receive: " + e.getMessage());
        }
    }

    public void toSend() {
        String web = "HTTP/1.1 200 OK\nContent-Type: text/html; charset=UTF-8\n\n<html>Hello " +
                socket.getInetAddress().getHostName() + "</html>";
        try {
            bufferExit.write(web.getBytes());
            System.out.println("Sending: \n\n" + web);
            bufferExit.flush();
        } catch (Exception e) {
            System.out.println("Error to send: " + e.getMessage());
        }
    }

    public void toClose() {
        try {
            serverSocket.close();
            socket.close();
            bufferedReader.close();
            bufferExit.close();
        } catch (Exception e) {
            System.out.println("Error to close: " + e.getMessage());
        }
    }

    public void runServer(int port) {
        while (true) {
            try {
                toConnect(port);
                channels();
                toReceive();
                toSend();
            } catch (Exception e) {
                System.out.println("Error when running server: " + e.getMessage());
            } finally {
                toClose();
            }
        }
    }

    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        Server s = new Server();
        System.out.println("Introdueix el port: ");
        int port = teclat.nextInt();
        teclat.close();
        while (true){
            s.runServer(port);
        }


    }
}
