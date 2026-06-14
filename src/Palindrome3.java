import java.util.Scanner;

public class Palindrome3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        int length = word.length();
        char[] array = word.toCharArray();
        boolean isPalindrome = true;
        for (int i = 0, j = length - 1;
             i <= j;
             i++, j--) {
            if (array[i] != array[j]) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("This word is a palindrome!");
        } else {
            System.out.println("This word is not a palindrome.");
        }
    }
}
