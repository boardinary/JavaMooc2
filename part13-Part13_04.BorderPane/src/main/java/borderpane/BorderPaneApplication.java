package borderpane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class BorderPaneApplication extends Application {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        launch(BorderPaneApplication.class);
    }
    
    @Override
    public void start(Stage window) {
        Button buttonComponent = new Button("button");
        
        BorderPane layout = new BorderPane();
        
        layout.setTop(new Label("NORTH"));
        layout.setBottom(new Label("SOUTH"));
        layout.setLeft(new Label("WEST"));
        layout.setRight(new Label("EAST"));
        
        Scene view = new Scene(layout);
        
        window.setScene(view);
        window.show();
    }
}
