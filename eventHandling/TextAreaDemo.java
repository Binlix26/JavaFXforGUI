package eventHandling;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * Created by binlix26 on 6/03/17.
 */
public class TextAreaDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        DescriptionPane pane = new DescriptionPane();
        pane.setTitle("Canada");
        String description = "The Canadian national flag...";
        pane.setDescription(description);
        pane.setImageView(new ImageView("eventHandling/ca.gif"));

        Scene scene = new Scene(pane,450,200);
        primaryStage.setTitle("TextAreaDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
