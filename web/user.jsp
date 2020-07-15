<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/14
  Time: 9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>用户欢迎界面</title>
    <style>
        body{
            margin-top:100px;
            text-align: center;
        }
        #table{
            margin: 0 auto;
            text-align: center;
        }
    </style>
</head>
<body>
    <h1>欢迎<%=request.getAttribute("username")%>(先生/女士)登陆</h1>
    <h2>您的基本信息如下</h2>
    <table border="1" id="table">
        <tr>
            <td>ID</td>
            <td>用户名</td>
            <td>用户密码</td>
            <td>用户存款</td>
            <td>身份证号</td>
            <td>用户电话</td>
            <td>用户籍贯</td>
            <td colspan="5">请选择您要办理的业务</td>
        </tr>

        <c:forEach items="${list}" var="user" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td>${user.money}</td>
            <td>${user.IDnumber}</td>
            <td>${user.phone}</td>
            <td>${user.address}</td>
            <td><a href="saveMoney.jsp?username=${user.username}">存款</a></td>
            <td><a href="takeMoney.jsp?username=${user.username}">取款</a></td>
            <td><a href="UserServlet">修改信息</a></td>
            <td><a href="${pageContext.request.contextPath}/UserDeleteServlet?username=${user.username}">注销用户</a></td>
            <td><a href="login.jsp">退出登陆</a></td>
        </tr>
    </c:forEach>
    </table>

</body>
</html>
