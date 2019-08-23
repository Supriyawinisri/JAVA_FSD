package comm.example.cahr_stream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharIOStream {

	private static FileReader in;
	private static FileWriter out;

	public static void main(String[] args) throws IOException {
		in = new FileReader(new File("open.txt"));
		out = new FileWriter(new File("charstream.txt"));
		int c;
		while((c=in.read())!=-1) {
			System.out.println((char)c);
			out.write(c);
		}
	}

}
