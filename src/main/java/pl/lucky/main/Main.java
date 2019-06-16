package pl.lucky.main;

import pl.lucky.dao.BookDao;
import pl.lucky.dao.BookDaoImpl;
import pl.lucky.model.Book;

public class Main {
    public static void main(String[] args) {
//        Book book = new Book("123456789", "Wilk z Wall Street", "Jordan Belfort");
        BookDao bookDao = new BookDaoImpl();
//        bookDao.save(book);
//        System.out.println("Book saved");
        Book book = bookDao.get(1L);
        System.out.println(book);
        bookDao.cleanUp();
    }
}
