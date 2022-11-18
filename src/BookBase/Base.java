package BookBase;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Base {
    public static void main(String[] args) {
        List<Book> books = new ArrayList();
        books.add(new Book ("Pushkin", "Captain's Daugther", 1863));
        books.add(new Book ("Lermontov", "Hero of Our Time", 1840));
        books.add(new Book ("Tolstoi", "War and Society", 1873));
        books.add(new Book("Pushkin", "Evgeny Onegin",1833));
        books.add(new Book("Pushkin", "Evgeny Onegin",1833));

        books.stream().map(Book::getName).collect(Collectors.toList());

        books.forEach(System.out::println);
    }
}
