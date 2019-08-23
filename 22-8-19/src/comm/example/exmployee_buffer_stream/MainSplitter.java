package comm.example.exmployee_buffer_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

import comm.example.model.Employee;
import comm.example.service.EmployeeService;
import comm.example.service.EmployeeServiceImpl;

public class MainSplitter {
	
	public static void main(String[] args) throws IOException, SQLException {
		// TODO Auto-generated method stub
		int id;
		String fName;
		String lName;
		String email;
		FileReader outFile = new FileReader("employee.txt");
		BufferedReader reader = new BufferedReader(outFile);
		EmployeeService emp = new EmployeeServiceImpl();
		String line =reader.readLine();
		while(line != null) {
			String arr[] = line.split(" ");
			id = Integer.parseInt(arr[0]);
			fName = arr[1];
			lName = arr[2];
			email = arr[3];
			emp.createEmployee(new Employee(id,fName,lName,email));
			line = reader.readLine();
		}
		reader.close();
		outFile.close();
	}
}