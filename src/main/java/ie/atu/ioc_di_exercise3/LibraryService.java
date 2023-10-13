package ie.atu.ioc_di_exercise3;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@Data
@Service
public class LibraryService {

    private Book book;
    ArrayList<String> myList = new ArrayList<String>();

    @Autowired

    public String addBook(Book book)
    {
        String object = "Title:\t" + book.getTitle() + "Author:\t" + book.getAuthor() +"Isbn\t" + book.getIsbn() + "Published in:\t" + book.getPublishedYear();
        myList.add(object);
        return object;
    }

    public String getBooks()
    {
        String list = loop(myList);
        return list;
    }

    public static String loop(ArrayList<String> someArrayList)
    {
        int indexvalue = 0;

        for(String value: someArrayList)
        {
            System.out.println("Book at index " + indexvalue + ":" + value);
            indexvalue++;
        }
    }
}
