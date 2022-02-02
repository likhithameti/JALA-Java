package InterfacesDemo;
public class Seventh implements SecondInterface1 {
    public static void main(String[] args) {
        Seventh object = new Seventh();
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

interface FirstInterface2 {
    public void methodOne();
}

interface SecondInterface1 extends FirstInterface {
    public void methodTwo();
}
