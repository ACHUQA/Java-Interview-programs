package sample;

import java.util.LinkedHashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		LinkedHashSet<Character> x = new LinkedHashSet<>();

		String input = "GeeksforGeeks";
		char[] c = input.toCharArray();

		for (char d : c) {
			x.add(d);
		}

		for (Character e : x) {
			System.out.println(e);
		}

	}

}
