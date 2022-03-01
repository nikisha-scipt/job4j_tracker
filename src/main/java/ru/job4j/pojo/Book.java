package ru.job4j.pojo;

public class Book {

    private String nameBook;
    private int numberOfPages;

    public Book(String nameBook, int numberOfPages) {
        this.nameBook = nameBook;
        this.numberOfPages = numberOfPages;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
