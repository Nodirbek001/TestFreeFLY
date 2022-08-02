package uz.b.testfreefly.servlets;

import java.io.*;
import java.util.Objects;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HomeServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/main.jsp");
        boolean loggedId = Objects.isNull(request.getSession().getAttribute("userId"));
        request.setAttribute("loggedId", loggedId);
        requestDispatcher.forward(request,response);

    }

    public void destroy() {
    }
}