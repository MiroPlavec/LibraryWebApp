package dev.cevalp.app.book;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping("/book/{id}")
    public String book(
            @PathVariable String id,
            Model page
    ){
        System.out.println(id);
        Book book = bookService.getBookById(Long.valueOf(id));
        page.addAttribute("book", book);

        return "book.html";
    }
}
