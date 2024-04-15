/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Natasha;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author dasay
 */
public class FXMLDeliveryGuyCheckOrderListController implements Initializable {

    @FXML
    private TableColumn<DeliveryGuyCheckOrder, String> orderIdTableColumn;
    @FXML
    private TableColumn<DeliveryGuyCheckOrder, String> customerNameTableColumn;
    @FXML
    private TableColumn<DeliveryGuyCheckOrder, String> deliveryAddressTableColumn;
    @FXML
    private TableView<DeliveryGuyCheckOrder> checkOrderList;

    /**
     * Initializes the controller class.
     */
    ArrayList <DeliveryGuyCheckOrder> studList;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        studList = new ArrayList <DeliveryGuyCheckOrder>();
        
        
        
        
        orderIdTableColumn.setCellValueFactory(new PropertyValueFactory<DeliveryGuyCheckOrder,String>("id"));
        customerNameTableColumn.setCellValueFactory(new PropertyValueFactory<DeliveryGuyCheckOrder,String>("name"));
        deliveryAddressTableColumn.setCellValueFactory(new PropertyValueFactory<DeliveryGuyCheckOrder,String>("address"));
        
        
        
       
        
        
        
        
        
        
        // TODO
    }    

    @FXML
    private void refreshButton(ActionEvent event) {
        
        
        
        
        studList.add(new DeliveryGuyCheckOrder(
                "1234",
                "monir",
                "bashundhora"
        
        ));
        
        studList.add(new DeliveryGuyCheckOrder(
                "346",
                "Rafid",
                "badda"
        
        ));
        
        studList.add(new DeliveryGuyCheckOrder(
                "658",
                "Uday",
                "norda"
        
        ));
        
        for (DeliveryGuyCheckOrder i: studList){
            checkOrderList.getItems().add(i);
        }
        
        
        
        
    }
    
}
