package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(TextStatisticsApplication.class);
    }
    
    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        
        TextArea text = new TextArea();
        
        Label letterCount = new Label();
        Label wordCount = new Label();
        Label longestWord = new Label();
        
        HBox report = new HBox();
        report.setSpacing(10);
        report.getChildren().add(letterCount);
        report.getChildren().add(wordCount);
        report.getChildren().add(longestWord);
        
        text.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> change, String oldValue, String newValue) {
                int characters = newValue.length();
                String[] parts = newValue.split(" ");
                int words = parts.length;
                String longest = Arrays.stream(parts)
                        .sorted((s1, s2) -> s2.length() - s1.length())
                        .findFirst()
                        .get();
                
                letterCount.setText("Letters: " + characters);
                wordCount.setText("Words: " + words);
                longestWord.setText("The longest word is: " + longest);
            }
        });      
        
        layout.setCenter(text);
        layout.setBottom(report);
        
        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }

}
