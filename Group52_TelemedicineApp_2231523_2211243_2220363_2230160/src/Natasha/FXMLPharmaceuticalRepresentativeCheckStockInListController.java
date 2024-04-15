/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Natasha;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
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
public class FXMLPharmaceuticalRepresentativeCheckStockInListController implements Initializable {

    @FXML
    private TableColumn<CheckStock, String> productNameTableColumn;
    @FXML
    private TableColumn<CheckStock, String> quantityTableColumn;
    @FXML
    private TableColumn<CheckStock, String> locationTableColumn;
    @FXML
    private TableView<CheckStock> stockTableView;

    /**
     * Initializes the controller class.
     */
    ArrayList<CheckStock> list;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        list = new ArrayList<CheckStock>();
        
        quantityTableColumn.setCellValueFactory(new PropertyValueFactory<CheckStock,String>("que"));
        productNameTableColumn.setCellValueFactory(new PropertyValueFactory<CheckStock,String>("name"));
        locationTableColumn.setCellValueFactory(new PropertyValueFactory<CheckStock,String>("loc"));
        
        
        list.add(new CheckStock(
                "napa",
                "100",
                "D"
        ));
        
        list.add(new CheckStock(
                "paracitamol",
                "200",
                "P"
        ));
        
        list.add(new CheckStock(
                "Deslor",
                "150",
                "D"
        ));
        
        for (CheckStock i: list){
            stockTableView.getItems().add(i);
        }
        
        
        
        
    }    
    
}
