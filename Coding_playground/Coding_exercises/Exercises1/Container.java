package Coding_playground.Coding_exercises;

public class Container {
    Book book1;
    Book book2;

    public Container(Book b1, Book b2){
        this.book1 = b1;
        this.book2 = b2;
    }

    public void printBooks(){
        System.out.println("Book 1:");
        book1.printValues(book1);
        System.out.println("Book 2:");
        book2.printValues(book2);
    }
}
