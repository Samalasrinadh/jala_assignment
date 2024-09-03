// 4. Program to check if two numbers are equal or not
class CheckEquality {
    void areNumbersEqual(int a, int b) {
        if (a == b) {
            System.out.println(a + " and " + b + " are equal.");
        } else {
            System.out.println(a + " and " + b + " are not equal.");
        }
    }
    public static void main(String[] args) {
        CheckEquality obj = new CheckEquality();
        obj.areNumbersEqual(15, 15); 
    }
}
