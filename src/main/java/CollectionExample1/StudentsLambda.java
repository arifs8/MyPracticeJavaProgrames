package CollectionExample1;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class StudentsLambda {

	public static void main(String[] args) {


	List<StudentMarks> stMarks = new ArrayList<StudentMarks>();
		
		stMarks.add(new StudentMarks(70, 80));
		stMarks.add(new StudentMarks(38, 90));
		stMarks.add(new StudentMarks(90, 90));
		stMarks.add(new StudentMarks(50, 70));
		stMarks.add(new StudentMarks(60, 75));
		stMarks.add(new StudentMarks(45, 45));
		stMarks.add(new StudentMarks(70, 90));
		
		PriorityQueue<StudentMarks> spq = new PriorityQueue<StudentMarks>((s1,s2)-> {
			
			System.out.println("Comparator's compareto() is called : ");
			return s2.getPhysics() - s1.getPhysics();
		});
		
		for(StudentMarks x : stMarks) {
			spq.add(x);
		}
		
		
		List<StudentMarks> top1 = new ArrayList<StudentMarks>();
		int index=0;
		
		while(!spq.isEmpty()) {
			
			if(index == 3)
				break;
			
			top1.add(spq.poll());
		}
		
		System.out.print(top1);

	}

}
