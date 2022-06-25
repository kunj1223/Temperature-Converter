import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage; 

public class App extends Application {  
    public void start(Stage primaryStage) throws IOException
    {
        Parent root = FXMLLoader.load(getClass().getResource("design.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Celcius to Farenheit converter ");    // Set the stage title
        primaryStage.setScene(scene);               // Place the scene in the stage
        primaryStage.show();                        // Display the stage
    }   
     public static void main(String[] args) {
            launch(args);
    }
}

