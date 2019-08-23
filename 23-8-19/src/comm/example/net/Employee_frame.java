package comm.example.net;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;

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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class Employee_frame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee_frame frame = new Employee_frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private RS2XMLConfig config = null;
	/**
	 * Create the frame.
	 */
	public Employee_frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 600, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(10, 11, 46, 14);
		contentPane.add(lblId);
		
		JLabel lblFirstname = new JLabel("FirstName");
		lblFirstname.setBounds(10, 36, 58, 14);
		contentPane.add(lblFirstname);
		
		JLabel lblLastname = new JLabel("LastName");
		lblLastname.setBounds(10, 63, 58, 14);
		contentPane.add(lblLastname);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(10, 88, 46, 14);
		contentPane.add(lblEmail);
		
		textField = new JTextField();
		textField.setBounds(95, 8, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(95, 33, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(95, 60, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		textField_3 = new JTextField();
		textField_3.setBounds(95, 85, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				NetworkingServer server = new NetworkingServer();
				try {
					server.display(Integer.parseInt(textField.getText().toString()), textField_1.getText().toString(), textField_2.getText().toString(), textField_3.getText().toString());
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnAdd.setBounds(92, 116, 89, 23);
		contentPane.add(btnAdd);
		
		textField_4 = new JTextField();
		textField_4.setBounds(244, 8, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblSearchId = new JLabel("Search ID");
		lblSearchId.setBounds(191, 11, 64, 14);
		contentPane.add(lblSearchId);
		
		table = new JTable();
		table.setBounds(191, 63, 233, 74);
		contentPane.add(table);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Socket client = null;
		        int portnumber = 1234;
				try {
	                String msg = "";
	                
	                // Create a client socket
	                
	                client = new Socket(InetAddress.getLocalHost(), portnumber);
	                System.out.println("Client socket is created " + client);
	                
	                // Create an output stream of the client socket
	                OutputStream clientOut = client.getOutputStream();
	                PrintWriter pw = new PrintWriter(clientOut, true);
	                
	                // Create an input stream of the client socket
	                InputStream clientIn = client.getInputStream();
	                BufferedReader br = new BufferedReader(new
	                        InputStreamReader(clientIn));
	                
	                // Create BufferedReader for a standard input
	                BufferedReader stdIn = new BufferedReader(new
	                        InputStreamReader(System.in));
	                
	                System.out.println("Enter your name. Type Bye to exit. ");
	                
	                // Read data from standard input device and write it
	                // to the output stream of the client socket.
	                msg = textField_4.getText().toString();
	                pw.println(msg);
	                
	                // Read data from the input stream of the client socket.
	                System.out.println("Message returned from the server = " + br.readLine());
	                
	                pw.close();
	                br.close();
	                client.close();
	                
	                // Stop the operation
//	                if (msg.equalsIgnoreCase("Bye")) {
//	                    break;
//	                }
	                
	            } catch (IOException ie) {
	                System.out.println("I/O error - Start server and turn off Firewall" + ie);
	            }
				/*NetworkingServer server = new NetworkingServer();
				try {
					ResultSet result = server.search(Integer.parseInt(textField_4.getText()));
					table.setModel(DbUtils.resultSetToTableModel(result));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
			}
		});
		btnSearch.setBounds(244, 32, 89, 23);
		contentPane.add(btnSearch);
	}
}
