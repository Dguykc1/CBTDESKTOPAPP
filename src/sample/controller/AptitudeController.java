package sample.controller;

import javafx.animation.TranslateTransition;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class AptitudeController implements Initializable {
    @FXML
    Label titleOfWelcomePage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        titleOfWelcomePage.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {

            }
        });
    }
}
