import java.net.*;
import java.io.*;

//works for HTTP protocol only
//can be used for extracting following information of any HTTP URL
    // # Header information
    // # Status code
    // # Response code

// Syntax to get the object of HTTP URL Connection class using typecasting
    // public URLConnection openConnection() throwsIOException{}
    // URL url=new URL("http://solarfunda.com/about/");
    // HttpURLConnection huc= (HttpURLConnection) url.openConnection();

public class HttpURLConnectionClass {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://solarfunda.com/about/");
            HttpURLConnection head=(HttpURLConnection)url.openConnection();
            int i;
            for(i=0;i<9;i++){
                // getHeaderFieldKey(int n)=>returns the information in the header field
                System.out.println(head.getHeaderFieldKey(i)+"="+head.getHeaderField(i));
            }
            head.disconnect();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
    // getHeaderField(java.lang.String name)=>returns all the header field
    // There are many more methods in this class
