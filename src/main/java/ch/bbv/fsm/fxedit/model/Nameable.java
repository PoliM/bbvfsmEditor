package ch.bbv.fsm.fxedit.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Can be used as base class for all model objects that have a name.
 */
public class Nameable {

	private final SimpleStringProperty name = new SimpleStringProperty(this, "name");

	public StringProperty nameProperty() {
		return name;
	}

	public String getName() {
		return name.get();
	}

	public void setName(final String name) {
		this.name.set(name);
	}
}
