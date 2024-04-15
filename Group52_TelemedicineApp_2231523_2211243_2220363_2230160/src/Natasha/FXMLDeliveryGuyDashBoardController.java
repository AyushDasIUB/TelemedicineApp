/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Natasha;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author dasay
 */
public class FXMLDeliveryGuyDashBoardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void profileButton(ActionEvent event) {
    }

    @FXML
    private void timeScheduleButton(ActionEvent event) throws IOException {
        Parent fileChooserView = FXMLLoader.load(getClass().getResource("FXMLDeliveryGuyTimeSchedule.fxml"));
        
        Scene fileChooserView2 = new Scene(fileChooserView);
        
        Stage newWindow = new Stage();
        
        newWindow.setScene(fileChooserView2);
        newWindow.show();
    }

    @FXML
    private void checkOrderListButton(ActionEvent event) throws IOException {
        Parent fileChooserView = FXMLLoader.load(getClass().getResource("FXMLDeliveryGuyCheckOrderList.fxml"));
        
        Scene fileChooserView2 = new Scene(fileChooserView);
        
        Stage newWindow = new Stage();
        
        newWindow.setScene(fileChooserView2);
        newWindow.show();
    }

    @FXML
    private void orderTrackingButton(ActionEvent event) throws IOException {
        Parent fileChooserView = FXMLLoader.load(getClass().getResource("FXMLDeliveryGuyOrderTracking.fxml"));
        
        Scene fileChooserView2 = new Scene(fileChooserView);
        
        Stage newWindow = new Stage();
        
        newWindow.setScene(fileChooserView2);
        newWindow.show();
    }

    @FXML
    private void navigationButton(ActionEvent event) throws IOException {
        Parent fileChooserView = FXMLLoader.load(getClass().getResource("FXMLDeliveryGuyNavigation.fxml"));
        
        Scene fileChooserView2 = new Scene(fileChooserView);
        
        Stage newWindow = new Stage();
        
        newWindow.setScene(fileChooserView2);
        newWindow.show();
    }

    @FXML
    private void paymentButton(ActionEvent event) throws IOException {
        Parent fileChooserView = FXMLLoader.load(getClass().getResource("FXMLDeliveryGuyPaymentProcess.fxml"));
        
        Scene fileChooserView2 = new Scene(fileChooserView);
        
        Stage newWindow = new Stage();
        
        newWindow.setScene(fileChooserView2);
        newWindow.show();
    }

    @FXML
    private void logOutButton(ActionEvent event) throws IOException {
        Parent fileChooserView = FXMLLoader.load(getClass().getResource("/Ayush/FXMLLoginScene.fxml"));
        
        Scene fileChooserView2 = new Scene(fileChooserView);
        
        Stage newWindow = new Stage();
        
        newWindow.setScene(fileChooserView2);
        newWindow.show();
    }
    
}
