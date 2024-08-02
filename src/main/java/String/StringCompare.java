package String;

public class StringCompare {

	public static void main(String[] args) {


		String s1 = "Syed";
		String s2 ="Syed";
		String s3= s1+s2;
		
		String splitted = "192.168.1.178";
		System.out.println(s2.compareTo(s3));
		System.out.println(splitString(splitted));

	}
	
	
	public static String splitString(String str) {
		
		
		return str.split("\\.").toString();
	}

}
