// Q13: Write a program to generate NoSuchFieldException

import java.lang.reflect.Field;

public class FieldGen {
    public static void main(String[] args) {
        try {
            Class<?> clazz = String.class;
            Field field = clazz.getField("nonexistentField");
        } catch (NoSuchFieldException e) {
            System.out.println("NoSuchFieldException caught: " + e.getMessage());
        }
    }
}
