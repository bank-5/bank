<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/7/14
  Time: 9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户欢迎界面</title>
</head>
<body>
<table border="1">
    <tr>
        <th class="width-40">序号</th>
        <th>门店名称</th>
        <th class="width-80">联系电话</th>
        <th>门店地址</th>
        <th class="width-80">操 作</th>
    </tr>

    <c:forEach items="${list}" var="door" varStatus="status">
        <tr>
            <td>${status.count}</td>
            <td>${door.name}</td>
            <td>${door.tel}</td>
            <td>${door.addr}</td>
            <td>
                <a href="${pageContext.request.contextPath}/doorDelete?id=${door.id}">删除</a>
                &nbsp;|&nbsp;
                <a href="${pageContext.request.contextPath}/doorInfo?id=${door.id}">修改</a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
