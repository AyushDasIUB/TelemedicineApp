/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Ayush;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class FXMLNurseSchedulesSceneController implements Initializable {

    @FXML
    private TableView<NurseSchedules> scheduleTableView;
    @FXML
    private TableColumn<NurseSchedules, String> nameTableColumn;
    @FXML
    private TableColumn<NurseSchedules, String> idTableColumn;
    @FXML
    private TableColumn<NurseSchedules, String> dateTableColumn;
    @FXML
    private TableColumn<NurseSchedules, String> timeTableColumn;
    @FXML
    private TableColumn<NurseSchedules, String> durationTableColumn;

    /**
     * Initializes the controller class.
     */
    ArrayList<NurseSchedules> nurseSch;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        nurseSch = new ArrayList<NurseSchedules>();
        
        idTableColumn.setCellValueFactory(new PropertyValueFactory<NurseSchedules, String>("id"));
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<NurseSchedules, String>("name"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<NurseSchedules, String>("date"));
        timeTableColumn.setCellValueFactory(new PropertyValueFactory<NurseSchedules, String>("time"));
        durationTableColumn.setCellValueFactory(new PropertyValueFactory<NurseSchedules, String>("duration"));
        
        
        File file = new File("NurseSchedulesText.txt");
        Scanner sc; String str=null;
        try {
            sc = new Scanner(file);
           
            while(sc.hasNextLine()){
                str=sc.nextLine();
                String[] tokens;
                tokens = str.split(",");
                
                nurseSch.add(new NurseSchedules( 
                        tokens[0],
                        tokens[1],
                        tokens[2],
                        tokens[3],
                        tokens[4]
                ));
                
                for (NurseSchedules i: nurseSch){
                        scheduleTableView.getItems().add(i);
                
                }
                
                nurseSch.clear();
              
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FXMLNurseSchedulesSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }         
        
        
        
        
        
        
        
        
    }    
    
}
