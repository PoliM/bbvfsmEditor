package ch.bbv.fsm.fxedit.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

public class State {

	@Getter
	@Setter
	private String name;

	@Getter
	@Setter
	private HistoryType historyType;

	@Getter
	@Setter
	private boolean init;

	private final List<State> subStates = Lists.newLinkedList();

	private final List<Transition> transitions = Lists.newLinkedList();

	public void addSubState(final State state) {
		subStates.add(state);
		// TODO check that this state is not already used (introduce parent
		// relation and remove it from there)
	}

	public void removeSubState(final State state) {
		subStates.remove(state);
	}

	public ImmutableList<State> getSubStates() {
		return ImmutableList.copyOf(subStates);
	}

	public void addTransition(final Transition t) {
		transitions.add(t);
	}

	public void removeTransition(final Transition t) {
		transitions.remove(t);
	}

	public ImmutableList<Transition> getTransitions() {
		return ImmutableList.copyOf(transitions);
	}
}
