package com.example.changewindow;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.Window;

public class ControladorB {

    @FXML
    private TextField fieldApellido;

    @FXML
    private TextField fieldDNI;

    @FXML
    private TextField fieldNombre;


    @FXML
    private void recieveData(MouseEvent event){
        Node node = (Node) event.getSource();
        Stage stage =(Stage) node.getScene().getWindow();
        Usuario usuario = (Usuario) stage.getUserData();
        System.out.println(usuario.toString());
        fieldNombre.setText(usuario.getNombre());
        fieldApellido.setText(usuario.getApellido());
        fieldDNI.setText(usuario.getDni());
    }


}
