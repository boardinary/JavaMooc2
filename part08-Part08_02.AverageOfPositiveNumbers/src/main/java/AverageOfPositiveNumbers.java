
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            }
            list.add(input);
        }
        
        int count = 0;
        int sum = 0;
        boolean hasPositiveNumber = false;
        for (int num : list) {
            if (num > 0) {
                sum += num;
                count++;
                hasPositiveNumber = true;
            }
        }
        if (hasPositiveNumber) {
            System.out.println((double) sum / count);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
