package Exception;

public class Test1 {

	public static void main(String[] args) {

		try {
			
			System.out.println(10/0);
			return;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Catch block ");
		}
		finally {
			System.out.println("Arif Finally Block");
		}

	

	}

}
