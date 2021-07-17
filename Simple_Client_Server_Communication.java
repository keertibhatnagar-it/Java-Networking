import java.io.*;
import java.net.*;

// SERVER PROGRAM

public class Simple_Client_Server_Cmmunication {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();// establishes connection

            DataInputStream dis = new DataInputStream(s.getInputStream());

            String str = (String) dis.readUTF();
            System.out.println("message=" + str);
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

//CLIENT PROGRAM
/*
public class Simple_Client_Server_Cmmunication {
    public static void main(String[] args) {
        try{
            Socket s=new Socket("localhost",6666);
            DataOutputStream dout=new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello Server");
            dout.flush();
            dout.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
*/
