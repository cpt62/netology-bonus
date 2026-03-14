package ru.netology.homeworks.basic.task5.book_shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Герберт", "Шилдт", 6);
        Author author2 = new Author("Брюс", "Эккель", 7);
        Author author3 = new Author("Крейг", "Уолс", 9);

        Book book1 = new Book("Философия Java", 2020, author2, 1165);
        Book book2 = new Book("Java. Руководство для начинающих. 9-е издание", 2023, author1, 750);
        Book book3 = new Book("Java. Руководство для начинающих. 12-е издание", 2024, author1, 1343);
        Book book4 = new Book("Spring in Action", 2022, author3, 543);

        List<Book> bookList = Arrays.asList(book1, book2, book3, book4);

        bookList.forEach(book -> book.bookInfo("Java"));

    }
}
