<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户界面</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <% String name = (String) session.getAttribute("user");%>
    <div class="page-header">
        <h1>
            <small>你好,<%=name%></small>
            <div class="row" style="float:right;margin-right: 3%;">
                <a href="${pageContext.request.contextPath}/user/goOut"  class="btn btn-primary">
                    注销
                </a>
            </div>
        </h1>
    </div>

    <div class="row">
        <div class="col-md-4 column">
    <a href="${pageContext.request.contextPath}/user/borrowbook/borrowBook" class="btn btn-primary">
    查看书籍目录
    </a>
        </div>
        <div class="col-md-4 column">
            <a href="${pageContext.request.contextPath}/user/borrowbook/returnBook" class="btn btn-primary">
                查看借阅记录
            </a>
        </div>

    </div>
</div>
</body>
</html>
