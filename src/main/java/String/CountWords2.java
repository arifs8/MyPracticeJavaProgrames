package String;

public class CountWords2 {

	public static void main(String[] args) {
		String str = "This is my country";
		
		String[] wordCount=  str.trim().split(" ");
		System.out.println(wordCount.length);

	}

}
