package com.zb.servlet;

import com.zb.dao.UserDao;
import com.zb.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: whh
 * Description:
 * @Data:Create in 11:21 2020/7/15
 * Nodified By:
 */
@WebServlet("/admUpdate")
public class AdmUpdateServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //接受查询到的值
        String IDnumber = request.getParameter("IDnumber");
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
        userDao.updateById(user);
        response.sendRedirect("/adm.jsp");
    }
}
