package javaBook;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Created by binlix26 on 28/02/17.
 */
public class ShowCircle extends Application {
    @Override
    public void start(Stage primaryStage) {
        // create a circle
        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);

        //get a stack pane and add node
        Pane pane = new Pane();
        pane.getChildren().add(circle);

        //put the pane/parent into a scene
        Scene scene = new Scene(pane, 200, 200);

        primaryStage.setTitle("Show Circle");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
