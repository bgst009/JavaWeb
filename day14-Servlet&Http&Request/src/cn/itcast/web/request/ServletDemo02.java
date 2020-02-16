package cn.itcast.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/ServletDemo02")
public class ServletDemo02 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    获取请求头
        Enumeration<String> headerNames = request.getHeaderNames();
        System.out.println(headerNames);
//        遍历
        while (headerNames.hasMoreElements()){
            String element = headerNames.nextElement();
//            根据名称获取请求头的值
            String header = request.getHeader(element);
            System.out.println(header);
        }
    }
}
