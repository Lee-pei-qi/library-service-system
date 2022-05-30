/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.service.system;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class Transaction extends BookBorrow {
    String status;
    
    public Transaction(){
        super();
        status = "";
    }
    
    public Transaction(long bid, String title, String date, String uid){
        super(bid, title, date, uid);
        status = "Borrowing";
    }
    
    public Transaction(long bid, String title, String date, String uid, String status){
        super(bid, title, date, uid);
        this.status = status;
    }
    
    public String toString(){
        return super.getID() + "/" + super.getTitle() + "/" + super.getBorrowerID() + "/" + super.getBorrowDate() + "/" + status;
    }
    
    //update status
    public String UpdateRow() throws FileNotFoundException{    
           File f = new File("Transaction.txt");
           Scanner sc = new Scanner(f);
           String line = "";
           StringBuilder sb = new StringBuilder();
           
           while(sc.hasNextLine()){
               line = sc.nextLine();
               String[] data = line.split("/");

               if (Long.parseLong(data[0]) == super.getID() && data[2].equals(super.getBorrowerID()) && data[3].equals(super.getBorrowDate())){
                   String row = data[0] + "/" + data[1] + "/" + data[2] + "/" + data[3] + "/" + status;
                   sb.append(row);
                   sb.append("\n");
               } else {
               sb.append(line);
               sb.append("\n");
               }
           }
           sc.close();
           return sb.toString();
    }
}
