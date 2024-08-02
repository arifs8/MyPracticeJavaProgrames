package Exception;

public class Test2 {

	public static void main(String[] args) {
		try {
			
			System.out.println("Outer Try block");
			
			try {
				
				System.out.println("Inner try block");
				System.out.println(10/0);
				
			} catch (ArithmeticException e) {
				System.out.println("Inner catch block ");
			}
			
			System.out.println("After Inner try-catch Block");
			
		} catch (Exception e) {
			System.out.println("Outer Catch Block");
		}
		
		finally {
			System.out.println("Finally Block");
		}

	}

}
