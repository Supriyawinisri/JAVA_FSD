package comm.example.net;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Network extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Network frame = new Network();
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
	public Network() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Number");
		lblNewLabel.setBounds(27, 40, 46, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(108, 37, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnResult = new JButton("Result");
		btnResult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				int n = Integer.parseInt(textField.getText().toString());
				NetworkingServer server = new NetworkingServer();
				int fact = server.fact(n);
				textField_1.setText(Integer.toString(fact));
			}
		});
		btnResult.setBounds(105, 116, 89, 23);
		contentPane.add(btnResult);
		
		JLabel lblResult = new JLabel("Result");
		lblResult.setBounds(27, 81, 46, 14);
		contentPane.add(lblResult);
		
		textField_1 = new JTextField();
		textField_1.setBounds(108, 78, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
