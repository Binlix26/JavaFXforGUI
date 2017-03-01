package javaBook;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MutipleStageDemo extends Application {
	@Override
	public void start(Stage primaryStage) {
		Scene scene = new Scene(new Button("OK"), 200, 250);
		primaryStage.setTitle("MyJavaFx");
		primaryStage.setScene(scene);
		//primaryStage.setResizable(false);
		primaryStage.show();

		Stage stage = new Stage();
		stage.setTitle("Second Stage");
		stage.setScene(new Scene(new Button("New Stage"), 100, 100));
		//stage.setResizable(false);
		stage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

}
