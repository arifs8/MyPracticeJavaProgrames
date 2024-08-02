package Arrays;


public class GreetingProgram {
    public static void main(String[] input) {
        if (input.length > 0) {
            String name = input[0];  // The first command-line argument
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("Hello, World!");
        }
    }
}
