// import stuff
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // create a scanner
        Scanner game = new Scanner(System.in);
        // go to sleep for any amount of seconds
        Thread.sleep(500);
        System.out.println("\nHello player, welcome to Survive the Night.");
        Thread.sleep(1000);
        System.out.println("In this game you will be playing as a man named Isaac Jeffries.");
        Thread.sleep(1000);
        System.out.println("Now, would you like to start the game?");
        System.out.println("\ny/n: ");
        String gameStart = game.nextLine();

        // make an if statement for choices
        // if choice is no or not a choice then return and end the program
        // else if the choice is yes, continue forward
        if(gameStart.equalsIgnoreCase("y") || gameStart.equalsIgnoreCase("yes")) {
            Thread.sleep(1000);
            System.out.println("\nYou wake up in your somewhat trashy apartment room, there being basically cardboard boxes on the ground, a left over Freddy Fazbear pizza box on a table, and generally just trash everywhere.");
            Thread.sleep(2000);
            System.out.println("You walk around feeling groggy and terrible, just like any other day.");
            Thread.sleep(1500);
            System.out.println("There is a knock on the door and through the door flap a newspaper comes through and lands on the floor.");
            Thread.sleep(1550);
            System.out.println("You walk over to the front door, bend over and pick up the newspaper and you start flipping through pages.");
            Thread.sleep(1550);
            System.out.println("As you are flipping through, one thing catches your eye.");
            Thread.sleep(1000);
            System.out.println("It's a help wanted section and Freddy Fazbear's is in the section looking for a nightguard.");
            Thread.sleep(1525);
            System.out.println("You scoff and shake your head, thought's lingering in your head about if you should take this job opportunity.");
            Thread.sleep(1550);
            System.out.println("You finally decide to try and take the job, you go and get changed and head out to Freddy's.");
            Thread.sleep(1525);
            System.out.println("After some time you get off of the city bus in a somewhat less building populated area.");
            Thread.sleep(1500);
            System.out.println("You walk over to Freddy's and enter through the doors, you see a man, dressed in professional clothing, and you step up to the front desk.");
            Thread.sleep(1700);
            System.out.println("You clear your throat.");
            Thread.sleep(1000);
            System.out.println("\nIsaac: Hello.., Uhm I would like to apply for the nightguard position.");
            Thread.sleep(1200);
            System.out.println("\nThe man looks at you.");
            Thread.sleep(1000);
            System.out.println("\nReceptionist: You want to what now?");
            Thread.sleep(1000);
            System.out.println("\nThe receptionist says as saying he didn't quite hear you.");
            Thread.sleep(1300);
            System.out.println("You speak a bit more clearly.");
            Thread.sleep(1000);
            System.out.println("\nIsaac: I would like to apply for the nightguard position.");
            Thread.sleep(1150);
            System.out.println("\nThe receptionist looks a bit shocked, he didn't expect for someone to apply so soon.");
            Thread.sleep(1200);
            System.out.println("\nReceptionist: Well alright then, let me go and get the papers.");
            Thread.sleep(1150);
            System.out.println("\nThe receptionist walks off and comes back with a paper for you to sign.");
            Thread.sleep(1175);
            System.out.println("\nReceptionist: Sign here, and here.");
            Thread.sleep(1000);
            System.out.println("\nThe receptionist says as he points at the designated spots for you to sign.");
            Thread.sleep(1175);
            System.out.println("You sign and fast forward you are to start tonight, so you go to the back of the pizzeria and into the employee only locker room and get changed.");
            Thread.sleep(1700);
            System.out.println("You close your locker and go to back into the employee lounge and exit through the door on the right side of the wall you are facing and enter a small hallway with a maintenance room on your left and the office in front of you.");
            Thread.sleep(2100);
            System.out.println("You see a tablet and interact with it, it turns on and you can see the camera system.");

        } else if(gameStart.equalsIgnoreCase("n") || gameStart.equalsIgnoreCase("no")) {
            System.out.println("You haven't even played the game yet.");
            Thread.sleep(1000);
            System.out.println("Oh well, goodbye I guess.");
            return;

        } else {
            System.out.println("You didn't even put a valid option.");
            return;
        }
    }
}
