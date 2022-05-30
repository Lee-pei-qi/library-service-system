/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.service.system;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 https://www.homeandlearn.co.uk/java/write_to_textfile.html
 */

public class WriteFile {
    private String path;
    private boolean append_to_file = false;
   
    public WriteFile(String file_path){ //overwrite the text file
        path = file_path;
    }
    
    public WriteFile(String file_path, boolean value){ //append to the file - insert new record
        path = file_path;
        append_to_file = value;
    }
    
    public void writeToFile (String textline) throws IOException{ //text to write in file
        FileWriter write = new FileWriter(path, append_to_file); //FileWriter - opening the correct file, and storing the text as bytes
        PrintWriter print = new PrintWriter(write); //convert plain text to bytes
        
        print.println(textline);
        print.close();
    }
    
    public void updateFile (String textline) throws IOException{ //text to write in file
        FileWriter write = new FileWriter(path, append_to_file); //FileWriter - opening the correct file, and storing the text as bytes
        PrintWriter print = new PrintWriter(write); //convert plain text to bytes
        
        print.print(textline);
        print.close();
    }
   
    
    public void deleteRow(String deleteLine) throws IOException{
        File file = new File(path);
        
        Scanner sc = new Scanner(file);
        String line = "";
        StringBuilder sb = new StringBuilder();
           
           while(sc.hasNextLine()){
               line = sc.nextLine();

               if (!line.equals(deleteLine)){
                   sb.append(line);
                   sb.append("\n");
               }    
           }
           sc.close();
           updateFile(sb.toString());
    }
}
