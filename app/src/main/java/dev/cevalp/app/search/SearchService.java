package dev.cevalp.app.search;

import dev.cevalp.app.book.Book;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class SearchService {


    private static List<Book> booksAvailable = new LinkedList<>();

    static {
        booksAvailable.add(new Book("Miro", "Be better", 1L));
        booksAvailable.add(new Book("Fero", "You can do it", 2L));
//        booksAvailable.add(new Book("Fero", "You can do it",));
//        booksAvailable.add(new Book("Fero", "You can do it"));
//        booksAvailable.add(new Book("Fero", "You can do it"));
    }


    public List<Book> findAll(String q){

        List<Book> matchedBooks = new LinkedList<>();

        // check if author q is in name title ...
        for(Book book : booksAvailable){
            if(book.getAuthor().contains(q)){
                matchedBooks.add(book);
            } else if (book.getTitle().contains(q)) {
                matchedBooks.add(book);
            }
        }

        return matchedBooks;
    }
}
