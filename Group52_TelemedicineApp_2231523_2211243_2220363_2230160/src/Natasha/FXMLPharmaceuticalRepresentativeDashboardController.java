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
public class FXMLPharmaceuticalRepresentativeDashboardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void profileButton(ActionEvent event) throws IOException {
        Parent fileChooserView = FXMLLoader.load(getClass().getResource("FXMLPharmaceuticalRepresentativeManageProfile.fxml"));
        
        Scene fileChooserView2 = new Scene(fileChooserView);
        
        Stage newWindow = new Stage();
        
        newWindow.setScene(fileChooserView2);
        newWindow.show();
    }

    @FXML
    private void timeScheduleButton(ActionEvent event) throws IOException {
        Parent fileChooserView = FXMLLoader.load(getClass().getResource("FXMLPharmaceuticalRepresentativeTimeSchedule.fxml"));
        
        Scene fileChooserView2 = new Scene(fileChooserView);
        
        Stage newWindow = new Stage();
        
        newWindow.setScene(fileChooserView2);
        newWindow.show();
    }

    @FXML
    private void checkOrderButton(ActionEvent event) throws IOException {
        Parent fileChooserView = FXMLLoader.load(getClass().getResource("FXMLPharmaceuticalRepresentativeCheckOrderList.fxml"));
        
        Scene fileChooserView2 = new Scene(fileChooserView);
        
        Stage newWindow = new Stage();
        
        newWindow.setScene(fileChooserView2);
        newWindow.show();
    }

    @FXML
    private void checkStockButton(ActionEvent event) throws IOException {
        Parent fileChooserView = FXMLLoader.load(getClass().getResource("FXMLPharmaceuticalRepresentativeCheckStockInList.fxml"));
        
        Scene fileChooserView2 = new Scene(fileChooserView);
        
        Stage newWindow = new Stage();
        
        newWindow.setScene(fileChooserView2);
        newWindow.show();
    }

    @FXML
    private void addMedicineInStockButton(ActionEvent event) throws IOException {
        Parent fileChooserView = FXMLLoader.load(getClass().getResource("FXMLPharmaceuticalRepresentativeAddMedicineInStock.fxml"));
        
        Scene fileChooserView2 = new Scene(fileChooserView);
        
        Stage newWindow = new Stage();
        
        newWindow.setScene(fileChooserView2);
        newWindow.show();
    }

    @FXML
    private void checkExpiryDateButton(ActionEvent event) throws IOException {
        Parent fileChooserView = FXMLLoader.load(getClass().getResource("FXMLPharmaceuticalRepresentativeCheckExpiryDateMedicineInStock.fxml"));
        
        Scene fileChooserView2 = new Scene(fileChooserView);
        
        Stage newWindow = new Stage();
        
        newWindow.setScene(fileChooserView2);
        newWindow.show();
    }

    @FXML
    private void paymentProcessButton(ActionEvent event) throws IOException {
        Parent fileChooserView = FXMLLoader.load(getClass().getResource("FXMLPharmaceuticalRepresentativePaymentProcess.fxml"));
        
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
