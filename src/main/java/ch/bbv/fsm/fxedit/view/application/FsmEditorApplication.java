package ch.bbv.fsm.fxedit.view.application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import ch.bbv.fsm.fxedit.FsmEditorModule;
import ch.bbv.fsm.fxedit.fxutils.FxLoaderHelper;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

public class FsmEditorApplication extends Application {

	@Inject
	private FxLoaderHelper fxLoaderHelper;

	public FsmEditorApplication() {
		final Injector injector = Guice.createInjector(new FsmEditorModule());
		injector.injectMembers(this);
	}

	@Override
	public void start(final Stage primaryStage) throws Exception {
		primaryStage.setTitle("bbvfsm Editor");
		final AnchorPane anchorPane = fxLoaderHelper.loadFXML(getClass()
				.getResource("application.fxml"));
		final Scene scene = new Scene(anchorPane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}