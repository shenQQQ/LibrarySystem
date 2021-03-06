<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>书籍列表</title>
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
                    <small>书籍列表</small>
                </h1>
            </div>

            <div class="row">
                <div class="col-lg-4 col-md-4 col-xs-4" style="float: left">
                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/user/book/toAddBook">新增</a>
                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/user/book/listBook">显示全部书籍</a>
                </div>
                <div class="col-lg-6 col-md-6 col-xs-6" style="float: right;display: inline-block">
                    <form action="${pageContext.request.contextPath}/user/book/queryBook" method="post"  >
                        <span style="color:#ff0000; font-weight: bold">${error}</span>
                        <input type="submit" value="查询" class="btn btn-primary" style="float: right">
                        <input type="text" name="queryBookName" class="form-control" placeholder="请输入要查询的数据名称" style="width:80%;float: right">

                    </form>
                </div>
            </div>

        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>书籍编号</th>
                    <th>书籍名字</th>
                    <th>书籍数量</th>
                    <th>书籍详情</th>
                    <th>操作</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="books" items="${list}">
                    <tr>
                        <td>${books.bookID}</td>
                        <td>${books.bookName}</td>
                        <td>${books.bookCounts}</td>
                        <td>${books.detail}</td>
                        <td><a href="${pageContext.request.contextPath}/user/book/toUpdateBook?id=${books.bookID}">修改</a>
                            &nbsp;|&nbsp;
                            <a href="${pageContext.request.contextPath}/user/book/deleteBook/${books.bookID}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>