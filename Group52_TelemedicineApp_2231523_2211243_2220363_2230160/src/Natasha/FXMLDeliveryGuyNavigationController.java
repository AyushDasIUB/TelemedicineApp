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
import javafx.scene.control.TableColumn;

/**
 * FXML Controller class
 *
 * @author dasay
 */
public class FXMLDeliveryGuyNavigationController implements Initializable {

    @FXML
    private TableColumn<?, ?> customerNameTableColumn;
    @FXML
    private TableColumn<?, ?> deliveryAddressTableColumn;
    @FXML
    private TableColumn<?, ?> distanceTableColumn;
    @FXML
    private TableColumn<?, ?> durationTableColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void navigationButton(ActionEvent event) {
    }
    
}
