package javaBook;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Created by binlix26 on 1/03/17.
 */
public class DisplayClock extends Application {
    @Override
    public void start(Stage primaryStage) {
        ClockPane clock = new ClockPane();

        String timeString = clock.getHour()+":"+clock.getMinute()+":"+clock.getSecond();
        Label lblCurrentTime = new Label(timeString);

        BorderPane pane = new BorderPane();
        pane.setCenter(clock);
        pane.setBottom(lblCurrentTime);
        BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);

        Scene scene = new Scene(pane,clock.getW(),clock.getH());
        primaryStage.setTitle("Display Clock");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
