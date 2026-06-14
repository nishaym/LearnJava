import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = "Nishay Malik";
        System.out.print("What is your name? ");
        String theirName = scanner.nextLine();
        System.out.print("Nice to meet you " + theirName + "! My name is " + name + "! What is the year? ");
        String year = scanner.nextLine();
        System.out.print("Do you go to school? ");
        String inSchool = scanner.nextLine();
        double grade = 95.4;

        if(inSchool.equals("Yes")){
            System.out.print("What is your grade? ");
            String theirGrade = scanner.nextLine();
            System.out.println("That's cool! As of " + year + ", I have a " + grade + "!");
        }
        else{
            System.out.println("That's cool! I do. My grade is " + grade + "!");
        }
        System.out.print("Do you want to play a game? ");
        String playGame = scanner.nextLine();
        if(playGame.equals("Yes")){
            System.out.print("Cool! Lets play mad libs! Do you know how to play? ");
            String knowRules = scanner.nextLine();
            String adjective1;
            String noun1;
            String adjective2;
            String verb1;
            String adjective3;

            if(knowRules.equals("Yes")){
                System.out.println("Alright! Let's play.");
            }
            else{
                System.out.println("Okay! I can tell you the rules! First, I give you a story with some blanks to fill in. You fill them in with either a noun, verb, or adjective. In the end, we get a complete story! Let's play.");
            }

            System.out.print("Enter an adjective(description word): ");
            adjective1 = scanner.nextLine();
            System.out.print("Enter another adjective: ");
            adjective2 = scanner.nextLine();
            System.out.print("Enter a final adjective: ");
            adjective3 = scanner.nextLine();
            System.out.print("Now a noun(animal or person): ");
            noun1 = scanner.nextLine();
            System.out.print("Finally, enter a verb ending with -ing(action word): ");
            verb1 = scanner.nextLine();

            System.out.println("\nToday I went to a " + adjective1 + " zoo.");
            System.out.println("In an exhibit, I saw a " + noun1 + ".");
            System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
            System.out.println("It was " + adjective3 + "!");
        }
        else{
            System.out.println("That's fine. I have to go now. Nice meeting you!");
        }
        scanner.close();
    }
}
