/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Ayush;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author dasay
 */
public class FXMLLoginSceneController implements Initializable {

    @FXML
    private TextField idTextField;
    @FXML
    private PasswordField passwordTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loginButtonOnAction(ActionEvent event) throws IOException {
        
        File file = new File("registerText.txt");
        Scanner sc; String str=null;
        try {
            sc = new Scanner(file);
            boolean dataFound = false;
            while(sc.hasNextLine()){
                str=sc.nextLine();
                String[] tokens;
                tokens = str.split(",");

                if((idTextField.getText().equals(tokens[0]))&&(passwordTextField.getText().equals(tokens[1]))){
                    System.out.println("Hello "+tokens[2]+" "+tokens[3]);
                    dataFound = true;
                    if("Nurse".equals(tokens[2])){

                                    FXMLLoader loader = new FXMLLoader();
                                    loader.setLocation(getClass().getResource("FXMLNurseDashboardScene.fxml"));
                                    Parent personViewParent = loader.load();
                                    Scene personViewScene = new Scene(personViewParent);
                                    FXMLNurseDashboardSceneController controller = loader.getController();

                                      


                                    controller.initData(tokens[3]);

                                    Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

                                    window.setScene(personViewScene);
                                    window.show();
                                                
                            
                            
                            
                            
                            
                            
                    }
                    if("Interpreter".equals(tokens[2])){
                            Parent mainSceneParent = FXMLLoader.load(getClass().getResource("FXMLInterpreterMainScene.fxml"));
        
                            Scene scene = new Scene(mainSceneParent);

                            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                            window.setScene(scene);
                            window.show();                         
                    }
                    if("Delivery Guy".equals(tokens[2])){
                            Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/Natasha/FXMLDeliveryGuyDashBoard.fxml"));
        
                            Scene scene = new Scene(mainSceneParent);

                            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                            window.setScene(scene);
                            window.show();                         
                    }
                    if("Pharmaceutical Representative".equals(tokens[2])){
                            Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/Natasha/FXMLPharmaceuticalRepresentativeDashboard.fxml"));
        
                            Scene scene = new Scene(mainSceneParent);

                            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                            window.setScene(scene);
                            window.show();                         
                    }
                    
                    if("Patient".equals(tokens[2])){
                            Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/Siam/patientHomePage.fxml"));
        
                            Scene scene = new Scene(mainSceneParent);

                            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                            window.setScene(scene);
                            window.show();                         
                    }
                    
                    if("Doctor".equals(tokens[2])){
                            Parent mainSceneParent = FXMLLoader.load(getClass().getResource("/Siam/doctorHomePage.fxml"));
        
                            Scene scene = new Scene(mainSceneParent);

                            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
                            window.setScene(scene);
                            window.show();                         
                    }
                    
                
                }               

                
                
                
                
            }
            if(!dataFound){
                Alert a = new Alert(AlertType.INFORMATION);
                a.setContentText("Oops! User not found; need to SignUp.");
                a.showAndWait();
                return;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FXMLLoginSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } 

    }

    @FXML
    private void singupLableOnMouseClick(MouseEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("FXMLSingupScene.fxml"));
        
        Scene scene = new Scene(mainSceneParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

        }
