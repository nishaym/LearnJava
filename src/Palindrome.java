import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        StringBuilder sb = new StringBuilder(word);
        if(word.equalsIgnoreCase(sb.reverse().toString())){
            System.out.println("Your word is a palindrome!");
        }
        else{
            System.out.println("Your word is not a palindrome!");
        }
    }
}
