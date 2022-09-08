package sample;

public class CountCharacters {

	public static void main(String[] args) {

		String input = "Archana124 Hanvi1234/.,";
		int count = 0;
		int count2 = 0;
		int count1 = 0;
		String a = "";
		String b = "";
		String c1 = "";

		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (Character.isDigit(c)) {
				count++;
				a = a + c;
			} else if (Character.isAlphabetic(c)) {
				count1++;
				b = b + c;
			} else {
				c1 = c1 + c;
				count2++;
			}
		}
		System.out.println("Digits are: " + a);
		System.out.println("Alphabets are : " + b);
		System.out.println("Other characters are:" + c1);
		System.out.println("Digits count:" + count);
		System.out.println("Alphabets count:" + count1);
		System.out.println("Other characters count:" + count2);
	}
}