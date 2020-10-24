import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Checker checker = new Checker();
        
        System.out.print("Enter a string: ");

        if (checker.timeOfDay(scanner.nextLine())) {
            System.out.println("The form is correct.");
        } else {
            System.out.println("The form is incorrect.");
        }
    }
}
