// 8. Comparing strings using equalsIgnoreCase(), startsWith(), endsWith(), compareTo()
class StringCompare {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        // equalsIgnoreCase()
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
        System.out.println("Equals Ignore Case: " + isEqualIgnoreCase);

        // startsWith()
        boolean starts = str1.startsWith("He");
        System.out.println("Starts With 'He': " + starts);

        // endsWith()
        boolean ends = str1.endsWith("lo");
        System.out.println("Ends With 'lo': " + ends);

        // compareTo()
        int comparison = str1.compareTo(str2);
        System.out.println("Comparison Result: " + comparison);
    }
}
