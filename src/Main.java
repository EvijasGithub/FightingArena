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
        System.out.println("Welcome to Fighting Arena! Your opponent is Gladiator.");
        boolean finished = false;
        //User can magically come back to life three times
        int lives = 3;
        while (!finished) {
            System.out.println("Choose your weapon:'sword','spear','giant hammer'.");
            String input = scanner.nextLine();
            System.out.println("Gladiators choice:");
            String computersChoice = list[random.nextInt(list.length)];
            System.out.println(computersChoice);

            //Logic, going through all the possible combinations of weapons
            if (input.equalsIgnoreCase("giant hammer") && computersChoice.equals("giant hammer")) {
                System.out.println("Gladiator slammed you in the chest. You died.☠");
                //Every time user dies, one life comes off.
                lives--;
                System.out.println("You have "+lives+" lives left.");
            } else if (input.equalsIgnoreCase("giant hammer") && computersChoice.equals("spear")) {
                System.out.println("Gladiator threw his spear right through your heart.You died.☠");
                lives--;
                System.out.println("You have "+lives+" lives left.");
            } else if (input.equalsIgnoreCase("giant hammer") && computersChoice.equals("sword")) {
                System.out.println("You broke his leg with your hammer. Gladiator passed out. You win!");
                System.out.println("You have "+lives+" lives left.");
            }else if (input.equalsIgnoreCase("sword") && computersChoice.equals("sword")) {
                System.out.println("Gladiator slashed you with his sword. You died.☠");
                lives--;
                System.out.println("You have "+lives+" lives left.");
            } else if (input.equalsIgnoreCase("sword") && computersChoice.equals("spear")) {
                System.out.println("You put your sword trough his stomach. You win!");
                System.out.println("You have "+lives+" lives left.");
            } else if (input.equalsIgnoreCase("sword") && computersChoice.equals("giant hammer")) {
                System.out.println("He broke your back with his hammer. You died.☠");
                lives--;
                System.out.println("You have "+lives+" lives left.");
            }else if (input.equalsIgnoreCase("spear") && computersChoice.equals("spear")) {
                System.out.println("Gladiator hit you in the back with his spear. You died.☠");
                lives--;
                System.out.println("You have "+lives+" lives left.");
            } else if (input.equalsIgnoreCase("spear") &&computersChoice.equals ("sword")) {
                System.out.println("You hit him in the face with your spear.You win!");
                System.out.println("You have "+lives+" lives left.");
            } else if (input.equalsIgnoreCase("spear") && computersChoice.equals("giant hammer")) {
                System.out.println("He smashed your hand and you bled out.☠");
                lives--;
                System.out.println("You have "+lives+" lives left.");
            }else{
                System.out.println("Error");
                break;
            }
            //Game ends when user runs out of lives
            if (lives == 0) {
                System.out.println("You are out of lives!");
                finished = true;
            }
        }
    }
}
