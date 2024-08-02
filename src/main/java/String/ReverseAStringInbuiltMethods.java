package String;

public class ReverseAStringInbuiltMethods {

	public static void main(String[] args) {


		String str1 ="Arif";
		
		String str =str1.toLowerCase();
		
		StringBuilder st = new StringBuilder();
		st.append(str);
		st = st.reverse();
		System.out.println(st);

	}

}
