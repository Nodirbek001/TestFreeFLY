package uz.b.testfreefly.dao;

import org.hibernate.Session;
import uz.b.testfreefly.configs.HibernateConfigurer;
import uz.b.testfreefly.domains.Flight;

import java.util.List;

public class FlightDAO implements Dao<Flight>{
    @Override
    public Flight create(Flight entity) {
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
    public List<Flight> findAll() {
        return null;
    }

    @Override
    public Flight findOne(Long id) {
        return null;
    }
}
