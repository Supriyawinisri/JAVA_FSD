package comm.example.swing;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener {
	
	private JLabel label1;
	private JTextField textfield1;
	private JButton button1;

	public MyFrame() throws HeadlessException {
		
		super();
		label1 = new JLabel();
		label1.setText("Enter your name: ");
		textfield1 = new JTextField(25);
		button1 = new JButton();
		button1.setText("Say Hello");
		button1.addActionListener(this);
		setTitle("MyFrameExample");
		setSize(400, 400);
		setLayout(new FlowLayout());
		add(label1);
		add(textfield1);
		add(button1);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(this, "Hello "+textfield1.getText().toString());
	}
}
