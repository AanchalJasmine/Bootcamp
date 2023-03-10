package Assn12;

public class PrintTheWordAndCountOfWords {
	public static void main(String[] args) {
		String str = "Hello, World! How are you today?";
		String[] words = str.split("\\s+");
		int wordCount = words.length;
		System.out.println("The given string contains " +
		wordCount + " words:");
		for (String word : words) {
		System.out.println(word);
		}
		}
		}


