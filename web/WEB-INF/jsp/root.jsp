<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员界面</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="page-header">
        <h1>
            <small>你好,管理员</small>
            <div class="row" style="float:right;margin-right: 3%;">
                <a href="${pageContext.request.contextPath}/user/goOut"  class="btn btn-primary">
                    注销
                </a>
            </div>
        </h1>

    </div>

<div class="row" style="margin:5%">
    <div class="col-md-4 column">
    <a href="${pageContext.request.contextPath}/user/book/listBook" class="btn btn-primary" style="margin: 2%;width:20vm;height:17vm">
        进入书籍界面
    </a>
    </div>
    <div class="col-md-4 column">
    <a href="${pageContext.request.contextPath}/user/student/listStudent"  class="btn btn-primary" style="margin: 2%;width:20vm;height:17vm">
        进入学生界面
    </a>
    </div>
    <div class="col-md-4 column">
    <a href="${pageContext.request.contextPath}/user/booklog/listBookLog"  class="btn btn-primary" style="margin: 2%;width:20vm;height:17vm">
        进入借阅记录界面
    </a>
    </div>
</div>
</div>
</body>
</html>
