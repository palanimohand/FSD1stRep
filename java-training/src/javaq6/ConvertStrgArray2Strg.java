package javaq6;

public class ConvertStrgArray2Strg {

	public static void main(String[] args) {

		String[] names = { "Vikas", "Lokesh", "Ashok", "Palani" };

		String allNames = "";
		
		for (int i = 0; i < names.length; i++) {

			if (i == (names.length) - 1) {

				allNames = allNames.concat(names[i]);

			} else {

				allNames = allNames.concat(names[i]).concat(",");
			}

		}

		System.out.println(allNames);
	}

}
