import java.util.ArrayList;
import java.util.Scanner;

// User Interface for the app

public class UI {
    private ArrayList<String> ExerciseList;
    private Scanner scanner;

    // initialize
    public UI() {
        this.ExerciseList = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    // start the program/app
    public void start() {
        while(true){
            System.out.println("Input command:");
            System.out.println("Enter 'X' or 'x' to quit");

            // user input
            String userInput = scanner.nextLine();

            // quit if X or x is enter
            if(userInput.equalsIgnoreCase("X")) {
                break;
            }

        }
    }
}
