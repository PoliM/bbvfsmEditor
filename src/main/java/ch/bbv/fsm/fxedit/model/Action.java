package ch.bbv.fsm.fxedit.model;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

import com.google.common.collect.ImmutableList;

public class Action {

	@Getter
	@Setter
	private String name;

	private List<Parameter> params;

	public void addParameter(final Parameter param) {
		params.add(param);
	}

	public void removeParameter(final Parameter param) {
		params.remove(param);
	}

	public ImmutableList<Parameter> getParams() {
		return ImmutableList.copyOf(params);
	}
}
