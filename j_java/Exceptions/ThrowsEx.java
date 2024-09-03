// Q3: Write a method which throws exception, Call that method in main class without try block

class ThrowsEx {
    static void throwEx() throws Exception {
        throw new Exception("This is an exception.");
    }

    public static void main(String[] args) {
        throwEx();
    }
}
