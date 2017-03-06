package eventHandling;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

/**
 * Created by binlix26 on 6/03/17.
 */
public class FileSelect extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label labelFile = new Label();

        Button btn = new Button();

        btn.setText("Browse File");

        btn.setOnAction(event -> {
            FileChooser fileChooser = new FileChooser();

            fileChooser.setTitle("Select File");

            //Set extension filter
            FileChooser.ExtensionFilter extFilter =
                    new FileChooser.ExtensionFilter("*", "*");
            fileChooser.getExtensionFilters().add(extFilter);


            //Show open file dialog
            File file = fileChooser.showOpenDialog(null);

            if (file != null)
                labelFile.setText(file.getPath());
        });

        BorderPane pane = new BorderPane();
        pane.setTop(labelFile);
        pane.setCenter(btn);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("file");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
