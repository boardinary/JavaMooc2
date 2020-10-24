
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        while (true) {
            String next = scanner.nextLine();
            if (next.isEmpty()) {
                break;
            }
            
            list.add(next);
        }
        
        list.stream().forEach(row -> System.out.println(row));
    }
}
