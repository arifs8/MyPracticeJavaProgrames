
public class StaticMethod {
	public static void main(String[] args) {
		Counter.increment();
		Counter.increment();
		System.out.println(Counter.COUNT);
	}

}
