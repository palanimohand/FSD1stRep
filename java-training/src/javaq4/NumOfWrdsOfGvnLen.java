package javaq4;

public class NumOfWrdsOfGvnLen {

	public static void main(String[] args) {

		String[] input1 = { "aa", "b", "cc", "ddd" , "eee"};

		int numberOfCharacter = 0;

		int counter = 0;

		for (String element : input1) {

			if (element.length() == numberOfCharacter) {

				counter++;

			}

		}

		System.out.println("Number of elements is: " + counter);

	}

}
