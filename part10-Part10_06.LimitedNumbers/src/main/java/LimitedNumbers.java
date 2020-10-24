
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int next = Integer.valueOf(scanner.nextLine());
            
            if (next < 0) {
                break;
            }
            list.add(next);
        }
        
        list.stream().filter(n -> (n >= 1 && n <= 5))
                .forEach(n -> System.out.println(n));
    }
}
