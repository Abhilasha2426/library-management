package com.capgemini.librarymanagement;

import java.util.Scanner;

public class Rough {
	static String bookId;
	static String userId;
	static int count=0;
	public static void main(String[] args) {
		
		System.out.println(getUniqueId());
		
		System.out.println(getUniqueId());
		
		System.out.println(getUniqueId());
	}
	
	public static String getUniqueId() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter User Id");
		userId = scanner.next();
		
		System.out.println("Enter Book Id");
		bookId = scanner.next();
		
		return "Unique ID->" + userId+"$"+bookId+"$"+(++count);
	}
}