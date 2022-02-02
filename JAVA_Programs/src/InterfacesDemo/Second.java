package InterfacesDemo;
import java.util.*;

public class Second implements Interface1 {
    public static void main(String[] args) {
        Second object = new Second();
        object.methodOne();

    }

    public void methodOne() {
        System.out.println("First method Implemented");
    }
}

interface Interface1 {
    public void methodOne();

    public default void methodTwo() {
        System.out.println("Second menthod implemented");
    }
}
