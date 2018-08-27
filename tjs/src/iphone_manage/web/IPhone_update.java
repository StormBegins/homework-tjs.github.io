package iphone_manage.web;

import iphone_manage.dao.realize_dao;
import iphone_manage.entity.Iphone;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet(value = "/jsp/update")
public class IPhone_update extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        int id = Integer.parseInt(req.getParameter("id"));
        System.out.println(id);
        List<Iphone> list = new realize_dao().getphonefindID(id);
        req.setAttribute("iphone",list);
        req.getRequestDispatcher("/WEB-INF/jsp/iPhone_update.jsp").forward(req,resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String datetime = req.getParameter("datetime");
        String color = req.getParameter("color");
        int price = Integer.parseInt(req.getParameter("price"));
        int stock = Integer.parseInt(req.getParameter("stock"));
        String firm = req.getParameter("firm");
        Iphone ip = new Iphone(id,name,datetime,color,price,stock,firm);
        System.out.println(id);
        realize_dao dao = new realize_dao();
        dao.getphoneupdate(ip);
        resp.sendRedirect("/jsp/index");
    }
}
