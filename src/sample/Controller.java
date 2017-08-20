package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Controller extends Application{
    @Override
    public void start(Stage primaryStage) throws Exception {

        Label label = new Label("siema");
        label.setFont(new Font(50));

        Scene scene = new Scene(label);
        primaryStage.setScene(scene);
        primaryStage.setTitle("first one");
        primaryStage.show();


    }
}
