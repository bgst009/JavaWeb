<%--
  Created by IntelliJ IDEA.
  User: shenxin
  Date: 2020/3/12
  Time: 上午11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="top.jsp"%>
<html>
<head>
    <title>homePage</title>
</head>
<body>
<%--注释--%>
<%--html注释--%>
<!--
    <h1>hello</h1>
-->
<%--jsp注释--%>
<%--
    <%
        System.out.println("hi~~~~");
    %>
--%>
<%--

    <input>
--%>

<%--直接使用的对象--%>
<%

    pageContext.setAttribute("msg","hello");

%>


<%=pageContext.getAttribute("msg")%>

</body>
</html>
