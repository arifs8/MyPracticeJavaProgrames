package CollectionExample1;

public class StudentMarks implements Comparable<StudentMarks> {

	private int maths;
	private int physics;
	
	
	@Override
	public String toString() {
		return "StudentMarks [maths=" + maths + ", physics=" + physics + "]";
	}


	public int getMaths() {
		return maths;
	}


	public void setMaths(int maths) {
		this.maths = maths;
	}


	public int getPhysics() {
		return physics;
	}


	public void setPhysics(int physics) {
		this.physics = physics;
	}


	public StudentMarks(int maths, int physics) {
		super();
		this.maths = maths;
		this.physics = physics;
	}


	@Override
	public int compareTo(StudentMarks o) {
		/*
		 * Current < other object 
		 * return -1;
		 * 
		 * 
		 * Current > other object 
		 * return -1;
		 * 
		 * 
		 * Current == other object  
		 * return -1;
		 */	
		
//		if(this.maths < o.maths)
//			return -1;
//		if(this.maths > o.maths)
//			return 1;
//		if(this.maths == o.maths)
//			return 0;
		
		return o.maths - this.maths;
	}
	
	
	
	
}
