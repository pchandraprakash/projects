/* <h1>FileName: User.java</h1>
 * @author	Phanindra Chandraprakash
 * @version	1.0
 * @date	12/02/2016
 * FinalProject: HospitalManagementSystem
 * Description: This java file contains getters and setters information of User Login screen.
 */
package com.model;

import javafx.beans.property.SimpleStringProperty;


public class User {
    private SimpleStringProperty userName = new SimpleStringProperty();
    private SimpleStringProperty password = new SimpleStringProperty();
    private SimpleStringProperty role = new SimpleStringProperty();
    private SimpleStringProperty userid = new SimpleStringProperty();

    public String getUsername() {
        return userName.get();
    }

    public void setUsername(String username) {
        this.userName.set(username);
    }

    public String getPassword() {
        return password.get();
    }

    public void setPassword(String password) {
        this.password.set(password);
    }
    public String getRole() {
        return role.get();
    }

    public void setRole(String level) {
        this.role.set(level);
    }
    public String getUserid() {
        return userid.get();
    }

    public void setUserid(String userid) {
        this.userid.setValue(userid);
    }
}
