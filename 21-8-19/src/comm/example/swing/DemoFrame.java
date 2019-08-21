package comm.example.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import comm.example.model.Employee;
import comm.example.service.EmployeeService;
import comm.example.service.EmployeeServiceImpl;

import javax.swing.JLabel;
import javax.swing.JTextField;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;

public class DemoFrame extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoFrame frame = new DemoFrame();
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
	public DemoFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow][grow][grow]", "[][][][][][][][]"));
		
		JLabel lblNewLabel = new JLabel("Employee ID");
		contentPane.add(lblNewLabel, "cell 0 0");
		
		textField = new JTextField();
		contentPane.add(textField, "cell 1 0,growx");
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		contentPane.add(lblNewLabel_1, "cell 0 1");
		
		textField_1 = new JTextField();
		contentPane.add(textField_1, "cell 1 1,alignx right");
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name");
		contentPane.add(lblNewLabel_2, "cell 0 2");
		
		textField_2 = new JTextField();
		contentPane.add(textField_2, "cell 1 2,growx");
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		contentPane.add(lblNewLabel_3, "cell 0 3");
		
		textField_3 = new JTextField();
		contentPane.add(textField_3, "cell 1 3,growx");
		textField_3.setColumns(10);
		
		JButton btnNewButton = new JButton("Add details");
		btnNewButton.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					EmployeeService emp = new EmployeeServiceImpl();
					emp.createEmployee(new Employee(Integer.parseInt(textField.getText()),textField_1.getText().toString(),textField_2.getText().toString(),textField_3.getText().toString()));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		contentPane.add(btnNewButton, "cell 0 5");
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				
			}
		});
		contentPane.add(btnNewButton_1, "cell 1 5");
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					EmployeeService service = new EmployeeServiceImpl();
					service.modifyEmployeeFName(Integer.parseInt(textField.getText().toString()), textField_1.getText().toString());
					service.modifyEmployeeLName(Integer.parseInt(textField.getText().toString()), textField_2.getText().toString());
					service.modifyEmployeeEmail(Integer.parseInt(textField.getText().toString()), textField_3.getText().toString());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		contentPane.add(btnUpdate, "cell 2 5");
		
		JButton btnViewDetails = new JButton("View Details");
		btnViewDetails.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					new MyFrame2();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		contentPane.add(btnViewDetails, "cell 0 7");
		
		textField_4 = new JTextField();
		contentPane.add(textField_4, "cell 1 7,growx");
		textField_4.setColumns(10);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					EmployeeService service = new EmployeeServiceImpl();
					service.removeEmployee(Integer.parseInt(textField_4.getText()));
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		contentPane.add(btnDelete, "cell 2 7");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
