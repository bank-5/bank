package com.zb.servlet;

import com.zb.dao.AdminDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/userlist")
public class AdmUserListServlet extends HttpServlet {
    //丁海杨编写
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        HttpSession session=req.getSession();
        AdminDao dao=new AdminDao();
        List users= dao.findAll();
        req.setAttribute("users",users);
        session.setAttribute("name",name);
        req.getRequestDispatcher("adm.jsp").forward(req,resp);
    }
}
