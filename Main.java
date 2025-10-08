// import stuff
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // create a scanner
        Scanner game = new Scanner(System.in);
        // go to sleep for any amount of seconds
        Thread.sleep(500);
        System.out.println("Hello player, welcome to Survive the Night.");
        Thread.sleep(1000);
        System.out.println("In this game you will be playing as a man named Issac Jeffries.");
        Thread.sleep(1000);
        System.out.println("Now, would you like to start the game?");
        System.out.println("y/n: ");
        String gameStart = game.nextLine();

        // make an if statement for choices
        // if choice is no or not a choice then return and end the program
        // else if the choice is yes, continue forward
        if(gameStart.equalsIgnoreCase("n") || gameStart.equalsIgnoreCase("no")) {
            System.out.println("You haven't even played the game yet.");
            Thread.sleep(1000);
            System.out.println("Oh well, goodbye I guess.");
            return;
        } else if(gameStart.equalsIgnoreCase("y") || gameStart.equalsIgnoreCase("yes")) {

        } else {
            System.out.println("You didn't even put a valid option.");
            return;
        }
    }
}
