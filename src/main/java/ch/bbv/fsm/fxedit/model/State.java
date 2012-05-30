package ch.bbv.fsm.fxedit.model;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class State extends Nameable {

	private final SimpleObjectProperty<HistoryType> historyType = new SimpleObjectProperty<>(this, "historyType");

	private final SimpleBooleanProperty init = new SimpleBooleanProperty(this, "init");

	private final ObservableList<State> subStates = FXCollections.observableArrayList();

	private final ObservableList<Transition> transitions = FXCollections.observableArrayList();

	public HistoryType getHistoryType() {
		return historyType.get();
	}

	public void setHistoryType(final HistoryType ht) {
		historyType.set(ht);
	}

	public ObjectProperty<HistoryType> historyTypeProperty() {
		return historyType;
	}

	public boolean isInit() {
		return init.get();
	}

	public void setInit(final boolean init) {
		this.init.set(init);
	}

	public BooleanProperty initPropert() {
		return init;
	}

	public ObservableList<State> getSubStates() {
		return subStates;
	}

	public ObservableList<Transition> getTransitions() {
		return transitions;
	}
}
