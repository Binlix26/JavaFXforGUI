package eventHandling;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Created by binlix26 on 6/03/17.
 */
public class TextFieldDemo extends RadioButtonDemo {
    @Override
    protected BorderPane getPane() {
        BorderPane pane = super.getPane();

        BorderPane paneForTextField = new BorderPane();
        paneForTextField.setPadding(new Insets(5));
        paneForTextField.setStyle("-fx-border-color: green");
        paneForTextField.setLeft(new Label("Enter a new Message:"));

        TextField  tf = new TextField();
        tf.setAlignment(Pos.BOTTOM_RIGHT);
        paneForTextField.setCenter(tf);

        pane.setTop(paneForTextField);

        tf.setOnAction(event -> text.setText(tf.getText()));

        return pane;
    }

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(getPane(),450,200);
        primaryStage.setTitle("TextFieldDemo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
