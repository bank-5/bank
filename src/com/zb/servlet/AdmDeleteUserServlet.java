package com.zb.servlet;

import com.zb.dao.AdminDao;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/userdelete")
public class AdmDeleteUserServlet extends HttpServlet {
    //丁海杨编写
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       AdminDao dao=new AdminDao();
       Integer IDnumber=Integer.parseInt(req.getParameter("IDnumber"));
        dao.deleteById(IDnumber);
        resp.sendRedirect("/userlist");
    }
}
