package lesson9.homework;

import java.time.LocalDateTime;

public class BorrowRecord {
    private Book book;
    private LocalDateTime borrowDate;
    private LocalDateTime returnDate;

    public BorrowRecord(Book book, LocalDateTime borrowDate, LocalDateTime returnDate) {
        this.book = book;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "BorrowRecord{" +
                "book=" + book +
                ", borrowDate=" + borrowDate +
                (returnDate == null ? "not return" : "returned om " + returnDate) +
                '}';
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public LocalDateTime getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDateTime borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }
    public boolean isReturned() {
        return returnDate != null;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

}
