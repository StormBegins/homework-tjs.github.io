package iphone_manage.web;

import iphone_manage.dao.realize_dao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(value = "/jsp/del")
public class IPhone_del extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] ids = req.getParameterValues("id");
        realize_dao dao = new realize_dao();
        int i =0;
        for (String id : ids) {

            dao.getphonedel(Integer.parseInt(id));
            i =i+1;
        }
        req.setAttribute("mag","成功删除");
        resp.sendRedirect("/jsp/index");
    }
}
