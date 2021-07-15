import java.net.*;

public class DatagramSocket {
    // Sender Side
    public static void main(String[] args) throws Exception {  
        DatagramSocket ds = new DatagramSocket();  
        String str = "Welcome java";  
        InetAddress ip = InetAddress.getByName("127.0.0.1");  
         
        DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);  
        ds.send(dp);  
        ds.close();  
      } 
      /* 
    // Receiver Side

    public static void main(String[] args) throws Exception {  
        DatagramSocket ds = new DatagramSocket(3000);  
        byte[] buf = new byte[1024];  
        DatagramPacket dp = new DatagramPacket(buf, 1024);  
        ds.receive(dp);  
        String str = new String(dp.getData(), 0, dp.getLength());  
        System.out.println(str);  
        ds.close();  
      }  
      */
}

/*
DatagramSocket class represents a connection-less socket for sending and recieving datagram packets.

A datagram is basically an information but there is no gurantee of its content, arrival and arrival time

Java DatagramPacket is a message that can be sent or received. 
If you send multiple packet, it may arrive in any order. 
No guarantee of packet delivery.
Commonly used Constructors of DatagramPacket class are:
1. DatagramPacket(byte[] barr, int length): 
it creates a datagram packet. This constructor is used to receive the packets.
2. DatagramPacket(byte[] barr, int length, InetAddress address, int port): 
it creates a datagram packet. This constructor is used to send the packets.

Constructors used by datagram class are:

1. DatagramSocket() throws SocketException
It creates a datagram socket and binds it with the available Port Number on the localhost machine.

2. DatagramSocket(int port) throws SocketException
It creates a datagram socket and binds it with the available Port Number on the localHost machine.

3. DatagramSocket(int port) throws SocketException
It creates a datagram socket and binds it with the given Port Number

4. DatagramSocket(int port, InetAddress address) throws SocketException
It creates a datagram socket and binds it with the specified port number and host address

Important methods of Datagram Socket

public InetAddress getAddress()=>returns destination IP Address
public int getPort()=>returns integer destination port number
*public byte[] getData()=> returns byteArrayof data contained in the datagram.
ALso, used to retrieve data from datagram after it has been recieved
public int getLength()=>returns length of valid data contained in byte array
*/
