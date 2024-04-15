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
public class FXMLDeliveryGuyNavigationController implements Initializable {

    @FXML
    private TableColumn<Navigation, String> customerNameTableColumn;
    @FXML
    private TableColumn<Navigation, String> deliveryAddressTableColumn;
    @FXML
    private TableColumn<Navigation, String> distanceTableColumn;
    @FXML
    private TableColumn<Navigation, String> durationTableColumn;
    @FXML
    private TableView<Navigation> navigationTableView;

    /**
     * Initializes the controller class.
     */
    ArrayList<Navigation> list;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        list = new ArrayList<Navigation>();
        
        deliveryAddressTableColumn.setCellValueFactory(new PropertyValueFactory<Navigation, String>("add"));
        customerNameTableColumn.setCellValueFactory(new PropertyValueFactory<Navigation, String>("name"));
        distanceTableColumn.setCellValueFactory(new PropertyValueFactory<Navigation, String>("dis"));
        durationTableColumn.setCellValueFactory(new PropertyValueFactory<Navigation, String>("due"));
    }    

    @FXML
    private void navigationButton(ActionEvent event) {
        
        list.add(new Navigation(
                "korim",
                "badda",
                "110m",
                "10min"
        
        
        ));
        
        list.add(new Navigation(
                "rahim",
                "norda",
                "50m",
                "5min"
        
        
        ));
        
        for (Navigation i: list){
            navigationTableView.getItems().add(i);
        }
        
        
        
        
        
        
        
        
        
        
    }
    
}
