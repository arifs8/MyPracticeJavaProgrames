package String;

public class StringToCharArray {

	public static void main(String[] args) {
		String str = "SyedArif";
		
		String newword = str.toLowerCase();
		
		char ch[] =	newword.toCharArray();
		
		for(Character c :ch) {
			System.out.print(c + " ");
		}
		
	

	}

}
