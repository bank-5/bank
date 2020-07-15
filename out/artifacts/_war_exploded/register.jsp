<%--
  Created by IntelliJ IDEA.
  User: 25396
  Date: 2020/7/15
  Time: 18:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <title>注册</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>register</title>
    <style>
        *{
            margin: 0px;
            padding: 0px;
        }

        html,
        body{
            width: 100%;
            height: 100%;
            background: url(https://passport.baidu.com/static/passpc-account/img/reg_bg_min.jpg) round ;
        }

        p{
            margin-top: 20px;
        }

        a{
            text-decoration: none;
            color: rgb(109, 138, 236);
            margin-right: 100px;
        }

        .left{
            width: 20%;
            position: fixed;
            top: 30%;
            left: 10%;
        }

        span{
            margin-right: 20px;
        }

        .wrap{
            width: 30%;
            background-color: #e5e5e5;
            position: relative;
            top: 10%;
            left: 60%;
            box-sizing: border-box;
            text-align: left;
            padding: 30px 30px;
            border-radius: 20px;
            min-width: 400px;
        }

        .t{
            width: 300px;
            height: 40px;
            padding-left: 10px;
            margin-top: 20px;
            border: 1px solid #e5e5ee;
            border-radius: 10px;
        }


        .s{
            width: 90%;
            height: 40px;
            font-size: 20px;
            background-color: #7b93f1;
            color: white;
            border: 0px;
            border-radius: 20px;
            margin: 50px 20px;
        }
    </style>
</head>
<body>
    <div class="left">
    <h1 style="color: white; line-height: 100px;">银行系统</h1>
    </div>
    <div class="wrap">
    <h1>欢迎注册</h1>
    <p>已有账号？ <a href="登录.html">登录</a></p>
    <form action="" method="">
        <span>身份证号</span><input class="t" type="text" placeholder="请输入身份证号"  name="IDnumber"><br>
        <span>用户名</span><input class="t" type="text" placeholder="请输入用户名"  name="username"><br>
        <span>密码</span>&nbsp;&nbsp;&nbsp;&nbsp;<input class="t" type="password" placeholder="请设置密码" name="password"><br>
        <span>余额</span><input class="t" type="text" placeholder="请输入余额"  name="money"><br>
        <span>籍贯</span><input class="t" type="text" placeholder="请输入籍贯"  name="address"><br>
        <span>电话</span><input class="t" type="text" placeholder="请输入电话号"  name="phone"><br>
        <input class="s" type="submit" value="注册">
    </form>
</div>
</body>
</html>
