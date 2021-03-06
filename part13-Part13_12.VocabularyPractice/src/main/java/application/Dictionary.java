
package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;


public class Dictionary {
    private Map<String, String> translations;
    private List<String> words;
    
    public Dictionary() {
        this.translations = new HashMap<>();
        this.words = new ArrayList<>();
        add("sana", "word");
    }
    
    public String get(String word) {
        return this.translations.get(word);
    }
    
    public void add(String word, String translation) {
        if (this.translations.containsKey(word)) {
        } else {
            this.words.add(word);
            this.translations.put(word, translation);
        }
    }
    
    public String getRandomWord() {
        Random random = new Random();
        return this.words.get(random.nextInt(this.words.size()));
    }
}
