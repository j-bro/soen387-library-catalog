import models.Book;
import models.BookRepository;
import models.User;
import models.UserRepository;

import java.time.Year;

/**
 * Created by jeremybrown on 2016-09-30.
 */
public class Test {

    public static void main(String[] args) throws Exception {
//        createUser();
        createBook();
    }

    public static void createUser() throws Exception {
        User u = new User();
        u.setUsername("hello");
        u.setPassword("world");
        u.setFirstName("HEY");
        u.setLastName("JONNY OH");

        UserRepository.storeUser(u);
    }

    public static void createBook() throws Exception {
        Book b = new Book();
        b.setName("BOOK !");
        b.setAuthor("Jonny Smith");
        b.setPublisher("FRUITY BOOKS");
        b.setPublishingYear("1999");
        b.setAvailable(false);

        BookRepository.storeBook(b);
    }
}