// 10. Program to check if a number is a palindrome

class PalindromeCheck {
    public static void main(String[] args) {
        int num = 121, reversedNum = 0, remainder, originalNum;
        originalNum = num;

        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
}
