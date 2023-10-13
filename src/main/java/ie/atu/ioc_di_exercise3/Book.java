package ie.atu.ioc_di_exercise3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Book {
    private String title;
    private String author;
    private String isbn;
    private int publishedYear;

    private String List;

    public String getConfirmation()
    {
        return "Book added";
    }

    public String getList()
    {
        return List;
    }
}
