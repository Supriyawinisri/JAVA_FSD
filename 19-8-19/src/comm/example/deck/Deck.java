package comm.example.deck;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Deck {
	
	public static List<Card> list = new ArrayList<Card>();
	
	static {
		for(Suit s: Suit.values()) {
			for(Rank r: Rank.values()) {
				list.add(new Card(s,r));
			}			
		}
		Collections.shuffle(list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListIterator<Card> listIterator = list.listIterator();
		Scanner scr = new Scanner(System.in);
		System.out.println("No. of players:");
		int hand = scr.nextInt();
		System.out.println("No. of cards per player:");
		int cards = scr.nextInt();
		for (int i = 0; i < hand; i++) {
			System.out.println("\nPlayer "+(i+1)+"");
			for (int j = 0; j < cards; j++) {
				System.out.print(listIterator.next());
			}
		}
	}
}
