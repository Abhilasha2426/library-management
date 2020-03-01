package com.capgemini.librarymanagement.db;

import java.util.LinkedList;
import java.util.TreeMap;

public class DbStore {
	public static int flag1 = 1;
	public static int temp1;
	@SuppressWarnings("rawtypes")
	public static TreeMap<Integer, LinkedList> bDb = new TreeMap<Integer, LinkedList>();

	@SuppressWarnings("rawtypes")
	public static boolean bookDb(LinkedList ll) {

		boolean isSet = false;
		if (ll != null) {
			// mDB = new TreeMap<Integer,LinkedList>();
			bDb.put(flag1, ll);
			temp1 = flag1;
			flag1++;
			isSet = true;
			LinkedList ty = bDb.get(temp1);
//			System.out.println(ty);
		}
		return isSet;
	}

}
