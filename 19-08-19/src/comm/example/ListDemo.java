package comm.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> list = new ArrayList<String>();
		list.add("John");
		list.add("Bob");
		Set<String> set = new HashSet<String>();
		set.add("Hello");
		set.add("World");
		list.addAll(set);
		System.out.println(list);
		list.removeAll(set);
		System.out.println(list);
		System.out.println(list.isEmpty());
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
		Iterator<String> str = list.iterator();
		while(str.hasNext()) {
			list.remove(str.next());
		}
		
	}
}