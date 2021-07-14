import java.net.*;
import java.io.*;
// represents communication link between URL and application
//This class can be used to read and write data to an specified resource referred by the URL
public class URLConnectionClass {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://solarfunda.com/about/");
            // openConnection()=> returns an object of URL connection class
            // Syntax: public URLConnection openConnection throws IOException{}
            URLConnection connection = url.openConnection();
            // System.out.println("Filename:" + url.openConnection());
            // System.out.println(" The time out time of connection is : " + connection.getConnectTimeout());

            // getInputStream()=> returns all the data of the specified URL in the stream
            // that can be read and displayed(how the data can be read from distant
            // socket/another socket to the current socket)

            InputStream stream=connection.getInputStream();

            int b;
            while((b=stream.read())!= -1){
                System.out.print((char)b);
            }


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
