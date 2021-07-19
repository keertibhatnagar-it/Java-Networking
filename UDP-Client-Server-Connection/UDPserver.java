
// Java Program to illustrate server side implementation using DatagramSocket
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPserver {
public static void main(String[]args)throws IOException{
    // 1. Creating a socket to listen at port 1234
    DatagramSocket ds = new DatagramSocket(1234);
    byte[] receive = new byte[65535];// string array or temporary byte buffer

    DatagramPacket DpReceive=null;
    while(true)
    {
        // 2.Creating a datagram packet to recieve the data
        DatagramPacket dp = new DatagramPacket(receive, receive.length);

        // 3.Recieving the data in byte buffer
        ds.receive(DpReceive);
        System.out.println("Client:-" + data(receive));

        // Exits the server if the client sends "bye"
        if(data(receive).toString().equals("bye")){
            System.out.println("Client Says bye...Exiting");
            break;
        }
        // Clear the buffer after every message
        receive=new byte[65535];
    }
}
    // A utility method to convert byte array data into String representation
    public static StringBuilder data(byte[] a){
        if(a==null)
            return null;
        StringBuilder ret=new StringBuilder();
        int i=0;
        while(a[i]!=0){
            ret.append(ret.append((char) a[i]));
            i++;
        }
        return ret;
    }
}
