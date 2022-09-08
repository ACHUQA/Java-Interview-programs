package sample;

public class ReverseString {

	public static void main(String[] args) {
c
		String input = "Welcome to Capgemini";
		CharSequence subSequence = input.subSequence(0, 20);// print the same text as innput
		System.out.println(subSequence);

		String r = "";
		String substring = input.substring(11, 20);
		for (int k = 0; k < substring.length(); k++) {
			char c = substring.charAt(k);
			r = c + r;

		}
		System.out.println(r);

		String t = "";
		String substring2 = input.substring(8, 10);
		for (int i = 0; i < substring2.length(); i++) {

			char d = substring2.charAt(i);
			t = d + t;
		}
		System.out.println(t);
		String u = "";
		String sub = input.substring(0, 7);
		for (int h = 0; h < sub.length(); h++) {
			char m = sub.charAt(h);
			u = m + u;

		}
		System.out.println(u);
		System.out.println(r + " " + t + " " + u);
	}
}
