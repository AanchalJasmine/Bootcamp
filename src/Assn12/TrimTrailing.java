package Assn12;

public class TrimTrailing {
	public static void main(String[] args) {
		String str = "Hello, World! ";
		str = str.replaceAll("\\s+$", "");
		System.out.println("After trimming trailing whitespace characters, the string is: " + str);
		}

}
