<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改学生信息</title>
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
                    <small>修改学生信息</small>
                </h1>
            </div>
        </div>
    </div>
    <form action="${pageContext.request.contextPath}/user/student/updateStudent" method="post">
        学生学号：<input type="text" name="studentID" value="${students.studentID}" required><br><br><br>
        学生姓名：<input type="text" name="studentName" value="${students.studentName}" required><br><br><br>
        学生年龄：<input type="text" name="age" value="${students.age}" required><br><br><br>
        <input type="submit" value="修改">
    </form>

</div>