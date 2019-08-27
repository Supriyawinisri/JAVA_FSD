package comm.example.multicast;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

public class MultiCastChatServer {
    
    public static void main(String args[]) throws Exception {
        
        int portnumber = 1236;
        MulticastSocket serverMulticastSocket = new MulticastSocket(portnumber);        
        System.out.println("MulticastSocket is created...");
        InetAddress group = InetAddress.getByName("224.0.0.1");        
        serverMulticastSocket.joinGroup(group);
        System.out.println("joinGroup method is called...");
        boolean infinite = true;
        
        while(infinite) {
            byte buf[] = new byte[1024];
            DatagramPacket data = new DatagramPacket(buf, buf.length);
            serverMulticastSocket.receive(data);
            String msg =
                    new String(data.getData()).trim();
            System.out.println(msg);
            
            String msg1 = "";
            System.out.println("Type a message for the server:");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            msg1 = br.readLine();
            DatagramPacket data1 = new DatagramPacket(msg1.getBytes(), 0, msg1.length(), group, portnumber);
            serverMulticastSocket.send(data1);
        }
    }
}