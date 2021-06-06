
public class BasicCalculator {

	public static void main(String[] args) {

		int a = Integer.parseInt(args[0]);
		System.out.println(a);
		int b = Integer.parseInt(args[1]);
		System.out.println(b);
		int c = Integer.valueOf(args[0]);
		System.out.println(c);
		int d = Integer.valueOf(args[1]);
		System.out.println(d);
		System.out.println("Addition Result : "+(a+b));
		System.out.println("Subtraction Result : "+(a-b));
		System.out.println("Multiplication Result : "+(a*b));
		System.out.println("Division Result : "+(a/b));
		
	}

}
