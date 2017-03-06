package eventHandling;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Created by binlix26 on 5/03/17.
 */
public class ControlCircleWithMouseAndKey extends Application {
    private CirclePane circlePane = new CirclePane();

    @Override
    public void start(Stage primaryStage) {
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.CENTER);

        Button btEnlarge = new Button("Enlarge");
        Button btShrink = new Button("Shrink");
        hBox.getChildren().addAll(btEnlarge, btShrink);

        btEnlarge.setOnAction(event -> circlePane.enlarge());
        btShrink.setOnAction(event -> circlePane.shrink());

        // for mouse and key event
        circlePane.setOnMouseClicked(event -> {
            if (event.getButton() == MouseButton.PRIMARY) // mouse left
                circlePane.enlarge();
            else if (event.getButton() == MouseButton.SECONDARY) // mouse right
                circlePane.shrink();
        });

        circlePane.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.U)
                    circlePane.enlarge();
                else if (event.getCode() == KeyCode.getKeyCode("D"))
                    circlePane.shrink();
            }
        });

        /*circlePane.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.U)
                circlePane.enlarge();
            else if (event.getCode() == KeyCode.getKeyCode("D"))
                circlePane.shrink();
        });*/

        // Stage and Scene
        BorderPane pane = new BorderPane();
        pane.setCenter(circlePane);
        pane.setBottom(hBox);
        BorderPane.setAlignment(hBox, Pos.CENTER);

        Scene scene = new Scene(pane,300,150);
        primaryStage.setTitle(("ControlCircleWithMouseAndKey"));
        primaryStage.setScene(scene);
        primaryStage.show();

        //get focus
        circlePane.requestFocus();
    }
}
