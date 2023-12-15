import java.util.Scanner;
public class Palindrome {

    static boolean isPalindrome (String s) {
        System.out.println("string palindrome check process...");

        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i))
                return false;
        }
        return true;
    }
    static boolean isPalindrome (int n) {
        System.out.println("number palindrome check process...");

        int temp = n, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        return n == reverseNumber;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string or number for palindrome check : ");
        String s = input.nextLine();
        boolean isPalindromic;

        try {
            int num = Integer.parseInt(s);
            isPalindromic = isPalindrome(num);
        } catch (NumberFormatException e) {
            isPalindromic = isPalindrome(s);
        }

        System.out.println("Entered string or number is " + (isPalindromic ? "palindrome" : "not palindrome"));
    }
}

    /*
     isPalindrome(12321):
         12321 => lastNumber = 1, reverseNumber = 1, temp = 1232
         1232 => lastNumber = 2, reverseNumber = 12, temp = 123
         123 => lastNumber = 3, reverseNumber = 123, temp = 12
         12 => lastNumber = 2, reverseNumber = 1232, temp = 1
         1 => lastNumber = 1, reverseNumber = 12321, temp = 0

     isPalindrome(kayak):
        kayak => n = 5
        i = 0 => s.charAt(0) = k, s.charAt(5 - 1 - 0) = s.charAt(4) = k
        i = 1 => s.charAt(1) = a, s.charAt(5 - 1 - 1) = s.charAt(3) = a
        i = 2 => s.charAt(2) = y, s.charAt(5 - 1 - 2) = s.charAt(2) = y
        i = 3 => s.charAt(3) = a, s.charAt(5 - 1 - 3) = s.charAt(1) = a
        i = 4 => s.charAt(4) = k, s.charAt(5 - 1 - 4) = s.charAt(0) = k
    */
