package javaBook;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by binlix26 on 28/02/17.
 */
public class ButtonInPane extends Application {

    @Override
    public void start(Stage primaryStage) {
        StackPane pane = new StackPane();
        pane.getChildren().add(new Button("OK"));
        //pane.getChildren().add(new Button("Test"));
        Scene scene = new Scene(pane, 200, 50);

        primaryStage.setTitle("Button In Pane");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
