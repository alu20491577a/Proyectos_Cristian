/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Cristian
 */
public class FXMLDocumentController implements Initializable {
    
    Float data = 0f;
    int operation = -1;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button three;

    @FXML
    private Button six;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button zero;

    @FXML
    private Button equal;

    @FXML
    private Button clear;

    @FXML
    private Button nine;

    @FXML
    private Button minus;

    @FXML
    private Button plus;

    @FXML
    private Button multi;

    @FXML
    private Button div;

    @FXML
    private TextField display;

    @FXML
    void handleButtonAction(ActionEvent event) {
    if(event.getSource()==one){
        display.setText(display.getText() + "1");}
    else if(event.getSource()==two){
        display.setText(display.getText() + "2");}
    else if(event.getSource()==three){
        display.setText(display.getText() + "3");}
    else if(event.getSource()==four){
        display.setText(display.getText() + "4");}
    else if(event.getSource()==five){
        display.setText(display.getText() + "5");}
    else if(event.getSource()==six){
        display.setText(display.getText() + "6");}
    else if(event.getSource()==seven){
        display.setText(display.getText() + "7");}
    else if(event.getSource()==eight){
        display.setText(display.getText() + "8");}
    else if(event.getSource()==nine){
        display.setText(display.getText() + "9");}
    else if(event.getSource()==zero){
        display.setText(display.getText() + "0");}
    else if(event.getSource()==clear){
        display.setText("");}
    else if(event.getSource()==plus){
        data = Float.parseFloat(display.getText());
        operation = 1;//Addition
        display.setText("");}
    else if(event.getSource()==minus){
        data = Float.parseFloat(display.getText());
        operation = 2;//Substraction
        display.setText("");}
    else if(event.getSource()==multi){
        data = Float.parseFloat(display.getText());
        operation = 3;//Multiplication
        display.setText("");}
    else if(event.getSource()==div){
        data = Float.parseFloat(display.getText());
        operation = 4;//Division
        display.setText("");}
    else if(event.getSource()==equal){
        Float secondOperand = Float.parseFloat(display.getText());        
        switch(operation){
            case 1:
                Float res = data + secondOperand;
                display.setText(String.valueOf(res));
                break;
            case 2:
                res = data - secondOperand;
                display.setText(String.valueOf(res));
                break;
            case 3:
                res = data * secondOperand;
                display.setText(String.valueOf(res));
                break;
            case 4:
                res = 0f;
                try{
                res = data / secondOperand;
                }catch(Exception e){display.setText("Error");}
                display.setText(String.valueOf(res));
                break;}}
    
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
