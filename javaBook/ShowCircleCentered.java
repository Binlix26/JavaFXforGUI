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
public class ShowCircleCentered extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        Circle circle = new Circle();
        // bind these two properties in case the window is changed
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));

        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        pane.getChildren().add(circle);

        Scene scene = new Scene(pane, 200, 200);

        primaryStage.setTitle("Show Circle Centered");
        primaryStage.setScene(scene);
        primaryStage.show();

        System.out.println(pane.widthProperty()+" : "+pane.heightProperty());
       // System.out.println(pane.getWidth()+" : "+pane.getHeight());

    }
}
