package com.platonev.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class LoginController {

    @RequestMapping("/login")
    public void login(@RequestParam(value = "username", required = false, defaultValue = "") String username, @RequestParam(value = "password", required = false, defaultValue = "") String password, HttpServletResponse resp) throws IOException {

        if (username == null && password == null || username.equals("") || password.equals("")) {
            resp.sendRedirect("./");
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
