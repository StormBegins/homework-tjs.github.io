package iphone_manage.web;

import com.google.gson.Gson;
import iphone_manage.dao.realize_dao;
import iphone_manage.entity.Iphone;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.util.List;

public class IPhone_list extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        realize_dao dao = new realize_dao();
        List<Iphone> iphones = dao.getphonelist();
        req.setAttribute("iphones",iphones);
        System.out.println();
        req.getRequestDispatcher("/WEB-INF/jsp/iPhone_list.jsp").forward(req,resp);
    }
}
