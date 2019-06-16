package pl.lucky.dao;

import pl.lucky.model.Book;

public interface BookDao {

    void save(Book book);

    Book get(Long id);

    void cleanUp();
}
