package com.bridgelabz.printarray;

public class PrintArray {
	
private static void toPrint(Integer[] a) {
		
		for(int element : a) {
			System.out.println(element);
		}
		
	}
	
	private static void toPrint(Double[] b) {
		
		for(double element : b) {
			System.out.println(element);
		}
		
	}
	
	private static void toPrint(Character[] c) {
		
		for(char element : c) {
			System.out.println(element);
		}
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("----- Welcome to Printing Array using Java Generics -----");
		
		Integer[] a = {1,2,3};
		Double[] b = {1.2 , 1.2, 1.3};
		Character[] c = {'a', 's', 'h', 'i', 'k', 'a'};
		toPrint(a);
		toPrint(b);
		toPrint(c);
			
		
	}
}
