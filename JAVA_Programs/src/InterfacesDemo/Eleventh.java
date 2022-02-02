package InterfacesDemo;
public class Eleventh implements Interface {
    public static void main(String[] args) {
        System.out.println("Field : " + Eleventh.field);
    }
}

interface Interface {
    public static final int field = 10;
}
