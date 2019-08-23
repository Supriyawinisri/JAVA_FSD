package comm.example.encryption;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleEncryption {
	
	private int count;
	private BufferedReader reader;

	void encrypt(String source, String dest, int shift) throws IOException {
		BufferedWriter writer;
		try {
			reader = new BufferedReader(new FileReader(source));
			writer = new BufferedWriter(new FileWriter(dest));
			String line = reader.readLine();
			int data;
			while(line != null) {
				count = 0;
				for (int i=0; i<line.length(); i++) {					
					data = (int) line.charAt(i) + shift;
					if(line.charAt(i)=='a'||line.charAt(i)=='e'||line.charAt(i)=='i'||line.charAt(i)=='o'||line.charAt(i)=='u'||line.charAt(i)=='A'||line.charAt(i)=='E'||line.charAt(i)=='I'||line.charAt(i)=='O'||line.charAt(i)=='U') {
						count++;
					}
					writer.write(data);
				}
				writer.write("-vowels:"+count+" "+'\n');
				line = reader.readLine();
			}
			reader.close();
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void viewFileContent(String filename) throws IOException {
		reader = new BufferedReader(new FileReader(filename));
		String line = reader.readLine();
		while(line != null) {
			System.out.println(line);
			line = reader.readLine();
		}
		reader.close();
	}

}
