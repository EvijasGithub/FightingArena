import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstChoice="sword";
        String secondChoice="spear";
        String thirdChoice="giant hammer";
        String[] list={firstChoice,secondChoice,thirdChoice};

        //Generating a random weapon for Gladiator
        Random random=new Random();
        HelpMethods.clearConsole();
        HelpMethods.printHeading("Welcome to Fighting Arena! Your opponent is Gladiator.");
        HelpMethods.anythingToContinue();
        boolean finished = false;

        //User can magically come back to life three times
        Scanner scannerLives = new Scanner(System.in);
        System.out.println("Enter how many lives do you want to have:");
        int lives = scannerLives.nextInt();
        System.out.println("Enter how many lives do you want gladiator to have:");
        int computerLives = scannerLives.nextInt();

        while (!finished) {
            HelpMethods.clearConsole();
            System.out.println("Choose your weapon:'sword','spear','giant hammer'.");
            String input = scanner.nextLine();
            System.out.println("Gladiators choice:");
            String computersChoice = list[random.nextInt(list.length)];
            System.out.println(computersChoice);

            //Logic, going through all the possible combinations of weapons
            if (input.equalsIgnoreCase("giant hammer") && computersChoice.equals("giant hammer")) {

                int hammerToHammer = random.nextInt(2)+1;

                if (hammerToHammer == 1) {
                    System.out.println("Gladiator slammed you in the chest. You died.☠");
                    HelpMethods.printSeparator(20);
                    //Every time user dies, one life comes off.
                    lives--;
                }
                else {
                    System.out.println("You slammed gladiator in the chest. He died.☠");
                    HelpMethods.printSeparator(20);
                    computerLives--;
                }

                System.out.println("You have "+lives+" lives left.");
                System.out.println("Gladiator have "+computerLives+" lives left.");

                HelpMethods.anythingToContinue();
                HelpMethods.clearConsole();
            }
            else if (input.equalsIgnoreCase("giant hammer") && computersChoice.equals("spear")) {

                int hammerToSpear = random.nextInt(99)+1;

                if (hammerToSpear <= 67) {
                    System.out.println("Gladiator threw his spear right through your heart.You died.☠");
                    HelpMethods.printSeparator(20);
                    lives--;
                }
                else {
                    System.out.println("You threw your spear right through his heart.He died.☠");
                    HelpMethods.printSeparator(20);
                    computerLives--;
                }

                System.out.println("You have "+lives+" lives left.");
                System.out.println("Gladiator have "+computerLives+" lives left.");

                HelpMethods.anythingToContinue();
                HelpMethods.clearConsole();
            }
            else if (input.equalsIgnoreCase("giant hammer") && computersChoice.equals("sword")) {

                int spearToHammer = random.nextInt(99) + 1;

                if (spearToHammer <= 67) {
                    System.out.println("You broke his leg with your hammer. Gladiator passed out. You win!");
                    HelpMethods.printSeparator(20);
                    computerLives--;
                } else {
                    System.out.println("Gladiator slashed you with his sword. You died.☠");
                    HelpMethods.printSeparator(20);
                    lives--;
                }

                System.out.println("You have " + lives + " lives left.");
                System.out.println("Gladiator have " + computerLives + " lives left.");

                HelpMethods.anythingToContinue();
                HelpMethods.clearConsole();
            }
            else if (input.equalsIgnoreCase("sword") && computersChoice.equals("sword")) {

                int swordToSword = random.nextInt(2)+1;

                if (swordToSword == 1) {
                    System.out.println("Gladiator slashed you with his sword. You died.☠");
                    HelpMethods.printSeparator(20);
                    lives--;
                }
                else {
                    System.out.println("You slashed gladiator with your sword. He died.☠");
                    HelpMethods.printSeparator(20);
                    computerLives--;
                }

                System.out.println("You have "+lives+" lives left.");
                System.out.println("Gladiator have "+computerLives+" lives left.");

                HelpMethods.anythingToContinue();
                HelpMethods.clearConsole();
            }
            else if (input.equalsIgnoreCase("sword") && computersChoice.equals("spear")) {

                int swordToSpear = random.nextInt(99)+1;

                if (swordToSpear <= 67) {
                    System.out.println("You slashed him with your sword. He died.☠");
                    HelpMethods.printSeparator(20);
                    computerLives--;
                }
                else {
                    System.out.println("Gladiator hit you in the back with his spear. You died.☠");
                    HelpMethods.printSeparator(20);
                    lives--;
                }

                System.out.println("You have "+lives+" lives left.");
                System.out.println("Gladiator have "+computerLives+" lives left.");

                HelpMethods.anythingToContinue();
                HelpMethods.clearConsole();
            }
            else if (input.equalsIgnoreCase("sword") && computersChoice.equals("giant hammer")) {

                int spearToHammer = random.nextInt(99)+1;

                if (spearToHammer <= 67) {
                    System.out.println("He broke your back with his hammer. You died.☠");
                    HelpMethods.printSeparator(20);
                    lives--;
                }
                else {
                    System.out.println("You slashed him with your sword. He died.☠");
                    HelpMethods.printSeparator(20);
                    computerLives--;
                }

                System.out.println("You have "+lives+" lives left.");
                System.out.println("Gladiator have "+computerLives+" lives left.");

                HelpMethods.anythingToContinue();
                HelpMethods.clearConsole();
            }
            else if (input.equalsIgnoreCase("spear") && computersChoice.equals("spear")) {

                int spearToSpear = random.nextInt(2)+1;

                if (spearToSpear == 1) {
                    System.out.println("Gladiator hit you in the back with his spear. You died.☠");
                    HelpMethods.printSeparator(20);
                    lives--;
                }
                else {
                    System.out.println("You hit gladiator in the back with your spear. He died.☠");
                    HelpMethods.printSeparator(20);
                    computerLives--;
                }

                System.out.println("You have "+lives+" lives left.");
                System.out.println("Gladiator have "+computerLives+" lives left.");

                HelpMethods.anythingToContinue();
                HelpMethods.clearConsole();
            }
            else if (input.equalsIgnoreCase("spear") &&computersChoice.equals ("sword")) {

                int spearToSword = random.nextInt(99)+1;

                if (spearToSword <= 67) {
                    System.out.println("Gladiator slashed you with his sword. You died.☠");
                    HelpMethods.printSeparator(20);
                    lives--;
                }
                else {
                    System.out.println("You hit him in the face with your spear.You win!");
                    HelpMethods.printSeparator(20);
                    computerLives--;
                }

                System.out.println("You have "+lives+" lives left.");
                System.out.println("Gladiator have "+computerLives+" lives left.");

                HelpMethods.anythingToContinue();
                HelpMethods.clearConsole();
            }
            else if (input.equalsIgnoreCase("spear") && computersChoice.equals("giant hammer")) {

                int spearToHammer = random.nextInt(99)+1;

                if (spearToHammer <= 67) {
                    System.out.println("You threw your spear right through his heart.He died.☠");
                    HelpMethods.printSeparator(20);
                    computerLives--;
                }
                else {
                    System.out.println("Gladiator threw his spear right through your heart.You died.☠");
                    HelpMethods.printSeparator(20);
                    lives--;
                }

                System.out.println("You have "+lives+" lives left.");
                System.out.println("Gladiator have "+computerLives+" lives left.");

                HelpMethods.anythingToContinue();
                HelpMethods.clearConsole();
            }
            else{
                System.out.println("Error");
                HelpMethods.anythingToContinue();
                HelpMethods.clearConsole();
            }
            //Game ends when user runs out of lives
            if (lives == 0) {
                System.out.println("You are out of lives!");
                finished = true;
            } else if (computerLives == 0) {
                System.out.println("Gladiator is out of lives!");
                finished = true;
            }
        }
    }
}
