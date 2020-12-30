<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>借阅记录列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <% String name = (String) session.getAttribute("user");%>
                <h1>
                    <small><%=name%>的借阅记录</small>
                </h1>
            </div>

        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>书籍编号</th>
                    <th>学生编号</th>
                    <th>操作</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="booklog" items="${list}">
                    <tr>
                        <td>${booklog.bookID}</td>
                        <td>${booklog.studentID}</td>
                        <td><a href="${pageContext.request.contextPath}/user/borrowbook/toUpdateBookLog?id=${booklog.bookID}">详情</a>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>
