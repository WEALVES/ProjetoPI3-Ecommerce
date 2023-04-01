package br.com.techstore.servlet;

import br.com.techstore.dao.CarDao;
import br.com.techstore.model.Car;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-car")
public class CreateAccountServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest servletRequest, HttpServletResponse resp) throws ServletException, IOException {
        String carName = servletRequest.getParameter("car-name");

        Car car = new Car();
        car.setName(carName);

        new CarDao().createCar(car);

        servletRequest.getRequestDispatcher("index.html").forward(servletRequest, resp);

    }
}
