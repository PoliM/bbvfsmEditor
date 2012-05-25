package ch.bbv.fsm.fxedit.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

@ToString
public class StateMachineDefinition {

	@Getter
	@Setter
	private String name;

	private final List<State> states = Lists.newLinkedList();

	@Getter
	@Setter
	private State mainState;

	private final List<Event> events = Lists.newLinkedList();

	@Getter
	private final StateMachine stateMachine = new StateMachine();

	public void addState(final State state) {
		states.add(state);
	}

	public void removeState(final State state) {
		states.remove(state);
	}

	public ImmutableList<State> getStates() {
		return ImmutableList.copyOf(states);
	}

	public void addEvent(final Event event) {
		events.add(event);
	}

	public void removeEvent(final Event event) {
		events.remove(event);
	}

	public ImmutableList<Event> getEvents() {
		return ImmutableList.copyOf(events);
	}
}
