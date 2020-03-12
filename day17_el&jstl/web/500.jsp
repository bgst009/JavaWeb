<%--
  Created by IntelliJ IDEA.
  User: shenxin
  Date: 2020/3/12
  Time: 上午11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>

<html>
<head>
    <title>500</title>
</head>
<body>
<h1>服务器正忙...</h1>
<%--isErrorPage="true"--%>
<%
    String message = exception.getMessage();
    out.print(message);

%>
</body>
</html>
