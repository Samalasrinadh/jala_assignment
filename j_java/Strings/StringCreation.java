// 1. Different ways of creating a string
class StringCreation {
    public static void main(String[] args) {
      
        String str1 = "Hello";
        String str2 = new String("World");
        char[] chars = {'J', 'a', 'v', 'a'};
        String str3 = new String(chars);

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 3: " + str3);
    }
}
