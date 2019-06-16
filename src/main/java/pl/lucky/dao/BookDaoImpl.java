package pl.lucky.dao;

import pl.lucky.model.Book;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Map;

public class BookDaoImpl implements BookDao{

    private EntityManagerFactory emf;
    private EntityManager em;

    public BookDaoImpl() {
        this.emf = Persistence.createEntityManagerFactory("myPersistenceUnit");
        this.em = emf.createEntityManager();
    }

    public void save(Book book) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        em.persist(book);
        tx.commit();
    }

    public Book get(Long id) {
        Book book = em.find(Book.class, id);
        return book;
    }

    public void cleanUp() {
        em.close();
        emf.close();
    }
}
