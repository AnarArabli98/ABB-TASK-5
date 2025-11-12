package lesson9.homework;

import lesson5.Bicycle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LibraryService {
    private List<Book> books;
    private List<User> users;

    public  LibraryService(List<Book> books, List<User> users) {
        this.books = books;
        this.users = users;
    }

    public void sortBooks() {
        System.out.println("Sorting Books:");
        books.stream()
                .sorted(
                        Comparator.comparing(Book::getAuthor).reversed()
                                .thenComparing(Book::getYear)
                                .thenComparing(Book::getTitle)
                ).forEach(System.out::println);
    }

    public void analizLibrary(){
        System.out.println("Analizing Library:");

        double averate = books.stream()
                //hər kitabın rating-ni götürür
                .mapToDouble(Book::getRating)
                //ortalama
                .average()
                //eger bosdursa 0
                .orElse(0.0);

        System.out.println("Average Rating: " + averate);

        List<Book> availab2000 =
                books.stream()
                        .filter(book -> book.getYear() > 2000 && book.isAvailable())
                        .collect(Collectors.toList());



        System.out.println("Available Books: " + availab2000);


        Map<String, Long> bookCount = users.stream()
                .flatMap(u -> u.getBorrowHistory().stream())
                .collect(Collectors.groupingBy(r -> r.getBook().getTitle(),Collectors.counting()));

        bookCount.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(e-> System.out.println("En cox borrow olunan kitab: "+  e.getKey() + "  " + e.getValue() ));



        // hazirda oxunan kitab
        System.out.println("Hal hazirda oxunan :");
        Map<String,List<Book>> readingBooks = users.stream()
                .collect(Collectors.toMap(
                        User::getName,
                        u-> u.getBorrowHistory().stream()
                                .filter(r-> r.getReturnDate() == null)
                                .map(BorrowRecord::getBook)
                                .collect(Collectors.toList())
                ));
        readingBooks.forEach((users, books) -> System.out.println(users + " " + books));

        //kitablari muelliflere gore qruplasdir
        System.out.println("Muelliflere groe qruplasdirma : ");
        Map<String,List<Book>> grouped = books.stream()
                .filter(b->b.getYear()>1950)
                .collect(Collectors.groupingBy(Book::getAuthor));
        grouped.forEach((authors , list) -> System.out.println(authors + " " + list));

    }


    Optional<Book> findRecommendedBookForUser(User user) {
        if (user.getBorrowHistory().isEmpty()) {
            return Optional.empty();
        }

        // ən çox oxuduğu müəllifi tap
        String favauth = user.getBorrowHistory()
                .stream().map(r -> r.getBook().getAuthor())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);

        //hımin müəllifin kitabxanada olan ən ratingli kitabi
        return books.stream()
                .filter(book -> book.getAuthor().equals(favauth))
                .max(Comparator.comparing(Book::getRating));
    }

    public void unicalAuthors(){
        System.out.println("Unical Authors:");
        Set<String> authors = users.stream()
                .flatMap(u->u.getBorrowHistory().stream())
                .map(r->r.getBook().getAuthor())
                .collect(Collectors.toSet());
        authors.forEach(System.out::println);
    }

    public Optional<User> findTopReader(List<User> users,int month, int year){
        return users.stream()
                .map(u->Map.entry(u,
                        u.getBorrowHistory().stream()
                                .filter(r->r.getBorrowDate().getMonthValue()== month
                                && r.getBorrowDate().getYear()==year)
                                .count()))
                .max(Map.Entry.comparingByValue())
                .filter(e->e.getValue()>0)
                .map(Map.Entry::getKey);

    }

}
