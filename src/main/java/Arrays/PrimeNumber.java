package Arrays;
import java.util.*;



public class PrimeNumber {

	public static void main(String[] args) {
		int x =23;
		System.out.println(primeNumberFind(x));

	}
	
	public static  boolean primeNumberFind(int target) {
		
		
		int count =0;
		
		for(int i=1 ;i<=target ;i++) {
			
			if(target % i == 0) {
				
				count++;		
			}
		}
		
		if(count ==2) {
			return true;
		}else {
			return false;
		}
		
	}

}
