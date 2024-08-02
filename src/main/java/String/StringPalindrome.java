package String;

public class StringPalindrome {

	public static void main(String[] args) {
		String str = "Rotator";
		
		System.out.println(palindrome(str));

	}
	
	public static boolean palindrome(String str) {
		
		
		 String ans =  str.replace("\\s", "").toLowerCase();
		char[] ch =	ans.toCharArray();
		
		int forward =0;
		int backword= ch.length-1;
		
		while(forward < backword) {
			
			if(ch[forward] != ch[backword]) {
				return false;
			}
			
			forward++;
			backword--;
			
			
		}
		return true;
	}

}
