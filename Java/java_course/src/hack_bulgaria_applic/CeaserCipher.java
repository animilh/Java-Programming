package hack_bulgaria;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CeaserCipher {
	
	public static String caesar_encrypt(String text, int n) {
		if ("".equals(text)) {
			System.out.println("Bad input for text");
			return "";
		}
		String encText = "";
		Map<Character, Integer> alphabet = new HashMap<Character, Integer>(26);
		for (int i = 65; i <= 90; i++) {
			alphabet.put((char) i, i - 65); // add (key, value) in the Map alphabet (A, 0), (B, 1), (C, 2) - only upper cases
		}

		char[] a = text.toCharArray(); // convert the input string to char array
		char currentChar; // current char from array a[]
		int asciiChar;
		for (int i = 0; i < a.length; i++) {
			currentChar = a[i];
			if (alphabet.containsKey(Character.toUpperCase(a[i]))) { // check if the map contains key a[i] 
				asciiChar = ((int) alphabet.get(Character.toUpperCase(a[i])) + n) % 26; // Ceaser Cipher only for upper cases
				/* 
				 * use interface Map.Entry (the entries combines key and its values into one class) 
				 * it allows you to iterate over Map.entrySet() (instead of Map.keySet())
				 * and to use both methods entry.getValue() and entry.getKey()
				 */
				for (Entry<Character, Integer> entry : alphabet.entrySet()) {  
					if (entry.getValue().equals(asciiChar)) {
						a[i] = entry.getKey();
						
					}
				}

			}
			if (Character.isLowerCase(currentChar)) { // check if initially the char was lower case
				a[i] += 32; // if so - we convert it in lower case ascii + 32
			}

			encText += a[i];
		}

		return encText;
	}

	public static void main(String[] args) {

		System.out.println(caesar_encrypt("abXYZ", 5));

	}

}
