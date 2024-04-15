/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Siam;

import Ayush.Interpreter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author moham
 */
public class PManageProfileController implements Initializable {

    @FXML
    private TextField EmailTextField;
    @FXML
    private TextField PhoneTextField;
    @FXML
    private TextField IdTextField;
    @FXML
    private TextField NameTextField;
    @FXML
    private PasswordField PassworldTextField;
    @FXML
    private DatePicker DobPicker;
    @FXML
    private TextField genderTextField;
    /**
     * Initializes the controller class.
     */
    ArrayList<Patient> patientList;
    
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        patientList = new ArrayList<Patient>();
    }    

    @FXML
    private void saveButtonOnAction(ActionEvent event) {
        if(EmailTextField.getText().isEmpty() || 
           genderTextField.getText().isEmpty() || 
           PhoneTextField.getText().isEmpty() || 
           DobPicker.getValue() == null || 
           NameTextField.getText().isEmpty() || 
           IdTextField.getText().isEmpty() || 
           PassworldTextField.getText().isEmpty()) {

           
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Some fields are empty. Please fill in all fields.");
            alert.showAndWait();
            return; 
        }
        else{

            patientList.add(
                    new Patient(
                            EmailTextField.getText(),
                            genderTextField.getText(),                   
                            Integer.parseInt(PhoneTextField.getText()),
                            DobPicker.getValue().format(DateTimeFormatter.ISO_DATE),
                            NameTextField.getText(),
                            Integer.parseInt(IdTextField.getText()),
                            "Patient",
                            PassworldTextField.getText()
                            
                    
                    
                    )

            );
            
        

            FileWriter fw=null;
            try {
                //write code to dump studArr in Stud.txt
                //use FileWriter
                File f = new File("FindPatientText.txt");
                 
                //FileWriter fw = new FileWriter(f);
                if(f.exists())
                    //fw = new FileWriter("studText.txt",true);
                    fw = new FileWriter(f,true);
                else 
                    //fw = new FileWriter(f);
                    fw = new FileWriter("FindPatientText.txt"); 
                String str="";
                for(Patient s: patientList){
                    str += s.getId()+","+s.getCategory()+","+s.getName()+","+s.getEmail()+","+s.getGender()+","+s.getDob()+","+s.getPhoneNumber()+"\n";
                    //str += s; 
                    //if toString is overridden to return
                    //return id+","+name+","+cgpa+"\n"
                }
                fw.write(str);  //fw.write(s.toString());
                fw.close();
            } catch (IOException ex) {
                //fw.close();
                //SHOW ex.toString() IN AN ALERT
            }        

            patientList.clear();
            NameTextField.clear();
            IdTextField.clear();
            EmailTextField.clear();
            genderTextField.clear();
            PhoneTextField.clear();
            PassworldTextField.clear();
            
            Alert a = new Alert(Alert.AlertType.CONFIRMATION);
            a.setContentText("The request has been recorded.");
            a.showAndWait();
            return;
            
            
        }
        
           
        
        
    }
    
}
