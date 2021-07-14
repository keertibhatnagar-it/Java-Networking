import java.net.*;

class URLClass {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://solarfunda.com/about/");
            System.out.println("Protocol:" + url.getProtocol());
            System.out.println("Hostname:" + url.getHost());
            System.out.println("Portname:" + url.getPort());
            System.out.println("Filename:" + url.getFile());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
