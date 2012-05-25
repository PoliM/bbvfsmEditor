package ch.bbv.fsm.fxedit.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

public class Transition {

	@Getter
	@Setter
	private State from;

	@Getter
	@Setter
	private State to;

	@Getter
	@Setter
	private Event on;

	@Getter
	@Setter
	private Action execute;

	private final List<ParamValue> values = Lists.newLinkedList();

	public void addParamValue(final ParamValue pv) {
		values.add(pv);
	}

	public void removeParamValue(final ParamValue pv) {
		values.remove(pv);
	}

	public ImmutableList<ParamValue> getValues() {
		return ImmutableList.copyOf(values);
	}
}
