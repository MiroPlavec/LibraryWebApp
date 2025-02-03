package dev.cevalp.app.book;

import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class BookService {

    private static List<Book> books = new LinkedList<>();

    static {
        books.add(new Book("Miro", "Be better", 1L));
        books.add(new Book("Fero", "You can do it", 2L));
//        booksAvailable.add(new Book("Fero", "You can do it",));
//        booksAvailable.add(new Book("Fero", "You can do it"));
//        booksAvailable.add(new Book("Fero", "You can do it"));
    }


    public Book getBookById(Long id){
        for(Book book : books){
            if(book.getId().equals(id)) return book;
        }

        return null;
    }

}
