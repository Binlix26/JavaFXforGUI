package eventHandling;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Created by binlix26 on 6/03/17.
 */
public class RadioButtonDemo extends CheckBoxDemo {
    @Override
    protected BorderPane getPane() {
        BorderPane pane = super.getPane();

        VBox paneForRadioButtons = new VBox(20);
        paneForRadioButtons.setPadding(new Insets(5));
//        paneForRadioButtons.setStyle("-fx-border-color: green");
        paneForRadioButtons.setStyle("-fx-border-width: 2px; -fx-border-color: green");

        RadioButton rbRed = new RadioButton("Red");
        RadioButton rbGreen = new RadioButton("Green");
        RadioButton rbBlue = new RadioButton("Blue");
        paneForRadioButtons.getChildren().addAll(rbRed,rbGreen,rbBlue);
        pane.setLeft(paneForRadioButtons);

        ToggleGroup group = new ToggleGroup();
        rbRed.setToggleGroup(group);
        rbGreen.setToggleGroup(group);
        rbBlue.setToggleGroup(group);

        rbRed.setOnAction(event -> {
            if (rbRed.isSelected())
                text.setFill(Color.RED);
        });

        rbGreen.setOnAction(event -> {
            if (rbGreen.isSelected())
                text.setFill(Color.GREEN);
        });

        rbBlue.setOnAction(event -> {
            if (rbBlue.isSelected())
                text.setFill(Color.BLUE);
        });

        return pane;
    }

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(getPane(),450,200);
        primaryStage.setTitle("RadioButtonDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
