package dev.cevalp.app.book;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final List<Book> books;

    public BookService(List<Book> books){
        this.books = books;
    }

    public Book getBookById(Long id){
        for(Book book : books){
            if(book.getId() == id) return book;
        }

        return null;
    }

}
