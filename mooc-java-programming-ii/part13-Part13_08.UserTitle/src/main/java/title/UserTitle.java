package title;

import javafx.application.Application;
import javafx.stage.Stage;

public class UserTitle extends Application {

    @Override
    public void start(Stage window) {
        Parameters param = getParameters();
        String titles = param.getNamed().get("titles");

        window.setTitle(titles);
        window.show();
    }
}
