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
        /*/* public class /*DeliveryInfo*/ */{*/
            /*public static void main(String[] args) {*/
        // Define the delivery information in a 2D array
        String[][] deliveryInfo = {
                {"Customer Name", "Delivery Address", "Distance", "Duration"},
                {"Alice", "Dhaka", "100km", "1 hour"},
                {"Bob", "Dhaka", "150km", "2 hours"}
        };

        // Print the delivery information in a table format
        for (int i = 0; i < deliveryInfo.length; i++) {
            for (int j = 0; j < deliveryInfo[i].length; j++) {
                System.out.printf("%-15s", deliveryInfo[i][j]); // Adjust the width as needed
            }
            System.out.println();
        }
    }
}

    }
    
}
