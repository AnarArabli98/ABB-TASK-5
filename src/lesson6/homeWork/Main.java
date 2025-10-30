package lesson6.homeWork;

public class Main {
    static void main() {
        Library<Library.Section> library = new Library<>();

        Library.Section fiction =  new Library.Section("Fiction");
        Library.Section science =  new Library.Section("Science");

        Library<Library.Section>.Book b1 = library.new Book("1984", "Orwell", 1949);
        Library<Library.Section>.Book b2 = library.new Book("Project Hail MAry", "Andy Weir", 2021);
        Library<Library.Section>.Book b3 = library.new Book("A brief hiatory of time", "Stephen hawking", 1988);

        fiction.addBook(b1);
        fiction.addBook(b2);
        science.addBook(b3);

        library.addSection(fiction);
        library.addSection(science);

        library.displayAllSections();

        library.filterBooks(new  Library.BookFilter() {
            @Override
            public boolean filter(Library.Book book) {
                return book.getYear() > 2000;
            }
        });

        };
    }

