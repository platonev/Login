package com.platonev.login;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if (username == null && password == null || username.equals("") || password.equals("")) {
            resp.sendRedirect("./index.jsp");
            return;
        }

        PrintWriter writer = resp.getWriter();

        if (username != null && username.equals("hello") && password != null && password.equals("world")) {
            writer.println("Welcome!");
        } else {
            writer.println("Sorry, wrong username or password");
        }
    }
}
