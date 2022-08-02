package uz.b.testfreefly.dao;

import org.hibernate.Session;
import uz.b.testfreefly.configs.HibernateConfigurer;
import uz.b.testfreefly.domains.Plane;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class PlaneDAO implements Dao<Plane> {
    @Override
    public Plane create(Plane entity) {
        Session session = HibernateConfigurer.getSession();
        session.getTransaction().begin();
        session.persist(entity);
        session.getTransaction().commit();
        return entity;
    }

    @Override
    public void delete(Long id) {
        Session session = HibernateConfigurer.getSession();
        session.getTransaction().begin();
        Plane plane = session.find(Plane.class, id);
        if (Objects.nonNull(plane)) {
            session.remove(plane);
        }
        session.getTransaction().commit();
    }

    @Override
    public List<Plane> findAll() {
        Session session = HibernateConfigurer.getSession();
        return session.createQuery("select t from Plane t", Plane.class).getResultList();
    }

    @Override
    public Plane findOne(Long id) {
        return null;
    }

    public Optional<Plane> findPlaneByName(String name) {
        Session session = HibernateConfigurer.getSession();
        return Optional.ofNullable(
                session.createQuery("select t from Plane t where t.name=:name", Plane.class)
                        .setParameter("name", name)
                        .getSingleResult()
        );
    }
}
