package com.zb.servlet;

import com.zb.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//刘子贤编写
@WebServlet("/UserDeleteServlet")
public class UserDeleteServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        UserDao userDao = new UserDao();
        userDao.deleteByUsername(username);
        response.sendRedirect(""+request.getContextPath()+"/login.jsp");
    }
}
