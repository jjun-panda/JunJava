package java10_stu;

import java.io.*;
import java.net.*;
import java.nio.*;

public class Client {
    public static void main(String[] args) {
        BufferedReader in = null;
        BufferedWriter out = null;
        Socket socket = null;
        Scannner scanner = new Scanner(System.in);
        try {
            socket = new Socket("localhost", 9999);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            while(true) {
                System.out.println("보내기>> ");
                String outputMessage = scanner.nextLine();
                if(outputMessage.equalslgnoreCase("bye")) {
                    out.write(outputMessage + "\n");
                    out.flush();
                    break;
                }
                out.write(outputMessage + "\n");
                out.flush();
                String inputMessage = in.readLine();
                System.out.println("서버: " + inputMessage);
            }

        }
    }
}
