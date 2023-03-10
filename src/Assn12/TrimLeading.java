package Assn12;

public class TrimLeading {
	public static void main(String[] args) {
		String str = " Hello, World";
		str = str.replaceAll("^\\s+", "");
		System.out.println("After trimming leading whitespace characters, the string is: " + str);
		}

}
