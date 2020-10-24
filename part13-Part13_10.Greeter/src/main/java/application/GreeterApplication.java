package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GreeterApplication extends Application {


    public static void main(String[] args) {
        System.out.println("Hellow world! :3");
        launch(GreeterApplication.class);
    }
    
    @Override
    public void start(Stage window) {
        
        // First View
        Label namePrompt = new Label("Enter your name and start");
        TextField text = new TextField();
        Button start = new Button("Start");
        
        GridPane layout1 = new GridPane();
        layout1.add(namePrompt, 0, 1);
        layout1.add(text, 0, 2);
        layout1.add(start, 0, 3);
        
        layout1.setPrefSize(300, 100);
        layout1.setAlignment(Pos.CENTER);
        layout1.setVgap(10);
        layout1.setHgap(10);
        layout1.setPadding(new Insets(20, 20, 20, 20));
        
        Scene first = new Scene(layout1);
        
        //Second View             
        Label welcomeMsg = new Label();
        
        BorderPane layout2 = new BorderPane();
        layout2.setCenter(welcomeMsg);
        layout2.setPrefSize(300, 140);
        
        Scene welcome = new Scene(layout2);
        
        // Textfield entry logic
        start.setOnAction((event) -> {
            welcomeMsg.setText("Welcome " + text.getText() + "!");
            
            window.setScene(welcome);
        });
        
        window.setScene(first);
        window.show();
    }
}
