package javaq2;

public class VowelsCounter {

	public static void main(String[] args) {

		char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

		String input = "aAeEiIoOuU";

		int i = 0;

		for (char c : vowels) {

			for (char d : input.toCharArray()) {

				if (Character.toString(c).equalsIgnoreCase(Character.toString(d))) {

					i++;

					break;

				}

			}


		}
		
		System.out.println("The occurance of vowels is : " + i);

	}

}
