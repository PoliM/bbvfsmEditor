package ch.bbv.fsm.fxedit.fxutils;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.util.Callback;

import javax.inject.Inject;

import com.google.inject.Injector;

public class FxLoaderHelper {

	private final Injector injector;

	@Inject
	public FxLoaderHelper(final Injector injector) {
		this.injector = injector;
	}

	/**
	 * Loads and fxml view and injects members to its controller.
	 */
	public <N> N loadFXML(final URL url) throws IOException {
		final FXMLLoader loader = new FXMLLoader();
		loader.setLocation(url);
		loader.setBuilderFactory(new JavaFXBuilderFactory());
		loader.setControllerFactory(new Callback<Class<?>, Object>() {
			@Override
			public Object call(final Class<?> controllerClass) {
				return injector.getInstance(controllerClass);
			}
		});
		try (final InputStream in = url.openStream()) {
			@SuppressWarnings("unchecked")
			final N load = (N) loader.load(in);
			return load;
		} finally {
			// Nothing to do here
		}
	}

}
