
package application;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;


public class PracticeView {
    
    private Dictionary dictionary;
    private String word;
    
    public PracticeView(Dictionary dictionary) {
        this.dictionary = dictionary;
        this.word = dictionary.getRandomWord();
    }
    
    public Parent getView() {
        GridPane layout = new GridPane();
        
        Label instruction = new Label("Translate the word '" + this.word + "'");
        TextField input = new TextField();
        Button checkButton = new Button("Check");
        Label result = new Label();
        
        layout.setAlignment(Pos.CENTER);
        layout.setVgap(10);
        layout.setHgap(10);
        layout.setPadding(new Insets(10, 10, 10, 10));
        
        layout.add(instruction, 0, 1);
        layout.add(input, 0, 2);
        layout.add(checkButton, 0, 3);
        layout.add(result, 0, 4);
        
        checkButton.setOnMouseClicked((event) -> {
            String entry = input.getText();
            String translation = this.dictionary.get(this.word);
            if (entry.equals(translation)) {
                result.setText("Correct!");
            } else {
                result.setText("Incorrect! The translation for the word '" + 
                        this.word + "' is '" + 
                        this.dictionary.get(this.word) + "'.");
                return;
            }
          
            this.word = this.dictionary.getRandomWord();
            instruction.setText("Translate the word '" + this.word);
            input.clear();
        });
        
        return layout;
    }
}
