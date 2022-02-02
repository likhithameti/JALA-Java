package Exceptions;

import java.lang.reflect.*;

public class ClassgetFieldExample1 {

    public static void main(String[] args) {

        ClassgetFieldExample1  obj = new ClassgetFieldExample1();
        Class class1 = obj.getClass();  //gets the class

        //System.out.println("Field got  =");
        try {

            Field Flds = class1.getField("str");
            System.out.println(" field found: " + Flds.toString());
        } catch(NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public ClassgetFieldExample1() {
    }




}