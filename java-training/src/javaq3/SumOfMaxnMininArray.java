package javaq3;

public class SumOfMaxnMininArray {

	public static void main(String[] args) {

		int[] inputArray = { 13, 432, 22, 0, -1 };

		for (int i = 0; i < inputArray.length; i++) {

			int temp = 0;

			for (int j = i + 1; j < inputArray.length; j++) {

				if (inputArray[i] < inputArray[j]) {
					temp = inputArray[j];
					inputArray[j] = inputArray[i];
					inputArray[i] = temp;
				}

			}

		}

		System.out.println("Sum of Largest and smallest number in a array is :"
				+ (inputArray[0] + inputArray[inputArray.length - 1]));

	}

}
