package RahulShettyProgrammes;

public class MultiplyWithOutMultiplyTable {

	public static void main(String[] args) {
		int a=5; 
		int b=10;
		
		System.out.println("The multiply of the two num i s: " + multiply(a, b));

	}
	
	
	public static int multiply(int x, int y) {
		
		int k=1;
		int sum=0;
		while(k <= y) {
			
			sum =sum + x;
			k++;
		}
		
		return sum;
		
	}

}
