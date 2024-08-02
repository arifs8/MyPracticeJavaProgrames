package MathForCoding;

import java.util.ArrayList;
import java.util.List;

public class SwapOfTwoNumbers {

	public static void main(String[] args) {
		int a = 100;
		int b=200;
		
		System.out.println(swapNumbers(a, b));

	}
	
	public static List<Integer> swapNumbers(int a, int b){
		
		int temp =a;
		a= b;
		b= temp;
		
		 ArrayList<Integer> li = new ArrayList<Integer>();
		 li.add(a);
		 li.add(b);
		 
		 return li;
		
	}

}
