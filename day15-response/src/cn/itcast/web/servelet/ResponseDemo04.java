package cn.itcast.web.servelet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ResponseDemo04")
public class ResponseDemo04 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //set default encoding
        //response.setCharacterEncoding("utf-8");
        //send sever encoding to client
        //response.setHeader("content-type","text/html;charset=utf-8");
        response.setContentType("text/html;charset=utf-8");
        //获取字符输出刘
        PrintWriter writer = response.getWriter();
        //输出数据
        writer.write("<h1>哈hello respose</h1>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
