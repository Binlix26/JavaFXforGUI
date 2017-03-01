package javaBook;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application{
	
	@Override // override the start method in Application class
	public void start(Stage primaryStage) {
		// create a scene and place the button in the scene
		Button btOK = new Button("OK");
		Scene scene = new Scene(btOK, 200, 250);
		
		primaryStage.setTitle("MyJavaFX"); // set the stage title
		primaryStage.setScene(scene); // place the scene in the stage
		//primaryStage.setResizable(false);
		primaryStage.show(); // display the stage
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

}
