/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Ayush;

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
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author dasay
 */
public class FXMLInterpreterProfileSceneController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField idTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField genderTextField;
    @FXML
    private TextField phoneNumberTextField;
    @FXML
    private PasswordField passwordPasswordField;
    @FXML
    private DatePicker dobDatePicker;

    /**
     * Initializes the controller class.
     */
    
    ArrayList<Interpreter> interpreterList;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        interpreterList = new ArrayList<Interpreter>();
        
        
        
    }    

    @FXML
    private void saveButtonOnAction(ActionEvent event) {
        if(emailTextField.getText().isEmpty() || 
           genderTextField.getText().isEmpty() || 
           phoneNumberTextField.getText().isEmpty() || 
           dobDatePicker.getValue() == null || 
           nameTextField.getText().isEmpty() || 
           idTextField.getText().isEmpty() || 
           passwordPasswordField.getText().isEmpty()) {

           
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Some fields are empty. Please fill in all fields.");
            alert.showAndWait();
            return; 
        }
        else{

            interpreterList.add(
                    new Interpreter(
                            emailTextField.getText(),
                            genderTextField.getText(),
                            Integer.parseInt(phoneNumberTextField.getText()),
                            nameTextField.getText(),
                            Integer.parseInt(idTextField.getText()),
                            "Interpreter",
                            passwordPasswordField.getText()
                            
                    
                    
                    )

            );
            
        

            FileWriter fw=null;
            try {
                //write code to dump studArr in Stud.txt
                //use FileWriter
                File f = new File("interpreterInfoText.txt");
                 
                //FileWriter fw = new FileWriter(f);
                if(f.exists())
                    //fw = new FileWriter("studText.txt",true);
                    fw = new FileWriter(f,true);
                else 
                    //fw = new FileWriter(f);
                    fw = new FileWriter("interpreterInfoText.txt"); 
                String str="";
                for(Interpreter s: interpreterList){
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

            interpreterList.clear();
            nameTextField.clear();
            idTextField.clear();
            emailTextField.clear();
            genderTextField.clear();
            phoneNumberTextField.clear();
            passwordPasswordField.clear();
            
            Alert a = new Alert(Alert.AlertType.CONFIRMATION);
            a.setContentText("The request has been recorded.");
            a.showAndWait();
            return;
            
            
        }
        
    }
    
}
