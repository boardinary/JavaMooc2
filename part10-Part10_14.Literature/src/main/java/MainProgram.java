
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            
            if (name.isEmpty()) {
                break;
            }
            
            System.out.print("Input the age recommendation: ");
            int ageRecommendation = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(name, ageRecommendation));
        }
        
        System.out.println(books.size() + " books in total. \n"
                + "\nBooks:\n");
        
        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRecommendation)
                .thenComparing(Book::getName);
        
        books.stream()
                .sorted(comparator)
                .forEach(book -> System.out.println(book.getName()
                + " (recommended for " + book.getAgeRecommendation()
                + " year-olds or older)"));
    }

}
