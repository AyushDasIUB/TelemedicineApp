/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Ayush;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author dasay
 */
public class FXMLNursePatientHistorySceneController implements Initializable {

    @FXML
    private Label nameLabel;
    @FXML
    private Label idLabel;
    @FXML
    private Label genderLabel;
    @FXML
    private Label dobLabel;
    @FXML
    private Label emailLabel;
    @FXML
    private Label healthLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    

    void initData(DummyTableFindPatientClass selectedItem) {
        
        nameLabel.setText(selectedItem.getName());
        idLabel.setText(selectedItem.getId());
        genderLabel.setText(selectedItem.getGender());
        dobLabel.setText(selectedItem.getDob());
        emailLabel.setText(selectedItem.getEmail());
        healthLabel.setText(selectedItem.getHealth());
        
        
        
        
    }
    


    @FXML
    private void goBackButtonOnAction(ActionEvent event) throws IOException {
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    
        // Close the present scene
        currentStage.close();
            
    }
    
}
