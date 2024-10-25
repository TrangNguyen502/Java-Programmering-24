package Coding_playground.Coding_exercises;

public class Main {
    public static void main(String[] args){
        Book book1 = new Book("Livet efter dig", "Jojo Moyes", 2012);
        Book book2 = new Book("Harry Potter", "J.K.Rowling", 2008);

        Container container = new Container(book1, book2);

        System.out.println("Books details:");
        container.printBooks();

        book1.tilter = "Harry Potter: Är bra";
        book1.author = "J.K.Rowling";
        book1.year = 2010;

        System.out.println("After change of book 1 details: ");
        container.printBooks();

        Book book3 = new Book ("Matilda","Roald Dahl", 1988);

        Book book4 = container.book1;

        System.out.println("Ny book details:");
        System.out.println("Book 1: ");
        book1.printValues(book1);
        System.out.println("Book 2: ");
        book2.printValues(book2);
        System.out.println("Book 3: " );
        book3.printValues(book3);
        System.out.println("Book 4: ");
        book4.printValues(book4);

        container.book1.tilter = "Game of thorn";
        container.book1.author = "Geoger";
        container.book1.year = 2005;

        System.out.println("Efter ändring i book 1:");
        book1.printValues(book1);
        System.out.println("Efter ändring book 4");
        book4.printValues(book4);
        
    }
}
