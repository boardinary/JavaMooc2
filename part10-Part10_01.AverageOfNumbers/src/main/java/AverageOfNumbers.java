
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

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
        
        double average = list.stream().mapToInt(s -> Integer.valueOf(s))
                .average().getAsDouble();
        
        System.out.println("average of the numbers: " + average);

    }
}
