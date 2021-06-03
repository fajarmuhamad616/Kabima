package sample.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class SidebarController {
    @FXML
    private Button buttonTambahKedai;

    @FXML
    public void tambahKedaiClicked(ActionEvent actionEvent) throws IOException {
        Stage primaryStage = (Stage) buttonTambahKedai.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("../resources/view/tambahKedai.fxml"));
        primaryStage.getScene().setRoot(newRoot);
    }
}
