package dev.cevalp.app.search;

import dev.cevalp.app.book.Book;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class SearchService {


    private static List<Book> booksAvailable = new LinkedList<>();

    static {
        booksAvailable.add(new Book("Miro", "Be better"));
        booksAvailable.add(new Book("Fero", "You can do it"));
        booksAvailable.add(new Book("Fero", "You can do it"));
        booksAvailable.add(new Book("Fero", "You can do it"));
        booksAvailable.add(new Book("Fero", "You can do it"));
    }


    public List<Book> findAll(String q){

        List<Book> matchedBooks = new LinkedList<>();

        // if q is empty, return the x first books
        if(q.isBlank()){
            return booksAvailable.subList(0, 1);
        }

        q = q.strip();
        q = q.toLowerCase();

        for(Book book : booksAvailable){

            if(book.getAuthor().toLowerCase().contains(q)){
                matchedBooks.add(book);
            } else if (book.getTitle().toLowerCase().contains(q)) {
                matchedBooks.add(book);
            }
        }

        return matchedBooks;
    }
}
