package Arrays;
import java.util.*;

public class printLIst {

	public static void main(String[] args) {


		List<Integer> lis = new ArrayList<Integer>();
		lis.add(1);
		lis.add(20);
		lis.add(22);
		lis.add(35);
		lis.add(10);
		
		/*
		 * for(int i=0; i<lis.size() ; i++) { System.out.println(lis); }
		 */
	
	
		for(Integer num : lis) {
			System.out.print(num+ " ");
		}
	
	
	
	}

}
