package Exception;

public class Test3 {

	public static void main(String[] args) {
		
		thresdSleepMethod1();
	}
	
	public static void thresdSleepMethod1() {
		
		try {
			Thread.sleep(3000);
			System.out.println("Hellow good morning");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
	
	public static void thresdSleepMethod12() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Method 2");
	}

}
