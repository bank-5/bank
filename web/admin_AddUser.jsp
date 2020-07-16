<%--
  Created by IntelliJ IDEA.
  User: 12518
  Date: 2020/7/15
  Time: 17:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>管理员新增用户</h2>
<hr/>
<form action="admAdd" method="POST">
    <table border="1">

        <tr>
            <td width="30%"></td>
            <td>
                <input type="text" name="IDnumber"/>
            </td>
        </tr>
        <tr>
            <td>余额</td>
            <td>
                <input type="text" name="money"/>
            </td>
        </tr>
        <tr>
            <td>用户姓名</td>
            <td>
                <input type="text" name="username"/>
            </td>
        </tr>
        <tr>
            <td>用户密码</td>
            <td>
                <input type="text" name="password"/>
            </td>
        </tr>
        <tr>
            <td>手机号</td>
            <td>
                <input type="text" name="phone"/>
            </td>
        </tr>
        <tr>
            <td>地址</td>
            <td>
                <input type="text" name="address"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="提 	交"/>
            </td>
        </tr>
    </table>

</body>
</html>
