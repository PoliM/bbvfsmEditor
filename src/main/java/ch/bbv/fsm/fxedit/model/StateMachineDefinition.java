package ch.bbv.fsm.fxedit.model;

import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lombok.Getter;
import lombok.ToString;

/**
 * Definition of the state machine
 */
@ToString
public class StateMachineDefinition extends Nameable {

	private final ObservableList<State> states = FXCollections.observableArrayList();

	private final SimpleObjectProperty<State> mainState = new SimpleObjectProperty<State>(this, "mainState");

	private final ObservableList<Event> events = FXCollections.observableArrayList();

	@Getter
	private final StateMachine stateMachine = new StateMachine();

	public ObservableList<State> getStates() {
		return states;
	}

	public ObservableList<Event> getEvents() {
		return events;
	}

	public State getMainState() {
		return mainState.get();
	}

	public void setMainState(final State state) {
		mainState.set(state);
	}

	public ObjectProperty<State> mainStateProperty() {
		return mainState;
	}
}
