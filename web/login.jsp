<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/11
  Time: 17:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>首页</title>
  <style>
    body{
      margin: 0 auto;
      text-align: center;
    }
  </style>
</head>
<body>
<h1>首页</h1>
<hr>
<a href="${pageContext.request.contextPath}/register.jsp">注册</a>
<form action="/UserServlet" method="post" autocomplete="off">
  请输入您的姓名
  <input name="username" type="text"><br><br>
  <input name="提交" type="submit" value="确认提交">
</form>
</body>
</html>
