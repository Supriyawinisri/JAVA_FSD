package comm.example;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LetterFrequency {
	
	private static String sentence;
	static TreeMap<Character,Integer> set = new TreeMap<Character, Integer>();
	private static Scanner scanner;
	
	public static TreeMap<Character,Integer> computeFrequency(){
		for(int i=0; i<sentence.length(); i++) {
			if(sentence.charAt(i)!='.' && sentence.charAt(i)!=' ') {
				int count = 0;
				for(int j=0; j<sentence.length(); j++) {
					if(sentence.charAt(i)==sentence.charAt(j)) {
						count++;
						set.put(sentence.charAt(i), count);
					}
				}
			}
		}
		return set;
	}
	
	public static void displayLetterFrequency(TreeMap<Character,Integer> frequencyMap) {
		for(Map.Entry<Character, Integer> entry : set.entrySet()) {
			int value = entry.getValue();
			System.out.print(entry.getKey()+" : ");
			for(int k=0; k<value; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Enter thr input string");
		sentence = scanner.nextLine();
		displayLetterFrequency(computeFrequency());
		
	}

}
