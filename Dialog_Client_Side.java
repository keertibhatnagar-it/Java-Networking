import java.net.SocketException;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.Scanner;

public class Dialog_Client_Side {
    public static void main(String[]args) throws IOException{
        Scanner sc=new Scanner(System.in);
        DatagramSocket ds= new DatagramSocket();

        InetAddress ip=InetAddress.getLocalHost();
        byte buf[]=null;

        while(true){
            String str=sc.nextLine();
            //convert string input to byte array
            buf=str.getBytes();
            DatagramPacket dp=new DatagramPacket(buf, buf.length, ip, 1234);
            //invoke the send call to actually send
            ds.send(dp);
            //break loop if user enters bye
            if(str.equals("bye"))
            break;
        }
    }
}
