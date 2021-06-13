package javaq5;

public class SumofNuminaAlphaNumericArray {

	public static void main(String[] args) {

		String[] input1 = { "2AA", "12", "ABC", "c1a" };

		int counter = 0;

		for (String element : input1) {

			for (char ch : element.toCharArray()) {

				if (Character.isDigit(ch)) {
					
					System.out.println(ch);
					
					counter += Character.getNumericValue(ch);

				}

			}
		}

		System.out.println("Sum of digits is: " + counter);

	}

}
