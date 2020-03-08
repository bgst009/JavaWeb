<%--
  Created by IntelliJ IDEA.
  User: shenxin
  Date: 2020/3/8
  Time: 下午4:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <a href="home.jsp">home</a></br>
  <hr>
  <%
    System.out.println("hello jsp");
    int i = 5;

    String contextPath = request.getContextPath();
    out.print(contextPath);
  %>

  <%!
    int i = 3;
  %>
  <%= "hello" %>


  System.out.println("hello jsp");
  <h1>hi~ jsp!</h1>

  <% response.getWriter().write("response....."); %>
  </body>
</html>
