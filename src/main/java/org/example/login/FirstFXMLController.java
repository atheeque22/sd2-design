package org.example.login;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;

public class FirstFXMLController {
    @FXML
    private Button getGoToSignupButton;

    @FXML
    public void onSignupButtonClick() {
        getGoToSignupButton.setOnAction(actionEvent -> {
            try {
                loadsignupFXML();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
    private void loadsignupFXML() throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("signup.fxml"));
        Parent root = loader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }
}
