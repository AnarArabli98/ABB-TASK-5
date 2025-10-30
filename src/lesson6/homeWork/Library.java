package lesson6.homeWork;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends Library.Section> {

    private List<T> sections = new ArrayList<>();


    public void displayAllSections() {
            for (T section1 : sections) {
                System.out.println(" Section : " + section1.getName());
                section1.displayBooks();
            }
    }


    public interface BookFilter {
        boolean filter(Library.Book book);
    }

    public class Book {
        private String title;
        private String author;
        private int year;


        public Book(String title, String author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        public int getYear() {
            return year;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", year=" + year +
                    '}';
        }
    }

    void addSection(T section) {
        sections.add(section);
    }

    public void filterBooks(BookFilter filter) {

        System.out.println("\n Filtering Books ");
        for (T section : sections) {
            for (Library<?>.Book book : section.getBooks()) {
                if (filter.filter(book)) {
                    System.out.println(" - " + book);
                }
            }
        }
    }

    public static class Section{
        private String name;
        private List<Library<?>.Book> books = new ArrayList<>();

        public Section(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        public List<Library<?>.Book> getBooks() {
            return books;
        }

        public void addBook(Library.Book book) {
            books.add(book);
        }
        public void displayBooks() {
            for (Library<?>.Book book : books) {
                System.out.println(" - " + book);;
            }
        }
    }


}

