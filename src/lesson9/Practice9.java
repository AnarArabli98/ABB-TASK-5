package lesson9;

import lesson9.homework.Book;
import lesson9.homework.BorrowRecord;
import lesson9.homework.LibraryService;
import lesson9.homework.User;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Practice9 {
    static void main(String[] args) {

//        Predicate<Integer> predicate = integer ->  (integer<10);
//        System.out.println(predicate.test(10));
//
//        List<String> list = new ArrayList<>();
//        list.add("1");
//        list.add("2");
//        list.add("3");
//        list.add("4");
//        list.add("5");
//
//        Consumer<String> consumer = s-> System.out.print(String.join(",", list+" "));
//        list.forEach(consumer);

        List<Character> list = List.of('a', 'b', 'c', 'd', 'e', 'f');

//        var asciiValue1 = list.stream()
//                .map(c -> new Character((char) c))
//                .collect(Collectors.toSet());
//
//        System.out.println(asciiValue1);
//        var asciiValue  =list.stream()
//                .map(AsciiValue::new)
//                .collect(Collectors.toSet());


        Book b1 = new Book("1984" ,"George Orwell",1949,4.9,true);
        Book b2 = new Book("Animal Farm","George Orwell",1945,4.8,false);
        Book b3 = new Book("Clean Code","Robert Martin",2008,4.7,true);
        Book b4 = new Book("Effectice Java","Joshua Bloch",2018,4.9,true);
        Book b5 = new Book("The Pragmatic Programmer","Andy Hunt",1999,4.6,true);
        Book b6 = new Book("Java Concurrency in Practic", "Brin Goets",2006,4.5,false);

        List<Book> books = Arrays.asList(b1,b2,b3,b4,b5,b6);

        User u1 = new User("Anar", 25, Arrays.asList(
                new BorrowRecord(b1, LocalDate.of(2025,9,1).atStartOfDay(),LocalDate.of(2025,9,10)),
                new BorrowRecord(b2, LocalDate.of(2025,10,5).atStartOfDay(),null)));

        List<User> users = Arrays.asList(u1);

        LibraryService  libraryService = new LibraryService(books,users);
        libraryService.sortBooks();
        libraryService.analizLibrary();




    }

}
