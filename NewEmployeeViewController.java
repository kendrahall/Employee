/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Kendra
 */
public class NewEmployeeViewController implements Initializable {
@FXML private TextField firstNameTF;
@FXML private TextField lastNameTF;
@FXML private TextField socialinTF;
@FXML private TextField hourlyRateTF;
@FXML private DatePicker dobpicker;
@FXML private Button createNewEmployeeButton;

@FXML private RadioButton hourlyRadioButton;
@FXML private RadioButton commissionedRadioButton;
@FXML private Label errorMessageLabel;
@FXML private Label payRateLabel;
/**
 * this will create a new hourly employee when the button is pushed
 */
public void createNewEmployeeButtonPush()
{
    if (this.hourlyRadioButton.isSelected())
    {
    try {
                     HourlyEmployee newEmployee = new HourlyEmployee(firstNameTF.getText(),
                                                                                            lastNameTF.getText(),
                                                                                            socialinTF.getText(),
                                                                                            dobpicker.getValue(),
                                                                                           Double.parseDouble(hourlyRateTF.getText()));
                     System.out.printf("The new employee is %s%n", newEmployee);
         }
    catch(IllegalArgumentException e)
    {
                    this.errorMessageLabel.setText(e.getMessage());
    }
}
}



    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       ToggleGroup employeeTypeGroup = new ToggleGroup();
       this.hourlyRadioButton.setToggleGroup(employeeTypeGroup);
       this.commissionedRadioButton.setToggleGroup(employeeTypeGroup);
       this.errorMessageLabel.setVisible(false); //Makes invisible
       this.hourlyRadioButton.setSelected(true); // makes it auto selected
       
       employeeTypeGroup.selectedToggleProperty().addListener(new ChangeListener<Toggle>()
       {
           @Override
           public void changed(ObservableValue<? extends Toggle> observable,
                                            Toggle oldValue, Toggle newValue)
           {
               if (employeeTypeGroup.getSelectedToggle() != null)
               {
                   //configure the view for hourly employee
                   if (hourlyRadioButton.isSelected())
                   {
                       payRateLabel.setText("Hourly Rate");
                       hourlyRateTF.setPromptText("Hourly Rate");
                   }
                   else if (commissionedRadioButton.isSelected())
                   {
                      payRateLabel.setText("Commissioned Rate");
                       hourlyRateTF.setPromptText("Commissioned Rate");
                   } 
               
               }
               if (this.commissionedRadioButton.isSelected())
    {
    try {
                     CommissionedEmployee newEmployee = new CommissionedEmployee(firstNameTF.getText(),
                                                                                            lastNameTF.getText(),
                                                                                            socialinTF.getText(),
                                                                                            dobpicker.getValue(),
                                                                                           Double.parseDouble(hourlyRateTF.getText()));
                     System.out.printf("The new employee is %s%n", newEmployee);
         }
    catch(IllegalArgumentException e)
    {
                    this.errorMessageLabel.setText(e.getMessage());
    }
           }
      
