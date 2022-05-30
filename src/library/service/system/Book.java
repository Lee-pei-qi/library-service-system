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
public class Book {
    private long ID;
    private String title;
    private String author;
    private String genre;
    private double price;
    private int year;
    private String publisher;
   
    public Book(){                               // Constructor 1  
        ID = 0;
        title = "";
        author = "";
        genre = "";
        price = 0.0;
        year = 0;
        publisher = "";
    }
    
    public Book(long id){                        // Constructor 2 - BookReturn
        ID = id;
        title = "";
        author = "";
        genre = "";
        price = 0.0;
        year = 0;
        publisher = "";
    }
    
     public Book(long id, String title){         // Constructor 3 - BookBorrow
        ID = id;
        this.title = title; 
        author = "";
        genre = "";
        price = 0.0;
        year = 0;
        publisher = "";
    }
    
    public Book(long id, String t, String a, String g, double p, int y, String pub){  
        ID = id;
        title = t;                                    // Constructor 4
        author = a;
        genre = g;
        price = p;
        year = y;
        publisher = pub;
    }
    
    public long getID(){
        return ID;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public String getGenre(){
        return genre;
    }
    
    public double getPrice(){
        return price;
    }
    
    public int getYear(){
        return year;
    }
    
    public String getPublisher(){
        return publisher;
    }
    
    public void setID(long id){
        ID = id;
    }
    
    public void setTitle(String t){
        title = t;
    }
    
    public void setAuthor(String a){
        author = a;
    }
    
    public void setGenre(String g){
        genre = g;
    }
    
    public void setPrice(double p){
        price = p;
    }
    
    public void setYear(int y){
        year = y;
    }
    
    public void setPublisher(String p){
        publisher = p;
    }
    
    public String toString(){
        return ID + "/" + title + "/" + author + "/" + genre + "/" + price + "/" + year + "/" + publisher;
    }
}
