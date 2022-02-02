package InterfacesDemo;

public class Eighth implements MyInterface {
    public static void main(String[] args) {
        Eighth object = new Eighth();
        System.out.println("Field : " + object.fieldOne);
        object.methodOne();
    }

    public void methodOne() {
        System.out.println("First method Implemented");
    }
}
