package ch.bbv.fsm.fxedit.simple;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.SceneBuilder;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBuilder;
import javafx.scene.control.ListView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.FlowPaneBuilder;
import javafx.scene.layout.HBox;
import javafx.scene.layout.HBoxBuilder;
import javafx.stage.Stage;
import ch.bbv.fsm.fxedit.model.State;
import ch.bbv.fsm.fxedit.model.StateMachineDefinition;

public class SimpleMain extends Application {

	private int stateCounter = 1;
	private final StateMachineDefinition smDef = new StateMachineDefinition();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("bbvfsm Simple Stuff");

		State mainState = new State();
		smDef.setMainState(mainState);

		Button btAdd = ButtonBuilder.create().text("Add").build();

		HBox buttons = HBoxBuilder.create().spacing(10).children(btAdd).build();

		ListView<State> list = new ListView<>(smDef.getStates());

		FlowPane sceneRoot = FlowPaneBuilder.create().orientation(Orientation.HORIZONTAL).children(buttons, list)
				.build();

		btAdd.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				String title = "Hello " + stateCounter;
				System.out.println(title);
				State state = new State();
				state.setName(title);
				smDef.getStates().add(state);
				stateCounter++;
			}
		});

		Scene scene = SceneBuilder.create().width(600).height(250).root(sceneRoot).build();
		primaryStage.setScene(scene);
		primaryStage.show();
	}
}
