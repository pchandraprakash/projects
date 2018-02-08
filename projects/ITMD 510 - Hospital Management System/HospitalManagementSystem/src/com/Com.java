/* <h1>FileName: Com.java</h1>
 * @author	Phanindra Chandraprakash
 * @version	1.0
 * @date	12/02/2016
 * FinalProject: HospitalManagementSystem
 * Description: This file starts the application by first creating tables in the data base.
 */
package com;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import com.model.DAOModel;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Com extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/com/view/Login.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    	//date and calendar objects are used to format the current date and time.
    	System.out.println("Project Title: Hospital Management System");
    	String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
    	System.out.println("Current Date: " + timeStamp + "\nProgrammer Name: Phanindra Chandraprakash\n");
    	
    	DAOModel dao = new DAOModel();
		try
		{
			dao.createTable();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
    	launch(args);
    }
}