package Corejava;

public class Constructor {

	int i = 10;
	int j=20;

	public static void main(String[] args) {
		
		Constructor cn = new Constructor(80,20);
		System.out.println(cn.add());
	}

	

	public Constructor(int i,int j) {
		this.i  = i;
		this.j=j;
	}
	
	public int add() {
		return i+j;
	}

}
