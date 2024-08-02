package staticPackage;

public class constructorJava {
	
	private int value ;
	
	constructorJava() {
		
		value =1;
		System.out.println("This is constructor : " + value);
	}
	
	public  void getMethod() {
		
		value =0;
		System.out.println(value);
	}
	
	public static void main(String[] args) {
		
		constructorJava cs = new constructorJava();
		cs.getMethod();
		
	}

}
