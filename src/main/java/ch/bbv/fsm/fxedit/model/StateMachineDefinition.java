package ch.bbv.fsm.fxedit.model;

import java.util.List;

import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lombok.Getter;
import lombok.ToString;

import com.google.common.collect.Lists;

/**
 * Definition of the state machine
 */
@ToString
public class StateMachineDefinition extends Nameable {

	private final ObservableList<State> states = FXCollections.observableArrayList();

	private final SimpleObjectProperty<State> mainState = new SimpleObjectProperty<State>(this, "mainState");

	private final List<Event> events = Lists.newLinkedList();

	@Getter
	private final StateMachine stateMachine = new StateMachine();

	public ObservableList<State> getStates() {
		return states;
	}

	public State getMainState() {
		return mainState.get();
	}

	public void setMainState(final State state) {
		mainState.set(state);
	}
}
