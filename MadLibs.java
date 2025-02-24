import java.util.*;

public class MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain;
        
        do {
            List<String> words = new ArrayList<>();
            
            System.out.println("Welcome to Mad Libs! Fill in the blanks:");
            
            // Collect user input
            words.add(getInput(scanner, "an adjective"));
            words.add(getInput(scanner, "a noun"));
            words.add(getInput(scanner, "a verb (past tense)"));
            words.add(getInput(scanner, "an adverb"));
            words.add(getInput(scanner, "an adjective"));
            words.add(getInput(scanner, "a noun"));
            words.add(getInput(scanner, "a verb"));
            words.add(getInput(scanner, "a place"));
            words.add(getInput(scanner, "an adjective"));
            words.add(getInput(scanner, "a plural noun"));
            words.add(getInput(scanner, "a verb ending in -ing"));
            words.add(getInput(scanner, "a verb ending in -ing"));
            words.add(getInput(scanner, "an exclamation"));
            words.add(getInput(scanner, "a famous person"));
            words.add(getInput(scanner, "a food item"));
            
            // Generate and display the story
            System.out.println("\nHere is your Mad Libs story:\n");
            System.out.println("Once upon a time, there was a " + words.get(0) + " " + words.get(1) + 
                               " who " + words.get(2) + " " + words.get(3) + 
                               ". One day, they found a " + words.get(4) + " " + words.get(5) + 
                               " and decided to " + words.get(6) + " it.");
            System.out.println("They traveled to " + words.get(7) + ", where they met a " + words.get(8) + 
                               " group of " + words.get(9) + ". They spent the whole day " + words.get(10) + 
                               " and " + words.get(11) + ".");
            System.out.println(words.get(12) + "! Just then, " + words.get(13) + 
                               " appeared and gave them a " + words.get(14) + ". The end!");
            
            // Ask to play again
            System.out.print("\nWould you like to play again? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");
            scanner.nextLine(); // Consume the newline character
        } while (playAgain);
        
        System.out.println("Thanks for playing Mad Libs! Goodbye!");
        scanner.close();
    }
    
    private static String getInput(Scanner scanner, String prompt) {
        System.out.print("Enter " + prompt + ": ");
        return scanner.nextLine();
    }
}