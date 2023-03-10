package Assn12;

public class FirstOccurance {
	public static void main(String[] args) {
		String str = "Hello, World!";
		char characterToRemove = 'o';
		int index = str.indexOf(characterToRemove);
		if (index != -1) {
		str = str.substring(0, index) + str.substring(index +
		1);
		}
		System.out.println("After removing the first occurrence of '" + characterToRemove + "', the string is: " + str);
		}
		}


