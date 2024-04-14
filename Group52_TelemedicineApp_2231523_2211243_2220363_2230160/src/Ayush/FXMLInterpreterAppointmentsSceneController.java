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
public class FXMLInterpreterAppointmentsSceneController implements Initializable {

    @FXML
    private TableView<DummyTableAppointments> appointmentTableView;
    @FXML
    private TableColumn<DummyTableAppointments, String> nameTableColumn;
    @FXML
    private TableColumn<DummyTableAppointments, String> idTableColumn;
    @FXML
    private TableColumn<DummyTableAppointments, String> categoryTableColumn;
    @FXML
    private TableColumn<DummyTableAppointments, String> dateTableColumn;
    @FXML
    private TableColumn<DummyTableAppointments, String> emailTableColumn;

    /**
     * Initializes the controller class.
     */
    
    ArrayList<DummyTableAppointments> appointmentList;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        appointmentList = new ArrayList<DummyTableAppointments>();
        
        idTableColumn.setCellValueFactory(new PropertyValueFactory<DummyTableAppointments, String>("id"));
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<DummyTableAppointments, String>("name"));
        categoryTableColumn.setCellValueFactory(new PropertyValueFactory<DummyTableAppointments, String>("category"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<DummyTableAppointments, String>("date"));
        emailTableColumn.setCellValueFactory(new PropertyValueFactory<DummyTableAppointments, String>("email"));
        
        File file = new File("InterpreterAppointmentText.txt");
        Scanner sc; String str=null;
        try {
            sc = new Scanner(file);
            
            while(sc.hasNextLine()){
                str=sc.nextLine();
                String[] tokens;
                tokens = str.split(",");
                appointmentList.add(new DummyTableAppointments(
                        tokens[0],
                        tokens[1],
                        tokens[2],
                        tokens[3],
                        tokens[4]
                )); 
                
                
                for(DummyTableAppointments i: appointmentList){
                    appointmentTableView.getItems().add(i);
                }
                appointmentList.clear();
                
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FXMLInterpreterAppointmentsSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }    

    @FXML
    private void joinSessionButtonOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("FXMLInterpreterJoinSessionScene.fxml"));
        Parent personViewParent = loader.load();

        //Parent personViewParent = FXMLLoader.load(getClass().getResource("FXMLScene2.fxml"));
        Scene personViewScene = new Scene(personViewParent);
        
        //access the controller
        FXMLInterpreterJoinSessionSceneController controller = loader.getController();
        //PersonViewSceneController controller = new PersonViewSceneController();
        //Person rahim = new Person();
        //controller.initData(rahim);
        controller.initData(appointmentTableView.getSelectionModel().getSelectedItem());
                
        Stage window = new Stage();
        
        window.setScene(personViewScene);
        window.show();
        
        
        
    }

    @FXML
    private void messagingButtonOnAction(ActionEvent event) throws IOException {
        
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("FXMLInterpreterMessagingScene.fxml"));
        Parent personViewParent = loader.load();

        //Parent personViewParent = FXMLLoader.load(getClass().getResource("FXMLScene2.fxml"));
        Scene personViewScene = new Scene(personViewParent);
        
        //access the controller
        FXMLInterpreterMessagingSceneController controller = loader.getController();
        //PersonViewSceneController controller = new PersonViewSceneController();
        //Person rahim = new Person();
        //controller.initData(rahim);
        controller.initData(appointmentTableView.getSelectionModel().getSelectedItem());
                
        Stage window = new Stage();
        
        window.setScene(personViewScene);
        window.show();
        
        
        
        
    }
    
}
