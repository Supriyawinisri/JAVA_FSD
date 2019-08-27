import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Aeroplane_client extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private RS2XMLConfig config = null;
	private JTextField textField_1;
	private int seat;
	private String name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aeroplane_client frame = new Aeroplane_client();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Socket client = null;
    int portnumber = 2345;
	
	/**
	 * Create the frame.
	 * @throws IOException 
	 * @throws UnknownHostException 
	 */
	public Aeroplane_client() throws UnknownHostException, IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		client = new Socket(InetAddress.getLocalHost(), portnumber);
        System.out.println("Client socket is created " + client);
        
        OutputStream clientOut = client.getOutputStream();
        PrintWriter pw = new PrintWriter(clientOut, true);
        
        InputStream clientIn = client.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(clientIn));
		
		JLabel lblAeroplaneId = new JLabel("Flight ID:");
		lblAeroplaneId.setBounds(21, 34, 77, 14);
		contentPane.add(lblAeroplaneId);
		
		textField = new JTextField();
		textField.setBounds(72, 31, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAeroplaneN = new JLabel("Flight Name");
		lblAeroplaneN.setBounds(21, 81, 94, 14);
		contentPane.add(lblAeroplaneN);
		
		JLabel lblNoOfSeats = new JLabel("No. of Seats");
		lblNoOfSeats.setBounds(136, 81, 77, 14);
		contentPane.add(lblNoOfSeats);
		
		JLabel label = new JLabel("-");
		label.setBounds(21, 106, 105, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("-");
		label_1.setBounds(136, 106, 46, 14);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel("");
		label_2.setBounds(247, 81, 161, 14);
		contentPane.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(146, 140, 94, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		JLabel label_3 = new JLabel("");
		label_3.setBounds(146, 202, 263, 14);
		contentPane.add(label_3);
		
		JButton btnSearch = new JButton("Search");
		JButton btnBookNow = new JButton("Book Now");
		JButton btnRefresh = new JButton("Refresh");
		
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
	                String msg = "";
	                	                
	                System.out.println("Enter your name. Type Bye to exit. ");
	                msg = textField.getText().toString();
	                pw.println(msg);
	                //value stores the details from the server
	                String value = br.readLine();
	                System.out.println("Message returned from the server = " + value);
	                String details[] = value.split(" ");
	                label.setText(details[0]);
	                label_1.setText(details[1]);
	                pw.close();
	                br.close();
	                client.close();
	            } catch (IOException ie) {
	                System.out.println("I/O error - Start server and turn off Firewall" + ie);
	            }
			}
		});
		btnSearch.setBounds(161, 30, 77, 23);
		contentPane.add(btnSearch);
		
		JLabel lblSeatsToBe = new JLabel("Seats to be booked:");
		lblSeatsToBe.setBounds(21, 143, 105, 14);
		contentPane.add(lblSeatsToBe);
		
		btnBookNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int update_seat = Integer.parseInt(textField_1.getText().toString());
				if(update_seat <= seat) {
					int count = seat - update_seat;
					try {
						config.updateFlightDetails(Integer.parseInt(textField.getText().toString()), count);
						label_3.setText(update_seat+" seats are booked...");
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				else {
					label_3.setText(update_seat+" seats are not available...");
				}
			}
		});
		btnBookNow.setBounds(144, 168, 94, 23);
		contentPane.add(btnBookNow);
		
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				label.setText("-");
				label_1.setText("-");
				label_2.setText("");
				label_3.setText("");
			}
		});
		btnRefresh.setBounds(335, 30, 89, 23);
		contentPane.add(btnRefresh);
		
		
	}
}
