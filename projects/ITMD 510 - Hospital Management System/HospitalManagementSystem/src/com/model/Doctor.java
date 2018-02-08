/* <h1>FileName: Doctor.java</h1>
 * @author	Phanindra Chandraprakash
 * @version	1.0
 * @date	12/02/2016
 * FinalProject: HospitalManagementSystem
 * Description: This java file contains getters and setters information of Doctor screen.
 */
package com.model;


import javafx.beans.property.SimpleStringProperty;

public class Doctor {
        private  SimpleStringProperty idProperty = new SimpleStringProperty();
        private  SimpleStringProperty departmentNameProperty = new SimpleStringProperty();
        private  SimpleStringProperty nameProperty = new SimpleStringProperty();
        private  SimpleStringProperty departmentProperty = new SimpleStringProperty();
        
        public void setIdProperty(String s){
            this.idProperty.setValue(s);
        }
        public void setNameProperty(String s){
            this.nameProperty.setValue(s);
        }
        public void setDepartmentProperty(String s){
            this.departmentProperty.setValue(s);
        }
        public String getIdProperty(){
            return idProperty.get();
        }
        public String getNameProperty() {
            return nameProperty.get();
        }
        public String getDepartmentProperty() {
            return departmentProperty.get();
        }
         public String getDepartmentNameProperty() {
            return departmentNameProperty.get();
        }
         public void setDepartmentNameProperty(String departmentname) {
             departmentNameProperty.set(departmentname);
        }
    }