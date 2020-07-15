package com.zb.servlet;

import com.zb.dao.UserDao;
import com.zb.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/SaveMoneyServlet")
public class SaveMoneyServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String IDnumber = request.getParameter("IDnumber");
        Integer money =Integer.parseInt(request.getParameter("money"));
        User user = new User();
        user.setIDnumber(IDnumber);
        user.setMoney(money);
        UserDao userDao = new UserDao();
        try {
            userDao.saveMoney(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        response.sendRedirect(""+request.getContextPath()+"/index.jsp");
    }
}
