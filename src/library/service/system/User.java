/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.service.system;

/**
 *
 * @author Acer
 */
public abstract class User {
    private String ID;
    private String password;
    
    public User(){
        ID = "";
        password = "";
    }
    
    public User(String ID){
        this.ID = ID;
        password = "";
    }
    
    public User(String ID, String pw){
        this.ID = ID;
        password = pw;
    }
    
    public String getID(){
        return ID;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setID(String ID){
        this.ID = ID;
    }
    
    public void setPassword(String pw){
        password = pw;
    }
    
    public String toString(){
        return ID + "/" + password;
    }
}
