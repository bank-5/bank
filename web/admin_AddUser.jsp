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
    <style type="text/css">
        body{ font-family: "微软雅黑"; background:url("http://img.netbian.com/file/2018/0606/ecbe260f7ffa96e8a531cb1aea4a4acd.jpg") }
        h2{ text-align: center;font-size:26px; }
        table{ margin: 30px auto; text-align: center; border-collapse:collapse; width:50%; }
        td, th{ text-align:center;padding: 7px;font-size:18px;}
        hr{ margin-bottom:20px; border:1px solid #aaa; }
        input,select,textarea{ width:284px; height:30px; background:#EDEDED; border:1px solid #999; text-indent:5px; font-size:18px; }
        input[type='submit']{ width:130px; height:36px; cursor:pointer; border-radius:5px 5px 5px 5px; background:#ddd; }
        select{text-indent:0px;}
        textarea{height:100px;font-size:22px;}
    </style>
</head>
<body>
<h2>管理员新增用户</h2>
<hr/>
<form action="admAdd" method="POST">
    <table >

        <tr>
            <td>用户名</td>
            <td>
                <input type="text" name="username"/>
            </td>
        </tr>
        <tr>
            <td>密码</td>
            <td>
                <input type="text" name="password"/>
            </td>
        </tr>
        <tr>
            <td width="30%">身份证号</td>
            <td>
                <input type="text" name="IDnumber"/>
            </td>
        </tr>
        <tr>
            <td>手机号</td>
            <td>
                <input type="text" name="phone"/>
            </td>
        </tr>
        <tr>
            <td>家庭住址</td>
            <td>
                <input type="text" name="address"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="注册"/>
            </td>
        </tr>
    </table>

</body>
</html>
