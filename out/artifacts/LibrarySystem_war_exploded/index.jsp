<%@ page import="io.github.shenqqq.pojo.Books" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>登录界面</title>
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <!-- 引入 Bootstrap -->
  <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
  <body>
  <div class="container">
  <h1 style="float: left;margin-left:3%;margin-top:2%">图书管理系统</h1>
  <div style="float: right;margin-right: 3%;margin-top: 2%">
    <a class="btn btn-primary" href="${pageContext.request.contextPath}/user/goLogin">登录</a>
  </div>
  </div>
</body>
</html>
