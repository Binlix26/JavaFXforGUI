package EventHandling;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * Created by binlix26 on 5/03/17.
 */
public class MouseEventDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        Text text= new Text(20,20,"Programming is fun!");
        pane.getChildren().add(text);

        text.setOnMouseDragged((MouseEvent event) -> {
            text.setX(event.getX());
            text.setY(event.getY());

        });

        Scene scene = new Scene(pane, 300, 100);
        primaryStage.setTitle("MouseEventDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
