package com.zb.servlet;

import com.zb.dao.UserDao;
import com.zb.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("用户基本信息查询");
        UserDao userDao = new UserDao();
        try {
            List<User> list = userDao.findAll();
            request.setAttribute("list",list);
            System.out.println(list);
            request.getRequestDispatcher("/user.jsp").forward(request,response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
