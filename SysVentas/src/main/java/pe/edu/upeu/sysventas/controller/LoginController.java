package pe.edu.upeu.sysventas.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
@FXML
    TextField txtUsuario;
@FXML
    PasswordField txtClave;
public void login(ActionEvent e){
    System.out.println(txtUsuario.getText());
}

}
