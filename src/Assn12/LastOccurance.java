package Assn12;

public class LastOccurance {
	public static void main(String[] args) {
		String str = "Hello, World!";
		char characterToRemove = 'l';
		int index = str.lastIndexOf(characterToRemove);
		if (index != -1) {
		str = str.substring(0, index) + str.substring(index +
		1);
		}
		System.out.println("After removing the last occurrence of '" + characterToRemove + "', the stringis: " + str);
		}
		}

