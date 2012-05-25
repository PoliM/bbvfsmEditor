package ch.bbv.fsm.fxedit.view.application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javax.inject.Inject;

import com.google.common.eventbus.EventBus;

public class FsmEditorApplicationController implements Initializable {

	private final EventBus eventBus;

	@Inject
	public FsmEditorApplicationController(final EventBus eventBus) {
		this.eventBus = eventBus;
	}

	@Override
	public void initialize(final URL url, final ResourceBundle resourcebundle) {
		// TODO Auto-generated method stub

	}

	@FXML
	protected void close() {
		eventBus.post("gnap");
	}
}
