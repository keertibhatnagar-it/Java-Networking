// Java Program to illustrate server side implementation using DatagramSocket

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.Scanner;

public class UDPclient {
    public static void main(String args[]) throws IOException{
        Scanner sc= new Scanner(System.in);
        // 1. Creating the socket object for carrying the Data
        DatagramSocket ds=new DatagramSocket();
        InetAddress ip = InetAddress.getLocalHost(); 
        byte[] buf=null;
        // loop while user input is not bye
        while(true){
            String str=sc.nextLine();
        // converting string into array type
            buf=str.getBytes();
            // 2. Creating the Datagram socket for sending the Data
            DatagramPacket DpSend=new DatagramPacket(buf, buf.length,ip, 1234);
            // 3. Invoke the send call to actually send the Data
            ds.send(DpSend);
            // breakup the loop if user enters bye 
            if(str.equals("bye"))
            break;
        }   
    }
}