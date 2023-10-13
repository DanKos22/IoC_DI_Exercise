package ie.atu.ioc_di_exercise3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryService {

    private Book book;

    @Autowired
    public void setBook(Book book)
    {
        this.book = book;
    }

    public String addBook(Book book)
    {
        return book.getConfirmation();
    }

    public String getBooks()
    {
        return book.getList();
    }

}
