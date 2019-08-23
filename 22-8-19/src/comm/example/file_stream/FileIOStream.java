package comm.example.file_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOStream  {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			FileInputStream input = new FileInputStream(new File("open.txt"));
			FileOutputStream output = new FileOutputStream(new File("output.txt"));
			int c;
			while((c = input.read())!=-1) {
				System.out.println(c);
				output.write(c);
			}
			input.close();
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
