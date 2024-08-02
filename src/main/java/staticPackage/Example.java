package staticPackage;

public class Example {
    private int instanceVariable;
    private static int staticVariable;

    public Example(int value) {
        this.instanceVariable = value;
    }

    public static void staticMethod() {
        staticVariable = 10;
        // Cannot directly access instanceVariable or nonStaticMethod
    }

    public void nonStaticMethod() {
        instanceVariable = 5;
        staticVariable = 20;
        staticMethod(); // Static method can be called from an instance method
    }

    public static void main(String[] args) {
        Example example = new Example(15);
        example.nonStaticMethod();
    }
}
