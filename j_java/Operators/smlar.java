// 7. Program to print the smaller and larger number

class Com {
    void find(int a, int b) {
        if (a < b) {
            System.out.println(a + " is smaller, " + b + " is larger.");
        } else if (a > b) {
            System.out.println(a + " is larger, " + b + " is smaller.");
        } else {
            System.out.println(a + " and " + b + " are equal.");
        }
    }

    public static void main(String[] args) {
        Com obj = new Com();
        obj.find(12, 15); 
    }
}
