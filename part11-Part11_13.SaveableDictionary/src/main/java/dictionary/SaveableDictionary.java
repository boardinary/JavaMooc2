package dictionary;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;

public class SaveableDictionary {

    private HashMap<String, String> dictionary;
    private HashMap<String, String> revDictionary;
    private String file;

    public SaveableDictionary() {
        this.dictionary = new HashMap<>();
        this.revDictionary = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this.dictionary = new HashMap<>();
        this.revDictionary = new HashMap<>();
        this.file = file;
    }

    public boolean load() {
        try {
            Files.lines(Paths.get("words.txt")).map(line -> line.split(":"))
                    .forEach(record -> {
                        this.dictionary.putIfAbsent(record[0].trim(), record[1].trim());
                        this.revDictionary.putIfAbsent(record[1].trim(), record[0].trim());
                    });
        } catch (IOException e) {
            System.out.println("Error reading file " + e.getMessage());
            return false;
        }
        return true;
    }
    
    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(this.file);
            
            this.dictionary.keySet().forEach(key -> {
                writer.println(key + ":" + this.dictionary.get(key));
            });
            writer.close();
        } catch (IOException e) {
            return false;
        }        
        return true;
    }

    public void add(String words, String translation) {

        this.dictionary.putIfAbsent(words, translation);
        this.revDictionary.putIfAbsent(translation, words);
    }

    public String translate(String word) {
        String firstLookup = this.dictionary.getOrDefault(word, null);

        if (firstLookup == null) {
            return this.revDictionary.getOrDefault(word, null);
        }

        return firstLookup;
    }

    public void delete(String word) {
        if (this.dictionary.containsKey(word)) {
            this.revDictionary.remove(this.dictionary.get(word));
            this.dictionary.remove(word);

        } else if (this.revDictionary.containsKey(word)) {
            this.dictionary.remove(this.revDictionary.get(word));
            this.revDictionary.remove(word);
        }
    }
}
