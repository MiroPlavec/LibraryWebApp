package dev.cevalp.app.search;

import dev.cevalp.app.book.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SearchController {

    private final SearchService searchService;

    @Autowired
    public SearchController(SearchService searchService){
        this.searchService = searchService;
    }

    // show all search gor q
    @GetMapping("/search")
    public String showResults(
            @RequestParam(required = false) String q,
            Model model){

        List<Book> matchedBooks = searchService.findAll(q);
        model.addAttribute("books", matchedBooks);
        return "search.html";
    }
}
