package InterfacesDemo;
import java.util.*;

public class Fifth implements FirstInterface, SecondInterface {
    public static void main(String[] args) {
        Fifth object = new Fifth();
        object.methodOne();
    }

    public void methodOne() {
        System.out.println("First method Implemented");
    }

}

interface FirstInterface {
    public void methodOne();
}

interface SecondInterface {
    public void methodOne();
}
