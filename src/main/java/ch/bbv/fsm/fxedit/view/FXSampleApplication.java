package ch.bbv.fsm.fxedit.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import ch.bbv.fsm.fxedit.FxEditModule;

import com.google.common.eventbus.EventBus;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class FXSampleApplication extends Application {

	@Inject
	private EventBus eventBus;

	@Inject
	private FxLoaderHelper fxLoaderHelper;

	public FXSampleApplication() {
		final Injector injector = Guice.createInjector(new FxEditModule());
		injector.injectMembers(this);
	}

	@Override
	public void start(final Stage primaryStage) throws Exception {
		primaryStage.setTitle("FXML TableView Example");

		fxLoaderHelper.loadFXML(getClass().getResource("/sample.fxml"));

		final AnchorPane anchorPane = (AnchorPane) FXMLLoader.load(getClass()
				.getResource("/sample.fxml"), null, new JavaFXBuilderFactory());

		final Scene scene = new Scene(anchorPane);

		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(final String[] args) {
		launch(args);
	}
}
