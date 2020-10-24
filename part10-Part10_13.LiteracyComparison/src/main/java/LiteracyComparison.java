
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;


public class LiteracyComparison {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        try {
            Files.lines(Paths.get("literacy.csv")).forEach(row -> list.add(row));
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        list.stream().map(row -> row.split(","))
                .sorted((a1, a2) -> Double.valueOf(a1[5]).compareTo(Double.valueOf(a2[5])))
                .map(record -> {
                    return new String[] 
                    {record[3].trim() + " (" + record[4].trim() + ")",
                        record[2].substring(0, record[2].length() - 4).trim(),
                        record[5].trim()};
                })
                .map(a -> {return a[0] + ", " + a[1] + ", " + a[2];})
                .forEach(a -> System.out.println(a));
    }
}

