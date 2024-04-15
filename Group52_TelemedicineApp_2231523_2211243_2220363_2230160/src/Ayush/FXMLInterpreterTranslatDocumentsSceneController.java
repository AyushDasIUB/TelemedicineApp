/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Ayush;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author dasay
 */
public class FXMLInterpreterTranslatDocumentsSceneController implements Initializable {

    @FXML
    private TableView<DummyTableTranslation> documentTableView;
    @FXML
    private TableColumn<DummyTableTranslation, String> nameTableColumn;
    @FXML
    private TableColumn<DummyTableTranslation, String> idTableColumn;
    @FXML
    private TableColumn<DummyTableTranslation, String> categoryTableColumn;

    /**
     * Initializes the controller class.
     */
    ArrayList<DummyTableTranslation> list;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        list = new ArrayList<DummyTableTranslation>();
        
        
        idTableColumn.setCellValueFactory(new PropertyValueFactory<DummyTableTranslation,String>("id"));
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<DummyTableTranslation,String>("name"));
        categoryTableColumn.setCellValueFactory(new PropertyValueFactory<DummyTableTranslation,String>("category"));
        
        
        
        File file = new File("needtranslationText.txt");
        Scanner sc; String str=null;
        try {
            sc = new Scanner(file);
           
            while(sc.hasNextLine()){
                str=sc.nextLine();
                String[] tokens;
                tokens = str.split(",");
                list.add(new DummyTableTranslation(
                        tokens[0],
                        tokens[1],
                        tokens[2],
                        tokens[3]
                        
                
                ));
                
                for (DummyTableTranslation i: list){
                     documentTableView.getItems().add(i);
                  }
                list.clear();
                
                //outputTxtArea.appendText("\n");               
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FXMLInterpreterTranslatDocumentsSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
        
        
        
        
        
        
        
        
        
        
    }    

    @FXML
    private void goToTransLateButtonOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("FXMLInterpreterTranslatDocumentsSceneTwo.fxml"));
        Parent personViewParent = loader.load();

        //Parent personViewParent = FXMLLoader.load(getClass().getResource("FXMLScene2.fxml"));
        Scene personViewScene = new Scene(personViewParent);
        
        //access the controller
        FXMLInterpreterTranslatDocumentsSceneTwoController controller = loader.getController();
        //PersonViewSceneController controller = new PersonViewSceneController();
        //Person rahim = new Person();
        //controller.initData(rahim);
        controller.initData(documentTableView.getSelectionModel().getSelectedItem());
                
        Stage window = new Stage();
        
        window.setScene(personViewScene);
        window.show();
        
        
        
        
        
        
        
    }
    
}
