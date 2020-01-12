package com.dhy.lab.netty.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTest {

    private static final int portNumber = 10000;

    private void receive() throws IOException {
        ServerSocket serverSocket = new ServerSocket(portNumber);

        while (true) {

            Socket clientSocket = serverSocket.accept();
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            String request, response;
            while (null != (request = in.readLine())) {
                if ("done".equals(request)) {
                    System.out.println("测试进入");
                    break;
                }

                response = processRequest(request);
                System.out.println(response);

            }
        }


    }




    private String processRequest(String request) {

        return "完成";
    }


    public static void main(String[] args) throws IOException {
        SocketTest socketTest = new SocketTest();
        socketTest.receive();

    }
}
