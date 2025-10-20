package lesson4;

public class Main {
    static void main() {
        Book b1 = new Book("Clean code","Robert C.Martin","123456789",1,1);

        b1.printInfo();
        b1.borrowBook();
        b1.returnBook();
        Book.libraryRules();
        b1.bookType();
    }


    }

