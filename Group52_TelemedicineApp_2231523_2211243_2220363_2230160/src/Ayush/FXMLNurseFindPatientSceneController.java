/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Ayush;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author dasay
 */
public class FXMLNurseFindPatientSceneController implements Initializable {

    @FXML
    private AnchorPane findPatientAnchorPane;
    @FXML
    private TableView<DummyTableFindPatientClass> findPatientTableView;
    @FXML
    private TableColumn<DummyTableFindPatientClass, String> nameTableColumn;
    @FXML
    private TableColumn<DummyTableFindPatientClass, String> idTableColumn;
    @FXML
    private TableColumn<DummyTableFindPatientClass, String> genderTableColumn;
    @FXML
    private TableColumn<DummyTableFindPatientClass, String> healthIssueTableColumn;
    @FXML
    private TableColumn<DummyTableFindPatientClass, String> dobTableColumn;
    @FXML
    private TableColumn<DummyTableFindPatientClass, String> emailTableColumn;

    /**
     * Initializes the controller class.
     */
    ArrayList<DummyTableFindPatientClass> tableList;
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        tableList = new ArrayList<DummyTableFindPatientClass>();
        
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<DummyTableFindPatientClass, String>("name"));
        idTableColumn.setCellValueFactory(new PropertyValueFactory<DummyTableFindPatientClass, String>("id"));
        genderTableColumn.setCellValueFactory(new PropertyValueFactory<DummyTableFindPatientClass, String>("gender"));
        healthIssueTableColumn.setCellValueFactory(new PropertyValueFactory<DummyTableFindPatientClass, String>("health"));
        dobTableColumn.setCellValueFactory(new PropertyValueFactory<DummyTableFindPatientClass, String>("dob"));
        emailTableColumn.setCellValueFactory(new PropertyValueFactory<DummyTableFindPatientClass, String>("email"));
        
        
        File file = new File("FindPatientText.txt");
        Scanner sc; String str=null;
        try {
            sc = new Scanner(file);
           
            while(sc.hasNextLine()){
                str=sc.nextLine();
                String[] tokens;
                tokens = str.split(",");
                
                
                tableList.add(new DummyTableFindPatientClass(
                        tokens[0],
                        tokens[1],
                        tokens[2],
                        tokens[3],
                        tokens[4],
                        tokens[5]
                ));
                
                for (DummyTableFindPatientClass i: tableList){
                        findPatientTableView.getItems().add(i);
                
                }
                
                tableList.clear();
                
                
                            
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FXMLNurseFindPatientSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
        
        
        
    }    

    @FXML
    private void addToAssignedPatientOnAction(ActionEvent event) {
        
        DummyTableFindPatientClass selectedPerson = (findPatientTableView.getSelectionModel().getSelectedItem());
        
        
        
        
        
            FileWriter fw=null;
            try {
                //write code to dump studArr in Stud.txt
                //use FileWriter
                File f = new File("AssignedPatientsText.txt");
                 
                //FileWriter fw = new FileWriter(f);
                if(f.exists())
                    //fw = new FileWriter("studText.txt",true);
                    fw = new FileWriter(f,true);
                else 
                    //fw = new FileWriter(f);
                    fw = new FileWriter("AssignedPatientsText.txt"); 
                
                String str = selectedPerson.getName()+","+
                             selectedPerson.getId()+","+
                             selectedPerson.getGender()+","+
                             selectedPerson.getHealth()+","+
                             selectedPerson.getDob()+","+
                             selectedPerson.getEmail()+"\n";

                fw.write(str);  //fw.write(s.toString());
                fw.close();
            } catch (IOException ex) {
                //fw.close();
                //SHOW ex.toString() IN AN ALERT
            }
            
            
        Alert a = new Alert(AlertType.INFORMATION);
        a.setContentText("Patient assigned successfully!");
        a.showAndWait();
        return;    
            
            
        
        
        
        
    }
    
}
