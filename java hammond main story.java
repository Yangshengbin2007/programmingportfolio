import java.util.*;

public class MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain;
        
        do {
            List<String> words = new ArrayList<>();
            
            // Asking for user input
            System.out.println("Make friends with Hammond! You will love Hammond! Fill in the blanks:");
            
            // Collecting the user inputs
            words.add(getInput(scanner, "your name"));
            words.add(getInput(scanner, "adjective (It depends on what Hammond looks like)"));
            words.add(getInput(scanner, "place (This is where you and Hammond first met)"));
            words.add(getInput(scanner, "food (This is the first time you and Hammond have eaten)"));
            words.add(getInput(scanner, "adjective (This is the first time Hammond ate your food)"));
            words.add(getInput(scanner, "adjective (Hammond first showed your feelings)"));
            words.add(getInput(scanner, "movie name"));
            words.add(getInput(scanner, "food (dinner)"));
            words.add(getInput(scanner, "adjective (Hammond exclaimed when he ate something so delicious for the first time)"));
            words.add(getInput(scanner, "adjective (How you felt when something happened)"));
            words.add(getInput(scanner, "a paragraph (Important choice! Please say a word to express your love for Hammond! This is important!)"));
            words.add(getInput(scanner, "adjective (How do you feel about Hammond?)"));
            words.add(getInput(scanner, "a paragraph (Everything you want to say to Hammond is here)"));
            words.add(getInput(scanner, "something (Just something in the hand of a passerby)"));
            words.add(getInput(scanner, "something (Just something eating by a passerby)"));
            
            // The Mad Libs story with all the filled-in words
            System.out.println("\nOne day, " + words.get(0) + " found a " + words.get(1) + 
                               " guy by the river. You looked and found that this guy was actually Hammod! After Hammod was saved by you, he wanted to be your friend! " +
                               "So, you went to " + words.get(2) + " and treated Hammond to some delicious " + words.get(3) + ". " +
                               "Hammod was very " + words.get(4) + " and said to you: Hammod habibi! This made you very " + words.get(5) + ", so you invited Hammod to watch a " + words.get(6) + 
                               ". Although Hammod didn't understand because he only spoke Arabic, he still smiled at you. After watching the movie, you and Hammod went to dinner. " +
                               "You ordered " + words.get(7) + ". Hammod was very " + words.get(8) + " and clapped his hands happily. He gestured, 'This is the most " + words.get(9) + 
                               " thing I have ever eaten. I seem to have fallen in love with you. You are so good to me. I want to be your friend forever.' " +
                               "So you decided to go a step further. After dinner, " + words.get(0) + " and Hammod rowed a boat. Suddenly, Hammod fell into the water. " +
                               "You tried your best to save Hammond, saying: " + words.get(10) + " while saving him, but Hammod didn't say anything, just smiled at you and soon floated away. " +
                               "You felt very " + words.get(11) + " about this and cried bitterly, recalling every bit of Hammond and you, you want to say: " + words.get(12) + 
                               " while Hammod closed his eyes in the river...\n" +
                               "At this time, someone suddenly appears behind you. He is holding " + words.get(13) + " in his hand, keeps eating " + words.get(14) + 
                               " in his mouth. He said, 'Give up, you have gone through this cycle a thousand times, just for a Hammond that does not exist, what about it?'");

            // Ask if the user wants to save Hammond
            System.out.print("\nSo do you need to save Hammond? 1. yes 2. no ");
            String response = scanner.nextLine().trim().toLowerCase();
            
            // If player enters "I Love You" at the end, trigger a hidden ending with a random chance
            if (response.equals("yes")) {
                // Generate a random number (0-99)
                Random rand = new Random();
                int randomNumber = rand.nextInt(100);
                
                // If the random number is less than 20, trigger the hidden ending
                if (randomNumber < 50) {
                    System.out.println("\n** Hidden Ending **");
                    System.out.println("You said: 'I love you, Hammond!' in a dramatic voice. Suddenly, a portal opens and you both are transported to another world!");
                    System.out.println("The man screamed angrily, Impossible! This is my code! There can be no bugs in my code! Hammond cannot be resurrected! impossible! You, no matter what you are called! We should give up as soon as possible in this endless cycle of death! impossible! impossible!");
                    System.out.println("You just said coldly, your cycle was broken by me! Even if I disappear! Even if this program ceases to exist because of bugs! You, the author, can't stop me and Hammond!");
                    System.out.println("Then there was a boom, the man shattered, and a figure appeared in the river, it was Hammond! Seeing this, you rushed directly into the water and rescued Hammond. There was no plot or any loop. Hammond was in your hand, smiling at you.");
                    System.out.println("Hammond thanks you for your love and says: 'You have saved me! Together we will explore the universe!' You both live happily ever after.");
                    break; // Exit the loop and finish the game
                } else {
                    System.out.println("Do you want to continue? This is a warning, you have been in this cycle many times, don't continue in this cycle, give up, why not go to Starbucks and have a cup of coffee");
                }
            } else {
                System.out.println("\nHammond disappears forever.");
            }

            // Ask to play again
            System.out.print("\nDo you want to play again? (yes/no): ");
            response = scanner.nextLine().trim().toLowerCase();
            playAgain = response.equals("yes");
            
        } while (playAgain);
        
        System.out.println("Game Over.");
        scanner.close();
    }
    
    // Function to get input from the user for Mad Libs
    private static String getInput(Scanner scanner, String prompt) {
        System.out.print("Enter " + prompt + ": ");
        return scanner.nextLine();
    }
}