package ch.bbv.fsm.fxedit.view;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

public class FXSampleController implements Initializable {
	@FXML
	private Text textField1;

	public void ggg(final ActionEvent event) {
		System.out.println("You clicked me!");
		textField1.setText("Gnap");
	}

	@Override
	public void initialize(final URL arg0, final ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
}
