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
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author dasay
 */
public class FXMLInterpreterTranslatDocumentsSceneTwoController implements Initializable {

    @FXML
    private TextArea givenDocumentTextArea;
    @FXML
    private TextArea translateDocumentTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        
        
        
        
        
    }    

    @FXML
    private void sendButtonOnAction(ActionEvent event) {
        
        FileWriter fw=null;
            try {
                //write code to dump studArr in Stud.txt
                //use FileWriter
                File f = new File("TransLatedDocuments.txt");
                 
                //FileWriter fw = new FileWriter(f);
                if(f.exists())
                    //fw = new FileWriter("studText.txt",true);
                    fw = new FileWriter(f,true);
                else 
                    //fw = new FileWriter(f);
                    fw = new FileWriter("TransLatedDocuments.txt"); 
                String str=givenDocumentTextArea.getText()+"\n"+
                        "Translation is:\n"+translateDocumentTextArea.getText()+"\n"+
                        "-------------------------------next------------------------------------\n"
                        ;
                
                fw.write(str);  //fw.write(s.toString());
                fw.close();
            } catch (IOException ex) {
                //fw.close();
                //SHOW ex.toString() IN AN ALERT
            }
        
        Alert a = new Alert(AlertType.INFORMATION);
        a.setContentText("Translation has Send.");
        a.showAndWait();
        return;
        
            
       

        
        
        
        
        
    }

    void initData(DummyTableTranslation selectedItem) {
        
        String str = selectedItem.getName()+"\n"+
                    selectedItem.getId()+"\n"+
                    selectedItem.getCategory()+"\n"+
                "Translate This Document:"+"\n"+
                    selectedItem.getStr()
                
                    
                
                ;
        
        
        givenDocumentTextArea.setText(str);
        
        
        
        
        
    }
    
}
