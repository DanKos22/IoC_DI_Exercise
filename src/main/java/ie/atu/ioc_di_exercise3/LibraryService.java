package ie.atu.ioc_di_exercise3;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Data
@Service
public class LibraryService {

    ArrayList<String> myList = new ArrayList<String>();

    @Autowired
    public String addBook(Book book)
    {
        String object = "Title:\t" + book.getTitle() + "Author:\t" + book.getAuthor() +"Isbn\t" + book.getIsbn() + "Published in:\t" + book.getPublishedYear() + "\thas been added to the library";
        //myList.add(object);
        return object;
    }

    public ArrayList<String> getBooks()
    {
        return myList;
    }
}
