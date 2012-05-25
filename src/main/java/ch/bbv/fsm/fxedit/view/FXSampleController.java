package ch.bbv.fsm.fxedit.view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

public class FXSampleController implements Initializable {

	@FXML
	private TextField textField1;

	@FXML
	public void ggg() {
		System.out.println("You clicked me!");
		textField1.setText("Gnap");
	}

	@Override
	public void initialize(final URL arg0, final ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
}
