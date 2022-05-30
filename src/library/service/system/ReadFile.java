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
public class ReadFile {
    private boolean flag;
    private String returnLine;
    private int borrowTimes;
    
    public ReadFile(){
        flag = false;
        returnLine = "";
        borrowTimes = 0;
    }
    
    // read using BookID 
    public boolean hasBook(String file, long id) throws FileNotFoundException{
           File f = new File(file);
           Scanner sc = new Scanner(f);
           String line;
           
           while(sc.hasNextLine()){
               line = sc.nextLine();
               String[] data = line.split("/");

               if (Long.parseLong(data[0]) == id){
                   flag = true;
                   returnLine = line;
               }    
           }
           sc.close();
           return flag;
    }
    
    // read BookBorrow.txt using UserID
    public boolean hasUser(String file, String id) throws FileNotFoundException{
           File f = new File(file);
           Scanner sc = new Scanner(f);
           String line;
           StringBuilder sb = new StringBuilder();
           
           while(sc.hasNextLine()){
               line = sc.nextLine();
               String[] data = line.split("/");

               if (data[2].equals(id)){ 
                   flag = true;
                   sb.append(line + "\n");
                   borrowTimes ++;
               }    
           }
           sc.close();
           returnLine = sb.toString();
           return flag;
    }
    
    // read User.txt using UserID
    public boolean isValid(String file, String id) throws FileNotFoundException{
           File f = new File(file);
           Scanner sc = new Scanner(f);
           String line;
           
           while(sc.hasNextLine()){
               line = sc.nextLine();
               String[] data = line.split("/");

               if (data[0].equals(id)){
                   flag = true;
                   returnLine = line;
               }    
           }
           sc.close();
           return flag;
    }
    
     // read User.txt for login function
    public boolean login(String file, String textline) throws FileNotFoundException{
           File f = new File(file);
           Scanner sc = new Scanner(f);
           String line;
           
           while(sc.hasNextLine()){
               line = sc.nextLine();

               if (line.equals(textline)){
                   flag = true;
               }    
           }
           sc.close();
           return flag;
    }
    
    public String getLine(){
        return returnLine;
    }
    
    public int getBorrowTimes(){
        return borrowTimes;
    }
}
