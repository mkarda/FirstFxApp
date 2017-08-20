package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    @FXML
    private TextField userName;

    @FXML
    private PasswordField password;

    public void okAction(ActionEvent actionEvent) {
        System.out.println("ok clicked!!  " + userName.getText());

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void cancelAction(ActionEvent actionEvent) {
        System.out.println("CANCEL clicked!!  " + password.getText());
    }
}
