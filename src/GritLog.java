import java.time.LocalDate;
import java.util.Scanner;

// Main program

public class GritLog {
    public static void main(String[] args) {
        LocalDate myDate = LocalDate.now();
        System.out.println("Welcome to GritLog!");
        System.out.println("Today's date is " + myDate);

        UI newUser = new UI();
        newUser.start();
    }
}
