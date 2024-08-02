package Collections;

import java.util.Stack;

public class StackPractice {

	public static void main(String[] args) {

		Stack<String> st = new Stack<String>();
		st.add("Arru");
		st.add("Ammu");
		st.add("Aaki");
		st.add("Fayeem");
		
		System.out.println(st.peek());
		//System.err.println(st.pop());
		System.out.println(st);
		st.push("Althaf");
		System.out.println(st);
		System.out.println(st.search("Ammu"));
		System.out.println(st);

	}

}
