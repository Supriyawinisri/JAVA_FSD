package com.example.array1;

public class ArraySort {
	
	public static void main(String args[]) {
		int arr[] = {100,-1,20,30,0};
		int temp;
		int key = 20;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == key) {
				System.out.println("Element found at place: "+(i+1));
			}
		}
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]<arr[i+1]) {
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(" "+arr[i]);
		}
	}
}
