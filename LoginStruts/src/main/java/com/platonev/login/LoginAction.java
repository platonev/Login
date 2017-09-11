package com.platonev.login;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        LoginForm loginForm = (LoginForm) form;
        String username = loginForm.getUsername();
        String password = loginForm.getPassword();

//        String username = request.getParameter("username");
//        String password = request.getParameter("password");

        if (username == null && password == null || username.equals("") || password.equals("")) {

            return mapping.findForward("failure");
        } else if (username != null && username.equals("hello") && password != null && password.equals("world")) {

            return mapping.findForward("welcome");
        } else {

            return mapping.findForward("failure");
        }
    }
}
