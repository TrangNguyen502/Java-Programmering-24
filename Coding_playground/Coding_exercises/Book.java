package Coding_playground.Coding_exercises;

public class Book {
    String tilter;
    String author;
    int year;
    
    public Book(String tilter, String author, int year ){
        this.tilter = tilter;
        this.author = author;
        this.year = year;
    }

    public Book (){
        this("Unknow", "Unknow");
    }
    
    public Book (String tilter, String author){
        this( tilter, author, 0);
    }

    public Book (String tilter, int year){
        this(tilter, "Unknow", year);
    }

    public Book (int year, String author){
        this("unknow", author, year );
    }


    public void printValues(Book bookObject){
        System.out.println("Tilter: " + bookObject.tilter);
        System.out.println("Author: " + bookObject.author);
        System.out.println("Year: " + bookObject.year);
    }
}
