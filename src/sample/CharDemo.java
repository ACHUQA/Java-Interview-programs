package sample;

public class CharDemo {
	public static void main(String[] args) {

		String s = "Welcome to Automation";
		String s2 = "";
		String replacedstring = s.replace(" ", "_");
		String replaceAll = s.replaceAll(s, "Selenium");
		System.out.println(replaceAll);
		System.out.println(replacedstring);
		System.out.println(s);
		String substring = s.substring(6);
		System.out.println(substring);

		for (int l = 0; l < substring.length(); l++) {
			System.out.println(l);
		}

		for (int k = 0; k < substring.length(); k++) {

//			char substringchar = substring.charAt(k);
//			s2 = substringchar + s2;

		}
		System.out.println("Reversed :" + s2);

		char[] cutdown = substring.toCharArray();
		for (char c : cutdown) {
			System.out.println(c);
		}

		int length = s.length();
		System.out.println(length);
		int count = 0;
		for (int i = 0; i < length; i++) {
			char ch = s.charAt(i);
			if (ch == 'o') {

				count++;
			}

		}
		System.out.println("o count is :" + count);

		System.out.println();

		char[] c = s.toCharArray();

		for (int i = 0; i < c.length; i++) {

			System.out.println(c[i]);

		}
	}
}
