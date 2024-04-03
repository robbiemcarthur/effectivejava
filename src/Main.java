import chapter1.item3.ElvisPresley;

import static chapter1.item3.Elvis.INSTANCE;
import static chapter1.item4.MathUtil.sum;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("""
                Demonstrating a Singleton class with a private constructor \
                the main benefit of this is the readability of the public field INSTANCE \
                makes clear that this is a Singleton. \
                 """);
        INSTANCE.leaveTheBuilding();

        System.out.println("""
                Demonstrating a Singleton using single-element enum \
                the main benefit of this approach is it is more concise, \
                provides serialization and protection from reflection attacks \
                 """);

        ElvisPresley.INSTANCE.leaveTheBuilding();

        System.out.println("""
                Demonstrating enforcing noninstantiability by making util class with private ctor \
                 """);
        int sum = sum(1, 2);
        System.out.println("Sum: " + sum);
    }
}