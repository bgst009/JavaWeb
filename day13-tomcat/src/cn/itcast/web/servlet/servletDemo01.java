package cn.itcast.web.servlet;

import javax.servlet.*;
import java.io.IOException;

public class servletDemo01  implements Servlet {
//    初始化方法
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("hello servlet!!!!!");
    }

    @Override
    public String getServletInfo() {
        return null;
    }
//销毁方法
    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
