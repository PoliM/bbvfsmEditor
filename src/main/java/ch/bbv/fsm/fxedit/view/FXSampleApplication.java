package ch.bbv.fsm.fxedit.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FXSampleApplication extends Application {

	@Override
	public void start(final Stage primaryStage) throws Exception {
		primaryStage.setTitle("FXML TableView Example");
		primaryStage.setScene((Scene) FXMLLoader.load(getClass().getResource(
				"/sample.fxml")));
		primaryStage.show();
	}

	public static void main(final String[] args) {
		launch(args);
	}
}
