// InetClass represents an IP Address.
// There are two types of address types: Unicast and Multicast. 
// The Unicast is an identifier for a single interface whereas Multicast is an identifier for a set of interfaces.

//  InetAddress has a cache mechanism to store successful and unsuccessful host name resolutions.

// It has following methods:
// 1. public static InetAddress getByName(String host) throws UnknownHostException
// returns the object/instance of Inet Address containing LocalHost IP and name 

// 2. public static InetAddress getLocalHost() throws UnknownHostException
// returns the object/instance of Inet Address containing HostName and Address 

// 3. public String getHostName()
// returns the HostName of the IP Address

// 4. public String getHostAddress()
// returns IP Address in String format

// 5. public URLConnection openConnection()
// returns the object/instance of URLConnection i.e. associated with this URL
import java.net.*;
import java.io.*;
public class InetAddressClass {
    public static void main(String[]args){
        try{
            InetAddress ip=InetAddress.getByName("www.solarfunda.com");
            System.out.println("Host Name:"+ip.getHostName());
            System.out.println("IP Address:"+ip.getHostAddress());
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
