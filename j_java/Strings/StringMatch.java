// 6. Matching a String Against a Regular Expression With matches()
class StringMatches {
    public static void main(String[] args) {
        String str = "123456";
        boolean isNumeric = str.matches("\\d+");
        System.out.println("Is Numeric: " + isNumeric);
    }
}
