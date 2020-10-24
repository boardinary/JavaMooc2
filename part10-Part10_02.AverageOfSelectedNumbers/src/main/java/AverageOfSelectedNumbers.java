
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String next = scanner.nextLine();

            if (next.equals("end")) {
                break;
            }

            list.add(next);
        }

        System.out.println("Print the average of the negative numbers"
                + "or the positive numbers? (n/p)");
        String command = scanner.nextLine();

        // Average of positive numbers
        if (command.equals("p")) {
            double average = list.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(n -> n > 0)
                    .average()
                    .getAsDouble();
            System.out.println("average of the positive numbers: " + average);

        } else if (command.equals("n")) {
            double average = list.stream()
                    .mapToInt(s -> Integer.valueOf(s))
                    .filter(n -> n < 0)
                    .average()
                    .getAsDouble();
            System.out.println("average of the negative numbers: " + average);

        }

    }
}
