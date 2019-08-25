import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import comm.example.service.AeroplaneService;
import comm.example.service.AeroplaneServiceImpl;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Aeroplane extends JFrame {

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
					Aeroplane frame = new Aeroplane();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public Aeroplane() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
					config = new RS2XMLConfig();
					ResultSet rs = config.getFlightDetails(Integer.parseInt(textField.getText().toString()));
					if(rs.next()) {
						name = rs.getString("name");
						seat = rs.getInt("seats");
						label.setText(name);
						label_1.setText(Integer.toString(seat));
					}
					else {
						label_2.setText("ID doesnot exist...");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				if(seat == 0) {
					label_3.setText("No seats are available longer...");
					btnBookNow.setEnabled(false);
				}
				else {
					btnBookNow.setEnabled(true);
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
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
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
