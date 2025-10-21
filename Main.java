// import stuff
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

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
            // Night 1
            System.out.println("\nYou wake up in your somewhat trashy apartment room, there being basically cardboard boxes on the ground, a left over Freddy Fazbear pizza box on a table, and generally just trash everywhere.");
            Thread.sleep(3000);
            System.out.println("You walk around feeling groggy and terrible, just like any other day.");
            Thread.sleep(3000);
            System.out.println("There is a knock on the door and through the door flap a newspaper comes through and lands on the floor.");
            Thread.sleep(3000);
            System.out.println("You walk over to the front door, bend over and pick up the newspaper and you start flipping through pages.");
            Thread.sleep(3000);
            System.out.println("As you are flipping through, one thing catches your eye.");
            Thread.sleep(3000);
            System.out.println("It's a help wanted section and Freddy Fazbear's is in the section looking for a nightguard.");
            Thread.sleep(3000);
            System.out.println("You scoff and shake your head, thought's lingering in your head about if you should take this job opportunity.");
            Thread.sleep(3000);
            System.out.println("You finally decide to try and take the job, you go and get changed and head out to Freddy's.");
            Thread.sleep(3000);
            System.out.println("After some time you get off of the city bus in a somewhat less building populated area.");
            Thread.sleep(3000);
            System.out.println("You walk over to Freddy's and enter through the doors, you see a man, dressed in professional clothing, and you step up to the front desk.");
            Thread.sleep(3000);
            System.out.println("You clear your throat.");
            Thread.sleep(3000);
            System.out.println("\nIsaac: Hello.., Uhm I would like to apply for the nightguard position.");
            Thread.sleep(3000);
            System.out.println("\nThe man looks at you.");
            Thread.sleep(3000);
            System.out.println("\nReceptionist: You want to what now?");
            Thread.sleep(3000);
            System.out.println("\nThe receptionist says as saying he didn't quite hear you.");
            Thread.sleep(3000);
            System.out.println("You speak a bit more clearly.");
            Thread.sleep(3000);
            System.out.println("\nIsaac: I would like to apply for the nightguard position.");
            Thread.sleep(3000);
            System.out.println("\nThe receptionist looks a bit shocked, he didn't expect for someone to apply so soon.");
            Thread.sleep(3000);
            System.out.println("\nReceptionist: Well alright then, let me go and get the papers.");
            Thread.sleep(3000);
            System.out.println("\nThe receptionist walks off and comes back with a paper for you to sign.");
            Thread.sleep(3000);
            System.out.println("\nReceptionist: Sign here, and here.");
            Thread.sleep(3000);
            System.out.println("\nThe receptionist says as he points at the designated spots for you to sign.");
            Thread.sleep(3000);
            System.out.println("You sign and fast forward you are to start tonight, so you go to the back of the pizzeria and into the employee only locker room and get changed.");
            Thread.sleep(3000);
            System.out.println("You close your locker and go to back into the employee lounge and exit through the door on the right side of the wall you are facing and enter a small hallway with a maintenance room on your left and the office in front of you.");
            Thread.sleep(3000);
            System.out.println("You see a tablet and interact with it, it turns on and you can see the camera system.");
            Thread.sleep(3000);
            System.out.println("You look at the cameras, especially the main stage and see all of the animatronics are on the stage.");
            Thread.sleep(3000);
            System.out.println("You put down the camera.");
            Thread.sleep(3000);
            System.out.println("Isaac: Jeez, it's so boring here.");
            Thread.sleep(3000);
            System.out.println("You get out of your chair and enter parts & service.");
            Thread.sleep(3000);
            System.out.println("Here are your options.\nLoading dock\nKitchen hall\nMain stage\nDining hall");
            System.out.println("What will you go and do?: ");
            String firstChoice = game.nextLine();

            boolean condition = true;
            loopOne: while(condition) {
                if(firstChoice.equalsIgnoreCase("loading dock") || firstChoice.equalsIgnoreCase("loadingdock")) {
                    Thread.sleep(1000);
                    System.out.println("You walk into the Loading dock and see all sort of crates ranging from fazbear containers to small boxes.");
                    Thread.sleep(3000);
                    System.out.println("You also see a fire axe cabinet that's locked, looks useful but it's behind a glass and a lock.");
                    Thread.sleep(3000);
                    System.out.println("Here are your options.\nparts & service\nemployees lounge\nside exit");
                    System.out.println("What will you go and do?: ");
                    firstChoice = game.nextLine();

                        if (firstChoice.equalsIgnoreCase("parts and service") || firstChoice.equalsIgnoreCase("partsandservice") || firstChoice.equalsIgnoreCase("parts & service") || firstChoice.equalsIgnoreCase("parts&service")){
                            Thread.sleep(1000);
                            System.out.println("You walk back into parts & service, everything still normal and how it's supposed to be.");
                            Thread.sleep(3000);
                            System.out.println("Here are your options.\nLoading dock\nKitchen hall\nMain stage\nDining hall");
                            System.out.println("What will you go and do?: ");

                            firstChoice = game.nextLine();
                        }
                } else if(firstChoice.equalsIgnoreCase("kitchen hall") || firstChoice.equalsIgnoreCase("kitchenhall")) {
                    Thread.sleep(1000);
                    System.out.println("You walk up to the door that goes into the kitchen hall, open the door and enter.");
                    Thread.sleep(3000);
                    System.out.println("You are can see the doors that lead to the kitchen and the hallway curving over to your left leading into the dining hall.");
                    Thread.sleep(3000);
                    System.out.println("Here are your options.\nkitchen\ndining hall\nparts & service");
                    System.out.println("What will you go and do?: ");
                    firstChoice = game.nextLine();

                    if (firstChoice.equalsIgnoreCase("parts and service") || firstChoice.equalsIgnoreCase("partsandservice") || firstChoice.equalsIgnoreCase("parts & service") || firstChoice.equalsIgnoreCase("parts&service")){
                        Thread.sleep(1000);
                        System.out.println("You walk back into parts & service, everything still normal and how it's supposed to be.");
                        Thread.sleep(3000);
                        System.out.println("Here are your options.\nLoading dock\nKitchen hall\nMain stage\nDining hall");
                        System.out.println("What will you go and do?: ");

                        firstChoice = game.nextLine();
                    }
                } else if(firstChoice.equalsIgnoreCase("main stage") || firstChoice.equalsIgnoreCase("mainstage")) {
                    Thread.sleep(1000);
                    System.out.println("You walk onto the main stage and see the band, all of them deactivated and stuck frozen in the same poses from when the place was open during the day.");
                    Thread.sleep(3000);
                    System.out.println("Beyond the band, you can see endless rows of tables and the prize counter at the end of those table directly lined up with the stage, facing it.");
                    Thread.sleep(3000);
                    System.out.println("Here are your options.\nparts & service");
                    System.out.println("What will you go and do?: ");
                    firstChoice = game.nextLine();

                    if (firstChoice.equalsIgnoreCase("parts and service") || firstChoice.equalsIgnoreCase("partsandservice") || firstChoice.equalsIgnoreCase("parts & service") || firstChoice.equalsIgnoreCase("parts&service")){
                        Thread.sleep(1000);
                        System.out.println("You walk back into parts & service, everything still normal and how it's supposed to be.");
                        Thread.sleep(3000);
                        System.out.println("Here are your options.\nLoading dock\nKitchen hall\nMain stage\nDining hall");
                        System.out.println("What will you go and do?: ");

                        firstChoice = game.nextLine();
                    }
                } else if(firstChoice.equalsIgnoreCase("dining hall") || firstChoice.equalsIgnoreCase("dininghall")) {
                    Thread.sleep(1000);
                    System.out.println("You walk back into parts & service, everything still normal and how it's supposed to be.");
                    Thread.sleep(3000);
                    System.out.println("Here are your options.\nparts & service\n prize corner\nparty room 1\nparty room 2\nparty room 3\nparty room 4\nwest bathroom hall\neast bathroom hall");
                    System.out.println("What will you go and do?: ");
                    firstChoice = game.nextLine();

                    if (firstChoice.equalsIgnoreCase("parts and service") || firstChoice.equalsIgnoreCase("partsandservice") || firstChoice.equalsIgnoreCase("parts & service") || firstChoice.equalsIgnoreCase("parts&service")){
                        Thread.sleep(1000);
                        System.out.println("You walk back into parts & service, everything still normal and how it's supposed to be.");
                        Thread.sleep(3000);
                        System.out.println("Here are your options.\nLoading dock\nKitchen hall\nMain stage\nDining hall");
                        System.out.println("What will you go and do?: ");

                        firstChoice = game.nextLine();
                    }
                } else {
                    System.out.println("Sorry but this isn't a choice.");
                    return;
                }
            }


        } else if(gameStart.equalsIgnoreCase("n") || gameStart.equalsIgnoreCase("no")) {
            Thread.sleep(1000);
            System.out.println("You haven't even played the game yet.");
            Thread.sleep(1000);
            System.out.println("Oh well, goodbye I guess.");
            return;

        } else {
            Thread.sleep(1000);
            System.out.println("You didn't even put a valid option.");
            return;
        }
    }
}
