package javaBook;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by binlix26 on 1/03/17.
 */
public class ShowArc extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();

        Arc a1 = new Arc(150,100,80,80,30,35);
        a1.setFill(Color.RED);
        a1.setType(ArcType.ROUND);
        pane.getChildren().add(new Text(210,40,"arc1: round"));
        pane.getChildren().add(a1);

        Arc a2 = new Arc(150,100,80,80,30+90,35);
        a2.setFill(Color.WHITE);
        a2.setType(ArcType.OPEN);
        a2.setStroke(Color.BLACK);
        pane.getChildren().add(new Text(20,40,"arc2: open"));
        pane.getChildren().add(a2);

        Arc a3 = new Arc(150,100,80,80,30+180,35);
        a3.setFill(Color.WHITE);
        a3.setType(ArcType.CHORD);
        a3.setStroke(Color.BLACK);
        pane.getChildren().add(new Text(20,170,"arc3: chord"));
        pane.getChildren().add(a3);

        Arc a4 = new Arc(150,100,80,80,30+270,35);
        a4.setFill(Color.GREEN);
        a4.setType(ArcType.CHORD);
        a4.setStroke(Color.BLACK);
        pane.getChildren().add(new Text(210,170,"arc4: chord"));
        pane.getChildren().add(a4);

        Scene scene = new Scene(pane,300,200);
        primaryStage.setTitle("ShowArc");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
