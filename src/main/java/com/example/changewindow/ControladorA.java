package com.example.changewindow;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class ControladorA {

    @FXML
    private Label apellido;

    @FXML
    private Button btnCargar;

    @FXML
    private Label dni;

    @FXML
    private Label nombre;

    @FXML
    void menajarCarga(ActionEvent event) {
        try {
        Usuario usuario = new Usuario(nombre.getText(), apellido.getText(), dni.getText());
        Stage stage = new Stage();
        stage.setUserData(usuario);
        Parent root = FXMLLoader.load(getClass().getResource("escenaB.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();



        }catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}

