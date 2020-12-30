<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>记录详情</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>记录详情</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/user/borrowbook/toupdateReturnBook?id=${booklogs.bookID}" method="post">

        书籍名称：${booklogs.bookID}
        书籍数量：${booklogs.studentID}
        <input type="submit" value="归还">
    </form>

</div>