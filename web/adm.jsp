?<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/14
  Time: 9:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员登录界面</title>
    <style type="text/css">
        table.altrowstable {
            font-family: verdana,arial,sans-serif;
            font-size:11px;
            color:#333333;
            border-width: 1px;
            border-color: #a9c6c9;
            border-collapse: collapse;
        }
        body{
            background-color:black;
            background-image:
                    radial-gradient(white, rgba(255,255,255,.2) 2px, transparent 40px),
                    radial-gradient(white, rgba(255,255,255,.15) 1px, transparent 30px),
                    radial-gradient(white, rgba(255,255,255,.1) 2px, transparent 40px),
                    radial-gradient(rgba(255,255,255,.4), rgba(255,255,255,.1) 2px, transparent 30px);
            background-size: 550px 550px, 350px 350px, 250px 250px, 150px 150px;
            background-position: 0 0, 40px 60px, 130px 270px, 70px 100px;

        }table.altrowstable th {

             border-width: 1px;    padding: 8px;
             border-style: solid;
             border-color: #a9c6c9;
         }
        table.altrowstable td {
            border-width: 1px;
            padding: 8px;
            border-style: solid;
            border-color: #a9c6c9;
        }

    </style>
</head>

<body>
<%--丁海杨编写--%>

<h1 style="font-family:Arial,Helvetica,sans-serif;
       font-size:1em;
       vertical-align:middle;
       font-weight:normal;
       color:#95F887;
">欢迎管理员<%=session.getAttribute("name")%>登录</h1>
<div style="text-align: center;font-size: 20px">
    <span style="color: white;">用户基本信息界面</span>
</div>
<div id="d1"style="text-align: center;font-size: 15px">
    <a id="a1"style="text-align: center" href="${pageContext.request.contextPath}/admin_AddUser">添加用户</a>
</div>
<table class="altrowstable" id="alternatecolor" align="center">
    <tr>
        <td>序号</td>
        <td>身份证号</td>
        <td>余额</td>
        <td>账号</td>
        <td>密码</td>
        <td>联系方式</td>
        <td>地址</td>
        <td colspan="2">操作</td>
    </tr>
    <c:forEach items="${users}" var="user"  varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${user.IDnumber}</td>
            <td>${user.money}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td>${user.phone}</td>
            <td>${user.address}</td>
            <td><a href="${pageContext.request.contextPath}/admInfo?id=${user.IDnumber}">修改用户信息</a> </td>
            <td><a href="${pageContext.request.contextPath}/userdelete?id=${user.IDnumber}">删除用户信息</a> </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
