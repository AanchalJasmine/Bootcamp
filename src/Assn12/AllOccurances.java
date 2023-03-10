package Assn12;

public class AllOccurances {
	public static void main(String[] args) {
		String str = "Hello, World!";
		char characterToRemove = 'l';
		str =
		str.replaceAll(Character.toString(characterToRemove),
		"");
		System.out.println("After removing all occurrences of'" + characterToRemove + "', the string is: " + str);
		}
		}
