/* <h1>FileName: MainController.java</h1>
 * @author	Phanindra Chandraprakash
 * @version	1.0
 * @date	12/02/2016
 * FinalProject: HospitalManagementSystem
 * Description: This file controls the fields which are displayed after successful login depending on the roles. 
 */
package com.controller;

import com.model.Current_user_detail;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class MainController implements Initializable{
    private PreparedStatement ps;
    private Statement st = null;
    private ResultSet rs;
  
    @FXML
    private Tab docTab;
    @FXML
    private Tab patientTab;
    @FXML
    private Tab userTab;
    @FXML
    private Tab patientAppoinmentTab;
    @FXML
    private MenuBar menuBar;
    @FXML
    private Menu userMenu;
    @FXML
    private MenuItem changePassword;
    @FXML
    private TabPane tabPane;
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (Current_user_detail.current_user_role.equals("doctor")) {
            tabPane.getTabs().remove(8);
            tabPane.getTabs().remove(7);
            tabPane.getTabs().remove(6);
            tabPane.getTabs().remove(4);
            tabPane.getTabs().remove(3);
            tabPane.getTabs().remove(2);
            tabPane.getTabs().remove(0);
         }
        else if(Current_user_detail.current_user_role.equals("patient"))
        {
            tabPane.getTabs().remove(8);
            tabPane.getTabs().remove(6);
            tabPane.getTabs().remove(5);
            tabPane.getTabs().remove(4);
            tabPane.getTabs().remove(2);
            tabPane.getTabs().remove(1);
            tabPane.getTabs().remove(0);
        }
        else if(Current_user_detail.current_user_role.equals("admin"))
        {
            tabPane.getTabs().remove(7);
            tabPane.getTabs().remove(3);
        }
          
    }
}