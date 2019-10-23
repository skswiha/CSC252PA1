package main;

import java.util.ArrayList;
import java.util.Random;

public class TestMain {
	public static void main(String[]args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		int arraySize = 8;
		Random r = new Random();
		for(int i = 0; i < arraySize; i++) {
			a.add(r.nextInt(100));
		}
		for(int i = 0; i < arraySize; i++) {
			System.out.println(a.get(i));
		}
	}
}
