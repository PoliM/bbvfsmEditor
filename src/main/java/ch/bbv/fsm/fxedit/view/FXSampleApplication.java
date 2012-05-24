package ch.bbv.fsm.fxedit.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class FXSampleApplication extends Application {

	@Override
	public void start(final Stage primaryStage) throws Exception {
		primaryStage.setTitle("FXML TableView Example");

		final AnchorPane anchorPane = (AnchorPane) FXMLLoader.load(getClass()
				.getResource("/sample.fxml"));

		final Scene scene = new Scene(anchorPane);

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(final String[] args) {
		launch(args);
	}
}
