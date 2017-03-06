package eventHandling;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

import java.io.File;

/**
 * Created by binlix26 on 6/03/17.
 */
public class FolderSelect extends Application {
    @Override
    public void start(Stage primaryStage) {
        Label labelFile = new Label();

        Button btn = new Button();
        btn.setText("Browse Directory");

        btn.setOnAction(event -> {
            DirectoryChooser directoryChooser = new DirectoryChooser();

            directoryChooser.setTitle("This is my file ch");

            //Show open file dialog

            File file = directoryChooser.showDialog(null);

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
