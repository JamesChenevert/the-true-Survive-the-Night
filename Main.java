// import scanner
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create a scanner
        Scanner game = new Scanner(System.in);
        try {
            // to sleep 3 seconds
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // recommended because catching InterruptedException clears interrupt flag
            Thread.currentThread().interrupt();
            // you probably want to quit if the thread is interrupted
            return;
        }
    }
}
