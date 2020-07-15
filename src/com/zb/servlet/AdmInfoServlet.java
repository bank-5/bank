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
 * @Data:Create in 8:49 2020/7/15
 * Nodified By:
 */
@WebServlet("/admInfo")
public class AdmInfoServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String IDnumber = request.getParameter("IDnumber");
        UserDao userDao = new UserDao();
        User user = userDao.getUserById(IDnumber);
        request.setAttribute("user",user);
        request.getRequestDispatcher("/adm_update.jsp").forward(request,response);
    }
}
