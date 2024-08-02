package Exception;

public class FirstExcption {

	public static void main(String[] args) {

		doStuff();
	}

	public static void doStuff() {

		doMoreStuff();
		int a= 10;
		int b=0;
		int c;
		try {
		System.out.println( c =a/b );
		
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
	}

	public static void doMoreStuff() {

		System.out.println("Arif");
	}

}
