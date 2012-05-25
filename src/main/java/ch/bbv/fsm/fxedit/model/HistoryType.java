package ch.bbv.fsm.fxedit.model;

public enum HistoryType {
	/**
	 * The state enters into its initial sub-state. The sub-state itself enters
	 * its initial sub-state and so on until the innermost nested state is
	 * reached.
	 */
	NONE,

	/**
	 * The state enters into its last active sub-state. The sub-state itself
	 * enters its initial sub-state and so on until the innermost nested state
	 * is reached.
	 */
	SHALLOW,

	/**
	 * The state enters into its last active sub-state. The sub-state itself
	 * enters into-its last active state and so on until the innermost nested
	 * state is reached.
	 */
	DEEP
}
