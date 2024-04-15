/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Ayush;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author dasay
 */
public class FXMLInterpreterSetAvailabilitySceneController implements Initializable {

    @FXML
    private TableView<Interpreter> interPreterTableView;
    @FXML
    private TableColumn<Interpreter, String> nameTableColumn;
    @FXML
    private TableColumn<Interpreter, String> idTableColumn;
    @FXML
    private TableColumn<Interpreter, String> genderTableColumn;
    @FXML
    private TableColumn<Interpreter, String> dobTableColumn;
    @FXML
    private TableColumn<Interpreter, String> emailTableColumn;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField idTextField;

    /**
     * Initializes the controller class.
     */
    ArrayList<Interpreter> interpreterActiveList;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        interpreterActiveList = new ArrayList<Interpreter>();
        
        idTableColumn.setCellValueFactory(new PropertyValueFactory<Interpreter,String>("id"));
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<Interpreter,String>("name"));
        dobTableColumn.setCellValueFactory(new PropertyValueFactory<Interpreter,String>("dob"));
        genderTableColumn.setCellValueFactory(new PropertyValueFactory<Interpreter,String>("gender"));
        emailTableColumn.setCellValueFactory(new PropertyValueFactory<Interpreter,String>("email"));
     

        
        
        
        
        
    }    

    @FXML
    private void joinButtonOnAction(ActionEvent event) throws FileNotFoundException {
        
        
        File file = new File("interpreterInfoText.txt");
        Scanner sc; String str=null;
        sc = new Scanner(file);
        while(sc.hasNextLine()){
            str=sc.nextLine();
            String[] tokens;
            tokens = str.split(",");
            if(nameTextField.getText().equals(tokens[2])&&idTextField.getText().equals(tokens[0])){
                interpreterActiveList.add(new Interpreter(
                        tokens[3],
                        tokens[4],
                        Integer.parseInt(tokens[6]),
                        tokens[5],
                        nameTextField.getText(),
                        Integer.parseInt(idTextField.getText()),
                        tokens[1],
                        "Pass"
                        
                ));
                
                
                for (Interpreter i: interpreterActiveList){
                       interPreterTableView.getItems().add(i);
                }
    
                
                
                
            }
            
            interpreterActiveList.clear();
            nameTextField.clear();
            idTextField.clear();
            //outputTxtArea.appendText("\n");
        } 
    }
    
}
