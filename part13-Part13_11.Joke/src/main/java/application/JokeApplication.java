package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JokeApplication extends Application {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(JokeApplication.class);
    }
    
    @Override
    public void start(Stage window) {
        
        BorderPane layout = new BorderPane();
        
        HBox menu = new HBox();
        menu.setPadding(new Insets(20, 20, 20, 20));
        menu.setSpacing(10);
        
        Button joke = new Button("Joke");
        Button answer = new Button("Answer");
        Button explanation = new Button("Explanation");
        
        Label jokeText = new Label("What do you call a bear with no teeth?");
        Label answerText = new Label("A gummy bear.");
        Label explanationText = new Label("All gums and no teeth.");
        
        menu.getChildren().addAll(joke, answer, explanation);
        layout.setTop(menu);
        
        StackPane firstLayout = createView(jokeText);
        StackPane secondLayout = createView(answerText);
        StackPane thirdLayout = createView(explanationText);
        
        joke.setOnAction((event) -> layout.setCenter(firstLayout));
        answer.setOnAction((event) -> layout.setCenter(secondLayout));
        explanation.setOnAction((event) -> layout.setCenter(thirdLayout));
        
        layout.setCenter(firstLayout);
        
        Scene scene = new Scene(layout);
        
        window.setScene(scene);
        window.show();
    }
    
    private StackPane createView(Label label) {
        
        StackPane layout = new StackPane();
        layout.setPrefSize(300, 100);
        layout.getChildren().add(label);
        layout.setAlignment(Pos.CENTER);
        
        return layout;
    }
}
