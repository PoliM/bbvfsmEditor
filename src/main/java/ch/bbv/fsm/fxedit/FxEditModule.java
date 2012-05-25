package ch.bbv.fsm.fxedit;

import ch.bbv.fsm.fxedit.view.FxLoaderHelper;

import com.google.common.eventbus.EventBus;
import com.google.inject.AbstractModule;

public class FxEditModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(EventBus.class).asEagerSingleton();
		bind(FxLoaderHelper.class);
	}

}
