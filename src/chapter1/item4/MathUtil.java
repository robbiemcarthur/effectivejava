package chapter1.item4;

public class MathUtil {
    // ensure utility class cannot be instantiated by providing private ctor to avoid the compiler providing a default parameterless constructor
    private MathUtil() { throw new AssertionError(); }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
}
