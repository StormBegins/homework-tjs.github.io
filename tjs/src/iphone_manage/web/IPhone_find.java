package iphone_manage.web;

import iphone_manage.dao.realize_dao;
import iphone_manage.entity.Iphone;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet(value = "/jsp/find")
public class IPhone_find extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        realize_dao dao = new realize_dao();
        List<Iphone> iphones =dao.getphonefind(name);
        req.setAttribute("iphones",iphones);
        req.getRequestDispatcher("/WEB-INF/jsp/iPhone_list.jsp").forward(req,resp);
    }
}
