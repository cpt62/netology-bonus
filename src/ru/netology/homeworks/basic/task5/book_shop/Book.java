package ru.netology.homeworks.basic.task5.book_shop;

public class Book {

    private String title;
    private int releaseYear;
    private Author author;
    private int pages;

    public Book(String title, int releaseYear, Author author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isBig() {
        return this.pages > 500;
    }

    public boolean matches(String word) {
        return author.getName().contains(word) || author.getSurname().contains(word) || title.contains(word);
    }

    public int estimatePrice() {
        return Math.max((int) Math.floor(pages * 3 * Math.sqrt(author.getRating())), 250);
    }

    @Override
    public String toString() {
        return String.format("Название книги: %s\n" +
                        "Автор книги: %s\n" +
                        "Год издания: %d\n" +
                        "Количество страниц: %d"
                , title
                , author.getName() + " " + author.getSurname()
                , releaseYear
                , pages
        );
    }

    public void bookInfo(String searchString) {
        System.out.println(this);
        System.out.println("Стоимость книги составляет: " + estimatePrice());
        System.out.println("Относится ли эта книга к категории \"большая\"? : " + this.isBig());
        System.out.println("Содержит ли в названии книги/имени автора/фамилии интересующее слово: \"Java\"? : " + this.matches(searchString));
        System.out.println();
    }
}
