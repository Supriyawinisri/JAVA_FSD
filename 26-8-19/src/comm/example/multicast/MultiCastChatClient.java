package comm.example.multicast;
import java.net.*;
import java.io.*;

public class MultiCastChatClient {
    
    public static void main(String args[]) throws Exception {
        
        int portnumber = 1236;
        MulticastSocket chatMulticastSocket = new MulticastSocket(portnumber);
        InetAddress group = InetAddress.getByName("224.0.0.1");
        
        chatMulticastSocket.joinGroup(group);
        // Prompt a user to enter a message
        while(true) {
        	String msg1 = "";
            System.out.println("Type a message for the server:");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            msg1 = br.readLine();
            DatagramPacket data1 = new DatagramPacket(msg1.getBytes(), 0, msg1.length(), group, portnumber);
            chatMulticastSocket.send(data1);
            
            byte buf[] = new byte[1024];
            DatagramPacket data = new DatagramPacket(buf, buf.length);
            chatMulticastSocket.receive(data);
            String msg = new String(data.getData()).trim();
            System.out.println(msg);
       }
    }
}