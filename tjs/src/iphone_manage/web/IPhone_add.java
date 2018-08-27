package iphone_manage.web;

import iphone_manage.dao.realize_dao;
import iphone_manage.entity.Iphone;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(value="/jsp/add")
public class IPhone_add extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/jsp/iPhone-add.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String datetime = req.getParameter("datetime");
        String color = req.getParameter("color");
        int price = Integer.parseInt(req.getParameter("price"));
        int stock = Integer.parseInt(req.getParameter("stock"));
        String firm = req.getParameter("firm");
        Iphone ip = new Iphone(id,name,datetime,color,price,stock,firm);
        realize_dao dao = new realize_dao();
        int i = dao.getphoneadd(ip);
        resp.sendRedirect("/jsp/index");
    }
}
