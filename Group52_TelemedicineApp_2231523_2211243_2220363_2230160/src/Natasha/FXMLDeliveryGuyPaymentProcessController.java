/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Natasha;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author dasay
 */
public class FXMLDeliveryGuyPaymentProcessController implements Initializable {

    @FXML
    private TextField totalAmountTextField;
    @FXML
    private TextField selectPaymentMethodTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void creditCardRadioButton(ActionEvent event) {
    }

    @FXML
    private void debitCardRadioButton(ActionEvent event) {
    }

    @FXML
    private void PaypalRadioButton(ActionEvent event) {
    }

    @FXML
    private void cashRadioButton(ActionEvent event) {
    }

    @FXML
    private void makePaymentButton(ActionEvent event) {
    }
    
}
