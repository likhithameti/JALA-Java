package InterfacesDemo;
import java.util.*;

public class First implements Interfaces {
    public static void main(String[] args) {
        First object = new First();
        object.methodOne();
    }

    public void methodOne() {
        System.out.println("First method Implemented");
    }
}

interface Interfaces {
    public void methodOne();
}