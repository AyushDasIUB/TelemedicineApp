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
public class FXMLPharmaceuticalRepresentativeTimeScheduleController implements Initializable {

    @FXML
    private TableColumn<FSchedule, String> dayTableColumn;
    @FXML
    private TableColumn<FSchedule, String> timeSlotTableColumn;
    @FXML
    private TableView<FSchedule> timeScheduleTable;

    /**
     * Initializes the controller class.
     */
    ArrayList<FSchedule> list;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        list = new ArrayList<FSchedule>();
        
        dayTableColumn.setCellValueFactory(new PropertyValueFactory<FSchedule,String>("day"));
        timeSlotTableColumn.setCellValueFactory(new PropertyValueFactory<FSchedule,String>("time"));
    }    

    @FXML
    private void loadScheduleButton(ActionEvent event) {
        
        list.add(new FSchedule(
                "10/7/2024",
                "1pm"
        
        
        ) );
        
        
        list.add(new FSchedule(
                "5/12/2024",
                "9pm"
        
        
        ) );
        
        list.add(new FSchedule(
                "09/3/2024",
                "10pm"
        
        
        ) );
        
        for (FSchedule i: list){
            timeScheduleTable.getItems().add(i);
        }
        
        
        
        
    }
    
}
