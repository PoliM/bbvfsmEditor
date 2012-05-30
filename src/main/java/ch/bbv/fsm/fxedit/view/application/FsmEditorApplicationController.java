package ch.bbv.fsm.fxedit.view.application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.inject.Inject;

import ch.bbv.fsm.fxedit.fxutils.FxLoaderHelper;

import com.google.common.eventbus.EventBus;

public class FsmEditorApplicationController implements Initializable {

	private final EventBus eventBus;

	@FXML
	private AnchorPane anchorPane;

	private final FxLoaderHelper fxLoaderHelper;

	@Inject
	public FsmEditorApplicationController(final EventBus eventBus,
			final FxLoaderHelper fxLoaderHelper) {
		this.eventBus = eventBus;
		this.fxLoaderHelper = fxLoaderHelper;
	}

	@Override
	public void initialize(final URL url, final ResourceBundle resourcebundle) {
		// TODO Auto-generated method stub

	}

	@FXML
	protected void close() {
		eventBus.post("gnap");
	}

	@FXML
	protected void about(final ActionEvent event) {
		final Stage stage = new Stage(StageStyle.TRANSPARENT);
		stage.addEventHandler(MouseEvent.MOUSE_CLICKED,
				new EventHandler<MouseEvent>() {

					@Override
					public void handle(final MouseEvent arg0) {
						stage.hide();
					}
				});

		AnchorPane aboutContent = null;
		try {
			aboutContent = fxLoaderHelper.loadFXML(getClass().getResource(
					"about.fxml"));
		} catch (final IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		final Scene scene1 = new Scene(aboutContent);
		stage.initModality(Modality.APPLICATION_MODAL);
		// also tried WINDOW_MODAL
		stage.initOwner(anchorPane.getScene().getWindow());
		stage.setScene(scene1);
		stage.show();
		// Note that the next line is executed immediately, before the dialog is
		// hidden
	}
}
