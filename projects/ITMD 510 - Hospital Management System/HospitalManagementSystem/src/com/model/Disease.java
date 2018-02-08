/* <h1>FileName: Disease.java</h1>
 * @author	Phanindra Chandraprakash
 * @version	1.0
 * @date	12/02/2016
 * FinalProject: HospitalManagementSystem
 * Description: This java file contains getters and setters of Disease screen.
 */
package com.model;

import javafx.beans.property.SimpleStringProperty;

public class Disease 
{
    private  SimpleStringProperty diseaseidProperty = new SimpleStringProperty();
    private  SimpleStringProperty diseaseNameProperty = new SimpleStringProperty();

    public String getDiseaseidProperty() {
        return diseaseidProperty.get();
    }

    public void setDiseaseidProperty(String diseaseidProperty) {
        this.diseaseidProperty.set(diseaseidProperty);
    }

    public String getDiseaseNameProperty() {
        return diseaseNameProperty.get();
    }

    public void setDiseaseNameProperty(String diseaseNameProperty) {
        this.diseaseNameProperty.set(diseaseNameProperty);
    }
        
    
}
