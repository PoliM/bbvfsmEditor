package ch.bbv.fsm.fxedit.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

public class StateMachine {

	@Getter
	@Setter
	private String name;

	private final List<Action> actions = Lists.newLinkedList();

	public void addAction(final Action action) {
		actions.add(action);
	}

	public void removeAction(final Action action) {
		actions.remove(action);
	}

	public ImmutableList<Action> getActions() {
		return ImmutableList.copyOf(actions);
	}
}
