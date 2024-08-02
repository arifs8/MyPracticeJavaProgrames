package javaPractice;

public class Bank {
	
	public static int currentBalance = 10000;

	public static void main(String[] args) {
		greetingUSer();
		Bank bk = new Bank();
		bk.deposite(5000);
		withdrawal(500);
		System.err.println("Current balance is: " + bk.getCurrentBalance());

	}
	
	public static void greetingUSer() {
		
		System.out.println("Welcome to the Syed's bank: ");
	}
	
	public void deposite(int amount) {
		
		currentBalance = currentBalance + amount;
		System.out.println("After deposite , Your current outstanding balance is : " + currentBalance);
	}
	
	public static void withdrawal(int amount) {
		
		currentBalance = currentBalance - amount;
		System.out.println("After withdrawl your current outstanding balance is: " + currentBalance);
	}
	
	public int getCurrentBalance() {
		
		return currentBalance;
	}

}
