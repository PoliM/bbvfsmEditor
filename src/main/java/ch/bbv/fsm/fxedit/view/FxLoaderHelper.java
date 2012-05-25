package ch.bbv.fsm.fxedit.view;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;

import javax.inject.Inject;

import com.google.inject.Injector;

public class FxLoaderHelper {

	private final Injector injector;

	@Inject
	public FxLoaderHelper(final Injector injector) {
		this.injector = injector;
	}

	public <N> N loadFXML(final URL url) throws IOException {
		final FXMLLoader loader = new FXMLLoader();
		loader.setLocation(url);
		loader.setBuilderFactory(new JavaFXBuilderFactory());
		final InputStream in = url.openStream();
		@SuppressWarnings("unchecked")
		final N value = (N) loader.load(in);
		in.close();

		if (loader.getController() != null) {
			injector.injectMembers(loader.getController());
		}

		return value;
	}

}
