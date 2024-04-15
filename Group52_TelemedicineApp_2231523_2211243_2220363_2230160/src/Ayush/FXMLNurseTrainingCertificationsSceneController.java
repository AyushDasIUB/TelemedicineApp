/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Ayush;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author dasay
 */
public class FXMLNurseTrainingCertificationsSceneController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField idTextField;
    @FXML
    private ComboBox<String> trainingProgramsComboBox;
    @FXML
    private PasswordField passwordTextField;

    /**
     * Initializes the controller class.
     */
    
    ArrayList<NurseTraining> trainingArr;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        trainingArr = new ArrayList<NurseTraining>();
        
        trainingProgramsComboBox.getItems().addAll(
            "Fundamentals of Nursing",
            "Anatomy and Physiology",
            "Pharmacology for Nurses",
            "Medical-Surgical Nursing",
            "Pediatric Nursing",
            "Maternity Nursing",
            "Mental Health Nursing",
            "Community Health Nursing",
            "Nursing Research and Evidence-Based Practice",
            "Nursing Leadership and Management",
            "Nursing Ethics and Professionalism",
            "Health Assessment",
            "Pathophysiology for Nurses",
            "Critical Care Nursing",
            "Geriatric Nursing",
            "Palliative Care Nursing",
            "Emergency Nursing",
            "Obstetric Nursing",
            "Neonatal Nursing",
            "Surgical Nursing"
        );        
        
        
        
        
        
        
    }    

    @FXML
    private void submitButtonOnAction(ActionEvent event) {
        trainingArr.add(
                new NurseTraining(
                        trainingProgramsComboBox.getValue(),
                        nameTextField.getText(),
                        Integer.parseInt(idTextField.getText()),
                        "Nurse",
                        passwordTextField.getText()

                )
        );
        
        
        
        
        
        
        
        
        
            FileWriter fw=null;
            try {
                File f = new File("nurseTrainingRequestFileText.txt");
                if(f.exists())
                    fw = new FileWriter(f,true);
                else 
                    fw = new FileWriter("nurseTrainingRequestFileText.txt"); 
                String str="";
                for(NurseTraining s: trainingArr){
                    str += s.getId()+","+s.getName()+","+s.getTraining()+"\n";
                }
                fw.write(str);  
                fw.close();
            } catch (IOException ex) {

            }       
        
            trainingArr.clear();
            nameTextField.clear();
            idTextField.clear();
            passwordTextField.clear();
            
            Alert a = new Alert(AlertType.CONFIRMATION);
            a.setContentText("The request has been recorded.");
            a.showAndWait();
            return;
            
            
            
        
    }


   
}
