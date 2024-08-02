package MathForCoding;

public class numberOfMatches {

	public static void main(String[] args) {
		int n = 77;
		System.out.println(numberMatches(n));

	}
	
	public static int numberMatches(int num) {
		
		int Tmatches=0;
		
		while(num > 1) {
			
			if(num % 2 == 0) {
				Tmatches = Tmatches + num / 2;
				num = num /2 ;
			}else {
				Tmatches = Tmatches + (num-1)/2;
				num = (num-1) / 2 + 1;
			}
		}
		return Tmatches;
		
	}

}
