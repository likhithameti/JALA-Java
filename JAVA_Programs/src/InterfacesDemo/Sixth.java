package InterfacesDemo;
import java.util.*;

public class Sixth implements Interface3 {
    public static void main(String[] args) {
        Sixth object = new Sixth();
        object.method();
    }
}

interface Interface3 {
    default public void method() {
        System.out.println("Method Implemented");
    }
}
