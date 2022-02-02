package InterfacesDemo;
import java.util.*;

public class Third {
    public static void main(String[] args) {
        InterfaceDefination interfaceDefination = new InterfaceDefination();
        interfaceDefination.methodOne();
    }
}

class InterfaceDefination implements Interface4 {
    public void methodOne() {
        System.out.println("First method Implemented");
    }
}

interface Interface4 {
    public void methodOne();
}