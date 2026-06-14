import java.util.Scanner;

public class PrintNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        int sum = 0;
        int currentNum = 0;
        do {
            sum = currentNum + sum;
            System.out.println(currentNum + "->" + sum);
            currentNum++;
        }
        while (currentNum <= input);
    }
}
