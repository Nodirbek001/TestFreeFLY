package uz.b.testfreefly.servlets.user;

import uz.b.testfreefly.container.ApplicationContext;
import uz.b.testfreefly.dto.user.RegisterDTO;
import uz.b.testfreefly.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/auth/register")
public class RegisterServlet extends HttpServlet {

    public final  UserService userService = ApplicationContext.getBean(UserService.class);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/views/auth/register.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RegisterDTO registerDTO = RegisterDTO.builder()
                .fullName(req.getParameter("fullName"))
                .username(req.getParameter("username"))
                .password(req.getParameter("password"))
                .confirmPassword(req.getParameter("confirmPassword"))
                .build();
        userService.create(registerDTO);
        resp.sendRedirect(" /auth/login");
    }
}
