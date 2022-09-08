package sample;

public class StringImmutable {

	public static void main(String[] args) {

		String s1 = "Apple";
		String s5 = "Banana";
		System.out.println(s1.concat("Cherry"));
		System.out.println(s1);

		System.out.println(s1.concat(s5));
		System.out.println(s1);
		System.out.println(s5);

		String s2 = new String("Apple");
		String s3 = "Apple";
		System.out.println(s1 + s2);
		System.out.println(s3);

	}
}
