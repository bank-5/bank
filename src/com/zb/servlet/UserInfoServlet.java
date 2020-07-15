package com.zb.servlet;

import com.zb.dao.UserDao;
import com.zb.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/UserInfoServlet")
public class UserInfoServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idnumber = request.getParameter("IDnumber");
        UserDao userDao=new UserDao();
        User user=userDao.findByIDnumber(idnumber);
        request.setAttribute("user",user);
        request.getRequestDispatcher("/user.jsp").forward(request,response);
    }
}
