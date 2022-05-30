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
public class BookReturn extends Book {
    String date;
    String userID;
    String status;
    
    public BookReturn(){
        super();
        date = "";
        userID = "";
        status = "Normal";
    }
    
    public BookReturn(long bid, String d, String uid){
        super(bid);
        date = d;
        userID = uid;
        status = "Normal";
    }
    
    public BookReturn(long bid, String d, String uid, String s){
        super(bid);
        date = d;
        userID = uid;
        status = s;
    }
    
    public String getDate(){
        return date;
    }
    
    public String getUserID(){
        return userID;
    }
    
    public String getStatus(){
        return status;
    }
    
    public void setDate(String d){
        date = d;
    }
    
    public void setUserID(String uid){
        userID = uid;
    }
    
    public void setStatus(String s){
        status = s;
    }
    
    public String toString(){
        return date + "/" + super.getID() + "/" + userID + "/" + status;
    }
}
