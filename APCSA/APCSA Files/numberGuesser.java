import java.util.Scanner;

public class numberGuesser {
    public static void main(String[] args) {
        int randNumber = (int) (Math.random() * 10); // gets you a number between 0-10
        Scanner sc = new Scanner(System.in); // imports scanner
        System.out.println("Welcome to the guessing game in Java!");

        for (int i = 0; i < 10; i++) { // i < 10 because it gives you 10 tries to get it
            System.out.println("Enter a number between 0 to 10::"); // this repeats every time you don't get it
            int guess = sc.nextInt();
            if (guess == randNumber) {
                System.out.println("You got the right number!");
                break; // this breaks out of the for loop because you got the right number
            } else
                System.out.println("Try again."); // you aren't getting the right number
        }


    }
}
