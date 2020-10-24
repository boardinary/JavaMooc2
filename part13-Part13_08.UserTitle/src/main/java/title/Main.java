package title;

import java.util.Scanner;
import javafx.application.Application;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a title");
        String param = "--Title=" + scanner.nextLine();
        
        Application.launch(UserTitle.class, param);

    }

}
