<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<body>
<div class="container">
<form action="${pageContext.request.contextPath}/user/login" style="margin-top: 2%">
    <h3>登录</h3>
    <label>用户学号：</label><br>
    <input type="text" name="username"> <br>
    <label>
        密码：</label><br>
        <input type="password" name="pwd"> <br>
    <br>
    <input type="submit" value="提交">
    <span style="color:#ff0000; font-weight: bold">${error}</span>
</form>
</div>
</body>
</html>
