package String;

public class RotationOfString {

	public static void main(String[] args) {
		String s1 = "helloeducative";
        String s2 = "oeducativehell";
        
        boolean flag = check(s1, s2);
        if(flag) {
        	
        	System.out.println(s1 + " and " + s2 + " are rotation of each other");
        }else {
        	
        	System.out.println(s1 + " and " + s2 + " are not rotation of each other");
        }

	}
	
	public static boolean check(String str1, String str2) {
		
		
		if(str1.length() != str2.length()) {
			return false;
		}
		
	
		
		String concat = str1 +str1 ;
		return concat.contains(str2);
		
		
		
		
	}

}
