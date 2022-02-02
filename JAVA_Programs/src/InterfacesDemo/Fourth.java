package InterfacesDemo;
import java.util.*;

public class Fourth implements FirstInterfaces, SecondInterfaces {
    public static void main(String[] args) {
        Fourth object = new Fourth();
        object.methodOne();
        object.methodTwo();
    }

    public void methodOne() {
        System.out.println("First method Implemented");
    }

    public void methodTwo() {
        System.out.println("Second menthod implemented");
    }
}

interface FirstInterfaces {
    public void methodOne();
}

interface SecondInterfaces {
    public void methodTwo();
}
