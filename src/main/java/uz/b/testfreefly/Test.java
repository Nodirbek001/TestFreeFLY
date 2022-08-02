package uz.b.testfreefly;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import uz.b.testfreefly.configs.HibernateConfigurer;
import uz.b.testfreefly.container.ApplicationContext;
import uz.b.testfreefly.dao.UserDAO;
import uz.b.testfreefly.domains.Airport;
import uz.b.testfreefly.domains.Plane;
import uz.b.testfreefly.domains.Users;
import uz.b.testfreefly.dto.plan.PlaneDTO;
import uz.b.testfreefly.service.PlaneService;
import uz.b.testfreefly.service.UserService;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        final PlaneService userService = ApplicationContext.getBean(PlaneService.class);



        userService.create(PlaneDTO.builder()
                        .name("UZBAIRves")
                .build());


    }
}
