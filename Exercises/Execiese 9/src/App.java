import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Locale;

/**
 * The main function, the entry point of the program, and the javaFX program need to
 * inherit from the Application class in order to run, and then implement the start function
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception { 
        // Set windows title
        stage.setTitle("Calculator");
        // Set language
        Locale.setDefault(Locale.US);
        // Load the required component information in the window
        Parent root = FXMLLoader.load(getClass().getResource("layout.fxml"));
        // Set Form Content
        stage.setScene(new Scene(root));
        // Display Form
        stage.show();
    }
}