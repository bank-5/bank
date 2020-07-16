package com.zb.servlet;

import com.zb.dao.UserDao;
import com.zb.pojo.User;
import sun.security.krb5.internal.tools.Klist;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

//刘子贤编写
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        User user = new User();
        user.setUsername(username);
        UserDao userDao = new UserDao();
        try {
            userDao.findUser(user);
            List<User> list = userDao.findUser(user);
            request.setAttribute("list",list);
            request.getRequestDispatcher("/user.jsp").forward(request,response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
