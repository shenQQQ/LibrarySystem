<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍详情</title>
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
                    <small>书籍详情</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/user/borrowbook/updateBorrowBook" method="post">
        <input type="hidden" name="bookID" value="${books.bookID}">
        <input type="hidden" name="bookName" value="${books.bookName}">
        <input type="hidden" name="bookCounts" value="${books.bookCounts-1}">
        <input type="hidden" name="detail" value="${books.detail}">
        书籍名称：${books.bookName}
        书籍数量：${books.bookCounts}
        书籍详情：${books.detail}
        <input type="submit" value="借阅">
    </form>

</div>