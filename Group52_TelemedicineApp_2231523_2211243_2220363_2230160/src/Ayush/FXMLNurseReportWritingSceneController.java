/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Ayush;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author dasay
 */
public class FXMLNurseReportWritingSceneController implements Initializable {

    @FXML
    private Label nameLable;
    @FXML
    private TextArea reportTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void sendReportOnAction(ActionEvent event) {
        
            FileWriter fw=null;
            try {
                //write code to dump studArr in Stud.txt
                //use FileWriter
                File f = new File("PatientReportFromNurseText.txt");
                 
                //FileWriter fw = new FileWriter(f);
                if(f.exists())
                    //fw = new FileWriter("studText.txt",true);
                    fw = new FileWriter(f,true);
                else 
                    //fw = new FileWriter(f);
                    fw = new FileWriter("PatientReportFromNurseText.txt"); 
                
                String str = reportTextArea.getText()+"\n"+
                        "--------------------------------------nextReport--------------------------------------"+"\n";
                
//                String str="";
//                for(Student s: studArr){
//                    str += s.getId()+","+s.getName()+","+s.getCgpa()+"\n";
//                    //str += s; 
//                    //if toString is overridden to return
//                    //return id+","+name+","+cgpa+"\n"
//                }
                fw.write(str);  //fw.write(s.toString());
                fw.close();
            } catch (IOException ex) {
                //fw.close();
                //SHOW ex.toString() IN AN ALERT
            }
        
        
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    
        // Close the present scene
        currentStage.close();
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

    void initData(DummyTableFindPatientClass selectedItem) {
        nameLable.setText(selectedItem.getName());
        
        String str = "Name ="+selectedItem.getName()+","+"\n"+
                "ID ="+selectedItem.getId()+","+"\n"+
                "Gender ="+selectedItem.getGender()+","+"\n"+
                "Date of Birth ="+selectedItem.getDob()+","+"\n"+
                "Email ="+selectedItem.getEmail()+","+"\n"+
                "Health Issue ="+selectedItem.getHealth()+"\n"+
                "------------------------------------------------------------------\n";
        
        
        
        
        
        
        reportTextArea.setText(str);
        
        
        
        
        
    }
    
}
