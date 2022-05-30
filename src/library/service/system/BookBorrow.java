/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.service.system;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Acer
 */
public class BookBorrow extends Book{
    private String borrowDate;
    private String dueDate;
    private String BorrowerID;
    private int renewTimes;
    
    public BookBorrow(){
        super();
        borrowDate = "";
        dueDate = "";
        BorrowerID = "";
        renewTimes = 0;
    }
    
    public BookBorrow(long id, String title, String bd, String b){
        super(id, title);
        borrowDate = bd;
        dueDate = "";
        BorrowerID = b;
        renewTimes = 0;
    }
    
    public BookBorrow(long id, String title, String bd, String dd, String b){
        super(id, title);
        borrowDate = bd;
        dueDate = dd;
        BorrowerID = b;
        renewTimes = 0;
    }
    
    public BookBorrow(long id, String title, String bd, String dd, String b, int times){
        super(id, title);
        borrowDate = bd;
        dueDate = dd;
        BorrowerID = b;
        renewTimes = times;
    }
    
    public String getBorrowerID(){
        return BorrowerID;
    }
    
    public String getBorrowDate(){
        return borrowDate;
    }
    
    public String getDueDate(){
        return dueDate;
    }
    
    public int getRenewTimes(){
        return renewTimes;
    }
    
    public void setBorrowerID(String b){
        BorrowerID = b;
    }
    
    public void setBorrowDate(String d){
        borrowDate = d;
    }
    
    // https://beginnersbook.com/2017/10/java-add-days-to-date/
    
    public String setDueDate(String d) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = sdf.parse(d);            // convert string to date format
        Calendar c = Calendar.getInstance();
        c.setTime(date);                    // add date to calendar
        c.add(Calendar.DAY_OF_MONTH, 14);   // add 14 days to date
        dueDate = sdf.format(c.getTime());  // convert calendar to date format
        return dueDate;
    }
    
    public void setRenewTimes(int times){
        renewTimes = times;
    }
    
    // https://www.geeksforgeeks.org/find-the-duration-of-difference-between-two-dates-in-java/#:~:text=Parse%20both%20start_date%20and%20end_date,getTime().
    
    public Double calculateFine(Date currentDate) throws ParseException{
        double fine = 0.00;
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date date = sdf.parse(dueDate);
        long diff = (currentDate.getTime() - date.getTime())/1000/60/60/24 % 365; // calculate difference in days
        
        fine = 1.00*diff;
        return fine;
    }
    
    @Override
    public String toString(){
        return super.getID() + "/" + super.getTitle() + "/" + BorrowerID + "/" + borrowDate + "/" + dueDate + "/" + renewTimes;
    }
}
