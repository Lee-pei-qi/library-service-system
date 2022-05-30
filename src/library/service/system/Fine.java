/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.service.system;

import java.io.*;

/**
 *
 * @author Acer
 */
public class Fine {
    private long BookID;
    private String UserID;
    private String date;
    private double amount;
    private String path;
    
    public Fine(){
        BookID = 0;
        UserID = "";
        date = "";
        amount = 0.0;
        path = "Fine.txt";
    }
    
    public Fine(long bid, String uid, String d, double a){
        BookID = bid;
        UserID = uid;
        date = d;
        amount = a;
        path = "Fine.txt";
    }
    
    public long getBookID(){
        return BookID;
    }
    
    public String getUserID(){
        return UserID;
    }
    
    public String getDate(){
        return date;
    }
    
    public double getAmount(){
        return amount;
    }
    
    public String getPath(){
        return path;
    }
    
    public void setBookID(long bid){
        BookID = bid;
    }
    
    public void setUserID(String uid){
        UserID = uid;
    }
    
    public void setDate(String d){
         date = d;
    }
    
    public void setAmount(double a){
        amount = a;
    }
    
    public String toString(){
        return BookID + "/" + date + "/" + UserID + "/" + amount;
    }
    
    public void updateFine(String textline) throws IOException{
        FileWriter write = new FileWriter(path, true); //FileWriter - opening the correct file, and storing the text as bytes
        PrintWriter print = new PrintWriter(write); //convert plain text to bytes
        
        print.println(textline);
        print.close();
    }
    
}
