package com.example.array1;
import java.util.*;

public class ArrayInbuilt {

	int arr[]= {0,30,12,54,28,-5};
	public void arrayList() {
		System.out.println("Before sorting");
		for(int i:arr) {
			System.out.print(i+" ");
		}		
		Arrays.sort(arr);
		System.out.println("\nAfter sorting");
		for(int i:arr) {			
			System.out.print(i+" ");
		}
	}
}
