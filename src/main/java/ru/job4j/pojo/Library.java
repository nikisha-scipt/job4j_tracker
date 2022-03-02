package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book java = new Book("Study Java", 600);
        Book python = new Book("Study python", 500);
        Book javaScript = new Book("Study JavaScript", 15);
        Book cleanCode = new Book("Clean code", 328);
        Book[] books = new Book[4];
        books[0] = java;
        books[1] = python;
        books[2] = javaScript;
        books[3] = cleanCode;

        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.print("name book: " + bk.getNameBook() + System.lineSeparator()
                    + "number of pages: " + bk.getNumberOfPages() + System.lineSeparator());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        System.out.println("Переставили книги местами 0 и 3");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            System.out.print("name book: " + bk.getNameBook() + System.lineSeparator()
                    + "number of pages: " + bk.getNumberOfPages() + System.lineSeparator());
        }
        System.out.println("Выводим книгу Clean Code");
        for (int i = 0; i < books.length; i++) {
            Book bk = books[i];
            if ("Clean code".equals(bk.getNameBook())) {
                System.out.print("name book: " + bk.getNameBook() + System.lineSeparator()
                        + "number of pages: " + bk.getNumberOfPages() + System.lineSeparator());
            }
        }
    }

}
