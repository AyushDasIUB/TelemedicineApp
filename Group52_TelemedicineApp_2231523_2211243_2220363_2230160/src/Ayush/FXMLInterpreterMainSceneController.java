/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Ayush;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author dasay
 */
public class FXMLInterpreterMainSceneController implements Initializable {

    @FXML
    private BorderPane mainSceneBorderPane;
    @FXML
    private AnchorPane welcomeSceneAnchorPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
         mainSceneBorderPane.setCenter(welcomeSceneAnchorPane);
    }    

    @FXML
    private void profileButtonOnAction(ActionEvent event) {
        loadPage("FXMLInterpreterProfileScene");
    }

    @FXML
    private void setAvailabilityOnAction(ActionEvent event) {
        loadPage("FXMLInterpreterSetAvailabilityScene");
    }

    @FXML
    private void viewAppointmentOnAction(ActionEvent event) {
        loadPage("FXMLInterpreterAppointmentsScene");
    }

    @FXML
    private void translateDocumentsOnAction(ActionEvent event) {
        loadPage("FXMLInterpreterTranslatDocumentsScene");
    }

    @FXML
    private void languageLibraryOnAction(ActionEvent event) {
        loadPage("FXMLLanguageLibraryScene");
    }

    @FXML
    private void exitOnAction(ActionEvent event) throws IOException {
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    
        // Close the present scene
        currentStage.close();

        
        Parent fileChooserView = FXMLLoader.load(getClass().getResource("FXMLLoginScene.fxml"));
        
        Scene fileChooserView2 = new Scene(fileChooserView);
        
        Stage newWindow = new Stage();
        
        newWindow.setScene(fileChooserView2);
        newWindow.show();
    }
    
    private void loadPage(String page){
        Parent root = null;
        try{
          root = FXMLLoader.load(getClass().getResource(page+".fxml"));
        }catch(IOException ex){
              Logger.getLogger(FXMLInterpreterMainSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
        mainSceneBorderPane.setCenter(root);      
    }
    
}
