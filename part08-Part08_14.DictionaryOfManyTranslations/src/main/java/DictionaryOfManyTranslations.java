
import java.util.ArrayList;
import java.util.HashMap;

public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> dict;

    public DictionaryOfManyTranslations() {
        dict = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.dict.putIfAbsent(word, new ArrayList<>());
        this.dict.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        this.dict.putIfAbsent(word, new ArrayList<>());
        return this.dict.get(word);
    }

    public void remove(String word) {
        this.dict.remove(word);
    }
}
