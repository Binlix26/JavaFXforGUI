package javaBook;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

/**
 * Created by binlix26 on 1/03/17.
 */
public class ShowEllipse extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        for (int i = 0; i < 16; i++) {
            Ellipse e = new Ellipse(150, 100, 100, 50);
            e.setStroke(Color.color(Math.random(), Math.random(), Math.random()));
            e.setFill(Color.WHITE);
            e.setRotate(i * 360 / 16);
            pane.getChildren().add(e);
        }

        Scene scene = new Scene(pane,300,200);
        primaryStage.setTitle("ShowEllipse");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
