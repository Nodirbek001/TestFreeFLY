package uz.b.testfreefly.container;

import uz.b.testfreefly.dao.UserDAO;
import uz.b.testfreefly.service.Service;
import uz.b.testfreefly.service.UserService;

public class ApplicationContext extends Service<UserDAO> {

    public ApplicationContext(UserDAO dao) {
        super(dao);
    }

    private static UserDAO userDAO(){
        return new UserDAO();
    }
    private static final UserService authUserService = new UserService(userDAO());

    @SuppressWarnings("raw_types")
    public static <T> T getBean(Class<T> clazz) {
        return switch (clazz.getSimpleName()) {
            case "UserService" -> (T) authUserService;
            default -> throw new RuntimeException("Bean not found");
        };
    }
}
