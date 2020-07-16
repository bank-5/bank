package com.zb.servlet;

import com.zb.dao.UserDao;
import com.zb.pojo.User;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/admAdd")
public class AdmAddUserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String IDnumber  =   request.getParameter("IDnumber");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        Integer money = Integer.parseInt(request.getParameter("money"));
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        User user = new User();
        user.setIDnumber(IDnumber);
        user.setUsername(username);
        user.setPassword(password);
        user.setMoney(money);
        user.setAddress(address);
        user.setPhone(phone);
        UserDao userDao = new UserDao();
        userDao.insertUser(user);
        response.sendRedirect("/userlist");
    }
}
