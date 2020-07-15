<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/15
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户存款界面</title>
    <style>
        body{
            margin-top:100px;
            text-align: center;
        }
    </style>
</head>
<body>
    <h2>欢迎<%=request.getAttribute("username")%>用户存款</h2>
    <br><br>
    <form action="/SaveMoneyServlet" method="post" autocomplete="off">
        请输入您的身份证号
        <input name="IDnumber" type="text"><br><br>
        请输入您的存款金额
        <input name="money" type="text"><br><br>
        <input name="修改" type="reset" value="重置信息">
        <input name="提交" type="submit" value="确认提交">
    </form>
</body>
</html>
