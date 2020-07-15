<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/7/15
  Time: 9:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>管理员修改用户信息</title>
    <style type="text/css">
        body{ font-family: "微软雅黑"; background-color: #EDEDED; }
        h2{ text-align: center;font-size:26px; }
        table{ margin: 30px auto; text-align: center; border-collapse:collapse; width:50%; }
        td, th{ padding: 7px;font-size:18px;}
        hr{ margin-bottom:20px; border:1px solid #aaa; }
        input,select,textarea{ width:284px; height:30px; background:#EDEDED; border:1px solid #999; text-indent:5px; font-size:18px; }
        input[type='submit']{ width:130px; height:36px; cursor:pointer; border-radius:5px 5px 5px 5px; background:#ddd; }
        select{text-indent:0px;}
        textarea{height:100px;font-size:22px;}
    </style>
</head>
<body>
    <h2>修改用户信息</h2>
    <hr/>
    <form action="${pageContext.request.contextPath}/admUpdate" method="POST">
        <!-- hidden隐藏域,在提交表单时连door.id一起提交 -->
        <input type="hidden" name="IDnumber" value="${user.IDnumber}"/>
        <table border="1">
            <tr>
                <td width="30%">用户名</td>
                <td>
                    <input type="text" name="username" value="${user.username}"/>
                </td>
            </tr>
            <tr>
                <td>密码</td>
                <td>
                    <input type="password" name="password" value="${user.password}"/>
                </td>
            </tr>
            <tr>
                <td>余额</td>
                <td>
                    <input type="text" name="money" value="${user.money}"/>
                </td>
            </tr>
            <tr>
                <td>籍贯</td>
                <td>
                    <input type="text" name="address" value="${user.address}"/>
                </td>
            </tr>
            <tr>
                <td>电话</td>
                <td>
                    <input type="text" name="phone" value="${user.phone}"/>
                </td>
            </tr>

            <tr>
                <td colspan="2">
                    <input type="submit" value="提	交" />
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
