package comm.example.encryption;

import java.io.IOException;

public class BufferReaderWriter {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		String a0,a1,a2;
		if(args.length !=3) {
			a0="words.txt";
			a1="wordsout.txt";
			a2="3";
		}
		else {
			a0=args[0];
			a1=args[1];
			a2=args[2];
		}
		
		SimpleEncryption se = new SimpleEncryption();
		se.encrypt(a0, a1, Integer.parseInt(a2));
		
		System.out.println("Displaying the encrypted words with vowel count...");
		se.viewFileContent(a1);
	}

}
