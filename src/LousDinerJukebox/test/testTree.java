package LousDinerJukebox.test;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class testTree {
    public static void main(String[] args) {
        new testTree().go();
    }

    public void go() {
        Book b1 = new Book("How Cats Work");
        Book b2 = new Book("Remix your Body");
        Book b3 = new Book("Finding Emo");

        // Construtor sobrecarregado de TreeSet que aceita Comparator
        // Set<Book> tree = new TreeSet<>((o1, o2) -> o1.getTitle().compareTo(o2.getTitle()));

        Set<Book> tree = new TreeSet<>();
        tree.add(b1);
        tree.add(b2);
        tree.add(b3);
        System.out.println(tree);
    }
}

class Book implements Comparable<Book> {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book book)) return false;
        return Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public int compareTo(Book book) {
        return title.compareTo(book.title);
    }
}
