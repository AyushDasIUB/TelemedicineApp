/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Ayush;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author dasay
 */
public class FXMLInterpreterJoinSessionSceneController implements Initializable {

    @FXML
    private Label nameLable;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void endButtonOnAction(ActionEvent event) {
        
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    
        // Close the present scene
        currentStage.close();
        
        
    }

    void initData(DummyTableAppointments selectedItem) {
        nameLable.setText(selectedItem.getName());
    }
    
}
