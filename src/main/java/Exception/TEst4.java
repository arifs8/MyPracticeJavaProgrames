package Exception;

public class TEst4 {

	public static void main(String[] args) throws InterruptedException {
		doStuff();

	}

	public static void doStuff() {

		doMoreStuff();
	}

	public static void doMoreStuff() {
		try {
			Thread.sleep(2000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("Arif");
	}

}
