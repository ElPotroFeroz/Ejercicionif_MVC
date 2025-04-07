/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package ejercicionif_mvc;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import java.util.regex.*;
/**
 * FXML Controller class
 *
 * @author elchu
 */
public class FXML_EjercicionifController implements Initializable {

    /**
     * Initializes the controller class.
     * Ejercicio – Validar letra NIF
        Aplicación gráfica que permita introducir un NIF (8 números y una letra) e indique si la
        letra de dicho NIF es válida.
     */
    
    @FXML
    private Label lbValidacion;
    @FXML
    private Button btnIntroducir;
    @FXML
    private TextField tfDni;
    
     // Expresión regular para DNI español
    String regex = "^[0-9]{8}[A-Z]$";
    Pattern pattern = Pattern.compile(regex);
    
    public boolean validardni(String dni) {
        Matcher matcher = pattern.matcher(dni);
        
        return matcher.matches();
    }
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        String dni = tfDni.getText();
        
        if(validardni(dni)) {
            lbValidacion.setText("DNI OKAY!");
        } else {
            lbValidacion.setText("DNI INAVLIDO!");
        }
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
