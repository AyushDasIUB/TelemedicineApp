/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Ayush;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author dasay
 */
public class FXMLNurseAndPatientCommunicationSceneController implements Initializable {

    @FXML
    private TextArea chatBoxTextArea;
    @FXML
    private TextArea nursemessageTextArea;
    @FXML
    private TextField patientNameTextField;

    /**
     * Initializes the controller class.
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        String fileName = patientNameTextField.getText();
        
        //File Creating code
            FileWriter fw=null;
            try {
                
                File f = new File("CommunicationWithNurseAnd"+fileName+"Text.txt");
                 
                
                if(f.exists())
                    
                    fw = new FileWriter(f,true);
                else 
                    
                    fw = new FileWriter("CommunicationWithNurseAnd"+fileName+"Text.txt"); 
                //String str=nursemessageTextArea.getText();
                //for(Student s: studArr){
                    //str += s.getId()+","+s.getName()+","+s.getCgpa()+"\n";
                    //str += s; 
                    //if toString is overridden to return
                    //return id+","+name+","+cgpa+"\n"
                //}
                //fw.write(str +"\n");  //fw.write(s.toString());
                fw.close();
            } catch (IOException ex) {
                //fw.close();
                //SHOW ex.toString() IN AN ALERT
            }
        
        
        
        //File Reading
        File file = new File("CommunicationWithNurseAnd"+fileName+"Text.txt");
        Scanner sc; String str=null;
        try {
            sc = new Scanner(file);
            chatBoxTextArea.setText(null);
            while(sc.hasNextLine()){
                str=sc.nextLine();
//                String[] tokens;
//                tokens = str.split(",");
//                str = "Id="+tokens[0]+", Name="+tokens[1]
//                        +", Cgpa="+tokens[2];
                chatBoxTextArea.appendText(str+"\n");
                //outputTxtArea.appendText("\n");               
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FXMLNurseAndPatientCommunicationSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } 
 
        
        
        
        
        
        
        
        
    }    

    @FXML
    private void sendButtonOnAction(ActionEvent event) {
        String nursemass = nursemessageTextArea.getText();
        String fileName = patientNameTextField.getText();
        
            FileWriter fw=null;
            try {
                //write code to dump studArr in Stud.txt
                //use FileWriter
                File f = new File("CommunicationWithNurseAnd"+fileName+"Text.txt");
                 
                //FileWriter fw = new FileWriter(f);
                if(f.exists())
                    //fw = new FileWriter("studText.txt",true);
                    fw = new FileWriter(f,true);
                else 
                    //fw = new FileWriter(f);
                    fw = new FileWriter("CommunicationWithNurseAnd"+fileName+"Text.txt"); 
                String str="Nurse: "+nursemass+"\n";
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
        
        File file = new File("CommunicationWithNurseAnd"+fileName+"Text.txt");
        Scanner sc; String str=null;
        try {
            sc = new Scanner(file);
            chatBoxTextArea.setText(null);
            while(sc.hasNextLine()){
                str=sc.nextLine();
//                String[] tokens;
//                tokens = str.split(",");
//                str = "Id="+tokens[0]+", Name="+tokens[1]
//                        +", Cgpa="+tokens[2];
                chatBoxTextArea.appendText(str+"\n");
                //outputTxtArea.appendText("\n");               
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FXMLNurseAndPatientCommunicationSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }

    @FXML
    private void refreshButtonOnAction(ActionEvent event) {
        String fileName = patientNameTextField.getText();
        File file = new File("CommunicationWithNurseAnd"+fileName+"Text.txt");
        Scanner sc; String str=null;
        try {
            sc = new Scanner(file);
            chatBoxTextArea.setText(null);
            while(sc.hasNextLine()){
                str=sc.nextLine();
//                String[] tokens;
//                tokens = str.split(",");
//                str = "Id="+tokens[0]+", Name="+tokens[1]
//                        +", Cgpa="+tokens[2];
                chatBoxTextArea.appendText(str+"\n");
                //outputTxtArea.appendText("\n");               
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FXMLNurseAndPatientCommunicationSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
    }

    void initData(DummyTableFindPatientClass selectedItem) {
        patientNameTextField.setText(selectedItem.getName());
    }
    
}
