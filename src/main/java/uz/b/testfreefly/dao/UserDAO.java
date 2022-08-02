package uz.b.testfreefly.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import uz.b.testfreefly.configs.HibernateConfigurer;
import uz.b.testfreefly.domains.Users;

import java.util.List;
import java.util.Optional;

public class UserDAO implements Dao<Users>{
    @Override
    public Users create(Users entity) {
        Session session = HibernateConfigurer.getSession();
        session.getTransaction().begin();
        session.persist(entity);
        session.getTransaction().commit();
        return entity;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Users> findAll() {
        Session session = HibernateConfigurer.getSession();
        return session.createQuery("select t from Users t", Users.class).getResultList();
    }

    @Override
    public Users findOne(Long id) {
        return null;
    }

    public Optional<Users> findByUsername(String username) {
        Session session = HibernateConfigurer.getSession();
        return Optional.ofNullable(
                session.createQuery("select  t from Users t where t.username = :username", Users.class)
                        .setParameter("username", username)
                        .getSingleResultOrNull());
    }

}
