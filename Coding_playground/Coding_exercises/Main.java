package Coding_playground.Coding_exercises;

public class Main {
    public static void main(String[] args){
        Book book1 = new Book("Livet efter dig", "Jojo Moyes", 2012);
        Book book2 = new Book("Harry Potter", "J.K.Rowling", 2008);

        Container container = new Container(book1, book2);

        System.out.println("Book 1 deatil:");
        container.printBooks();

        book1.tilter = "Harry Potter 2";
        book1.author = "J.K.Rowling";
        book1.year = 2010;

        System.out.println("After change of book1 details: ");
        container.printBooks();

        Book book3 = new Book ("Matilda","Roald Dahl", 1988);
        book3.printValues(book3);

        Book book4 = container.book1;
        book4.printValues(book4);

        System.out.println("Book 1: " + book1);
        System.out.println("Book 2: " + book2);
        System.out.println("Book 3: " + book3);
        System.out.println("Book 4: " + book4);
    }
}
