package uz.b.testfreefly.container;

import uz.b.testfreefly.dao.PlaneDAO;
import uz.b.testfreefly.dao.UserDAO;
import uz.b.testfreefly.service.PlaneService;
import uz.b.testfreefly.service.Service;
import uz.b.testfreefly.service.UserService;

public class ApplicationContext extends Service<UserDAO> {

    public ApplicationContext(UserDAO dao) {
        super(dao);
    }

    private static UserDAO userDAO() {
        return new UserDAO();
    }

    private static PlaneDAO planeDAO() {
        return new PlaneDAO();
    }

    private static final UserService authUserService = new UserService(userDAO());
    private static final PlaneService planeService = new PlaneService(planeDAO());

    @SuppressWarnings("raw_types")
    public static <T> T getBean(Class<T> clazz) {
        return switch (clazz.getSimpleName()) {
            case "UserService" -> (T) authUserService;
            case "PlaneService" -> (T) planeService;
            default -> throw new RuntimeException("Bean not found");
        };
    }
}
