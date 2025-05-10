// Java program to check if a person is eligible to vote. (The person must be 18 or older and a citizen.)
import java.util.Scanner;

public class Qn5_simple {
    public static void main(String[] args) {
        Scanner voteEligibility = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = voteEligibility.nextInt();
        voteEligibility.nextLine(); 

        System.out.print("Are you a citizen of the country? (Y/N): ");
        String citizenship = voteEligibility.nextLine().trim();

        if (!citizenship.equalsIgnoreCase("Y") && !citizenship.equalsIgnoreCase("N")) {
            System.out.println("Invalid input by the usef.");
        } else {
            boolean isCitizen = citizenship.equalsIgnoreCase("Y"); //we use noolean to see the true or false

            if (age < 18 || !isCitizen) {
                System.out.println("You are not eligible to vote");
            } else {
                System.out.println("You are eligible to vote");
            }
        }

        voteEligibility.close();
    }
}
