package ie.atu.ioc_di_exercise3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

    private LibraryService libraryService;

    // Setter injection to inject an instance of LibraryService
    @Autowired
    public void setLibraryService(LibraryService libraryService)
    {
        this.libraryService = libraryService;
    }

    // A method to handle a POST request to add a book to the library
    @PostMapping("/addBook")
    public String sendBook(@RequestBody Book newBook)
    {
        return libraryService.addBook(newBook);
    }
}
