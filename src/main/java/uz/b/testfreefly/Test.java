//package uz.b.testfreefly;
//
//import org.hibernate.Hibernate;
//import org.hibernate.Session;
//import uz.b.testfreefly.configs.HibernateConfigurer;
//import uz.b.testfreefly.container.ApplicationContext;
//import uz.b.testfreefly.dao.UserDAO;
//import uz.b.testfreefly.domains.Airport;
//import uz.b.testfreefly.domains.Plane;
//import uz.b.testfreefly.domains.Users;
//import uz.b.testfreefly.service.UserService;
//
//import java.util.ArrayList;
//
//public class Test {
//    public static void main(String[] args) {
//        final UserService userService = ApplicationContext.getBean(UserService.class);
//
//
//        Users userByUsername = userService.findUserByUsername("111");
//        System.out.println(userByUsername);
//        Airport airport=Airport.builder()
//                .name("uZ AIrveys")
//                .director(userByUsername)
//
//                .build();
//        Session session= HibernateConfigurer.getSession();
//        session.getTransaction().begin();
//        session.persist(airport);
//        session.getTransaction().commit();
//
//    }
//}
