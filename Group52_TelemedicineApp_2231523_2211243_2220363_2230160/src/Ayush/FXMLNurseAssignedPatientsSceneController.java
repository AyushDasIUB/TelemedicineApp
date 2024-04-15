/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Ayush;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author dasay
 */
public class FXMLNurseAssignedPatientsSceneController implements Initializable {

    @FXML
    private TableView<DummyTableFindPatientClass> assignedPatientTableView;
    @FXML
    private TableColumn<DummyTableFindPatientClass, String> nameTableColumn;
    @FXML
    private TableColumn<DummyTableFindPatientClass, String> idTableColumn;
    @FXML
    private TableColumn<DummyTableFindPatientClass, String> genderTableColumn;
    @FXML
    private TableColumn<DummyTableFindPatientClass, String> dobTableColumn;
    @FXML
    private TableColumn<DummyTableFindPatientClass, String> emailTableColumn;

    /**
     * Initializes the controller class.
     */
    ArrayList<DummyTableFindPatientClass> assignedPat; 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        assignedPat = new ArrayList<DummyTableFindPatientClass>();
        
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<DummyTableFindPatientClass, String>("name"));
        idTableColumn.setCellValueFactory(new PropertyValueFactory<DummyTableFindPatientClass, String>("id"));
        genderTableColumn.setCellValueFactory(new PropertyValueFactory<DummyTableFindPatientClass, String>("gender"));
        
        dobTableColumn.setCellValueFactory(new PropertyValueFactory<DummyTableFindPatientClass, String>("dob"));
        emailTableColumn.setCellValueFactory(new PropertyValueFactory<DummyTableFindPatientClass, String>("email"));
        
        
        
        File file = new File("AssignedPatientsText.txt");
        Scanner sc; String str=null;
        try {
            sc = new Scanner(file);
            
            while(sc.hasNextLine()){
                str=sc.nextLine();
                String[] tokens;
                tokens = str.split(",");
                
                assignedPat.add(
                        new DummyTableFindPatientClass(
                                tokens[0],
                                tokens[1],
                                tokens[2],
                                tokens[3],
                                tokens[4],
                                tokens[5]
                        ));
                
                for (DummyTableFindPatientClass i: assignedPat){
                   assignedPatientTableView.getItems().add(i);
                }
                
                assignedPat.clear();
            
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FXMLNurseAssignedPatientsSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
        
        
    }    

    @FXML
    private void contactPatientOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("FXMLNurseAndPatientCommunicationScene.fxml"));
        Parent personViewParent = loader.load();

        //Parent personViewParent = FXMLLoader.load(getClass().getResource("FXMLScene2.fxml"));
        Scene personViewScene = new Scene(personViewParent);
        
        //access the controller
        FXMLNurseAndPatientCommunicationSceneController controller = loader.getController();
        //PersonViewSceneController controller = new PersonViewSceneController();
        //Person rahim = new Person();
        //controller.initData(rahim);
        controller.initData(assignedPatientTableView.getSelectionModel().getSelectedItem());
                
        
        Stage window = new Stage();
        window.setScene(personViewScene);
        window.show();
        
        
        
        
        
    }

    @FXML
    private void patientHistoryOnAction(ActionEvent event) throws IOException {

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("FXMLNursePatientHistoryScene.fxml"));
        Parent personViewParent = loader.load();

        //Parent personViewParent = FXMLLoader.load(getClass().getResource("FXMLScene2.fxml"));
        Scene personViewScene = new Scene(personViewParent);
        
        //access the controller
        FXMLNursePatientHistorySceneController controller = loader.getController();
        //PersonViewSceneController controller = new PersonViewSceneController();
        //Person rahim = new Person();
        //controller.initData(rahim);
        controller.initData(assignedPatientTableView.getSelectionModel().getSelectedItem());
                
        Stage window = new Stage();
        window.setScene(personViewScene);
        window.show();
        
        
        
        
        
        
    }

    @FXML
    private void writeReportOnAction(ActionEvent event) throws IOException {
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("FXMLNurseReportWritingScene.fxml"));
        Parent personViewParent = loader.load();

        //Parent personViewParent = FXMLLoader.load(getClass().getResource("FXMLScene2.fxml"));
        Scene personViewScene = new Scene(personViewParent);
        
        //access the controller
        FXMLNurseReportWritingSceneController controller = loader.getController();
      
        controller.initData(assignedPatientTableView.getSelectionModel().getSelectedItem());
                
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage window = new Stage();
        
        window.setScene(personViewScene);
        window.show();
        
        
        
        
        
        
        
        
        
    }
    
}
