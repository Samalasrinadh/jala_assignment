// Q14: Write a program to generate NoSuchMethodException

import java.lang.reflect.Method;

public class MethodGen {
    public static void main(String[] args) {
        try {
            Class<?> clazz = String.class;
            Method method = clazz.getMethod("nonexistentMethod");
        } catch (NoSuchMethodException e) {
            System.out.println("NoSuchMethodException caught: " + e.getMessage());
        }
    }
}
