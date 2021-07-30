import java.net.SocketException;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.InetAddress;
// Dialog Client Server Example in the same machine
public class Dialog_Server_Side {
    public static void main(String[]args) throws IOException{
        DatagramSocket ds=new DatagramSocket(1234);
        byte[] buf=new byte[56628];
        DatagramPacket dpReceive =null;
        while(true){
            dpReceive =new DatagramPacket(buf, buf.length);
            ds.receive(dpReceive);
            System.out.println("client:-"+ data(buf));
            if(data(buf).toString().equals("bye")){
                System.out.println("Client said bye..EXITING...");
                break;
            }
            buf=new byte[56628];//clear buffer after every message
        }
    }
//method to convert byte array into string representation
    public static StringBuilder data (byte[] b) {
        if(b==null)
        return null;
        StringBuilder ret=new StringBuilder();
        int i=0;
        while(b[i]!=0){
            ret.append((char) b[i]);
            i++;
        }
        return ret;
    }
}
