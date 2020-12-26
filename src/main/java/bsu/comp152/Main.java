package bsu.comp152;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Parent root = null;
        var loc = getClass().getResource("Main.fxml");
        try {
            root = FXMLLoader.load(loc);
        }catch (IOException e) {
            System.out.println("Could not find FXML file!!!");
        }
        Scene windowContents = new Scene(root, 600, 400); // Sets scene
        primaryStage.setScene(windowContents); // Sets the scene in the window
        primaryStage.setTitle("Wally's Weather Report"); // Sets window title
        primaryStage.getIcons().add(new Image("file:.\\src\\main\\resources\\bsu\\comp152\\Images\\WeatherWalrus.png")); // Sets app icon
        primaryStage.setResizable(false); // Prevents resizing
        primaryStage.show(); // Displays window
    }
}