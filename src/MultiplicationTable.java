import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number from 1-20: ");
        int number = scanner.nextInt();

        if(number < 1 || number > 20)
        {
            do {
                System.out.println("Sorry, that number isn't valid! Please enter another number: ");
                number = scanner.nextInt();
            }
            while (number < 1 || number > 20);
            System.out.println("Cool! The times table of " + number + " from 1-5 is:\n" + number + "\n" + number*2 + "\n" + number*3 + "\n" + number*4 + "\n" + number*5);

        }
        else{
            System.out.println("Cool! The times table of " + number + " from 1-5 is:\n" + number + "\n" + number*2 + "\n" + number*3 + "\n" + number*4 + "\n" + number*5);
        }
    }
}
