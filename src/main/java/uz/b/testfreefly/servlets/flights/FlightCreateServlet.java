package uz.b.testfreefly.servlets.flights;

import uz.b.testfreefly.dto.flight.FlightDTO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/flight/create")
public class FlightCreateServlet extends HttpServlet {



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws
            ServletException, IOException {

//        FlightDTO flightDTO = FlightDTO.builder()
//                .plane()
//                .build();


    }
}
