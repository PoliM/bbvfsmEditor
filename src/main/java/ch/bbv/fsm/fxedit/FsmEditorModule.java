package ch.bbv.fsm.fxedit;

import ch.bbv.fsm.fxedit.fxutils.FxLoaderHelper;

import com.google.common.eventbus.EventBus;
import com.google.inject.AbstractModule;

public class FsmEditorModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(EventBus.class).asEagerSingleton();
		bind(FxLoaderHelper.class);
	}
}
