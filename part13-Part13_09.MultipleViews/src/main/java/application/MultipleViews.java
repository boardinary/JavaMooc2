package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application{

    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(MultipleViews.class);
    }
    
    @Override
    public void start(Stage window) {
        
        BorderPane layout = new BorderPane();
        GridPane layout3 = new GridPane();
        VBox layout2 = new VBox();
        
        Label firstTitle = new Label("First view!");
        Button secondView = new Button("To the second view!");
        Button thirdView = new Button("To the third view!");
        Label secondTitle = new Label("Second view!");
        Label thirdTitle = new Label("Third view!");
        Button firstView = new Button("To the first view!");
        
        layout.setTop(firstTitle);
        layout.setCenter(secondView);
        
        layout2.getChildren().add(thirdView);
        layout2.getChildren().add(secondTitle);
        
        layout3.add(thirdTitle, 0, 0);
        layout3.add(firstView,1,1);
        
        Scene first = new Scene(layout);
        Scene second = new Scene(layout2);
        Scene third = new Scene(layout3);
        
        window.setScene(first);
        window.show();
        
        secondView.setOnAction((event) -> {
            window.setScene(second);
        });
        
        thirdView.setOnAction((event) -> {
            window.setScene(third);
        });
        
        firstView.setOnAction((event) -> {
            window.setScene(first);
        });
        
    }
}
