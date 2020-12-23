<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生列表</title>
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
                    <small>学生列表</small>
                </h1>
            </div>

            <div class="row">
                <div class="col-lg-4 col-md-4 col-xs-4" style="float: left">
                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/user/student/toAddStudent">新增</a>
                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/user/student/listStudent">显示全部学生</a>
                </div>
                <div class="col-lg-6 col-md-6 col-xs-6" style="float: right;display: inline-block">
                    <form action="${pageContext.request.contextPath}/user/student/queryStudent" method="post"  >
                        <span style="color:#ff0000; font-weight: bold">${error}</span>
                        <input type="submit" value="查询" class="btn btn-primary" style="float: right">
                        <input type="text" name="queryStudentName" class="form-control" placeholder="请输入要查询的学生姓名" style="width:80%;float: right">

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
                    <th>学生编号</th>
                    <th>学生名字</th>
                    <th>学生年龄</th>
                    <th>操作</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="students" items="${list}">
                    <tr>
                        <td>${students.studentID}</td>
                        <td>${students.studentName}</td>
                        <td>${students.age}</td>
                        <td><a href="${pageContext.request.contextPath}/user/student/toUpdateStudent?studentID=${students.studentID}">修改</a>
                            &nbsp;|&nbsp;
                            <a href="${pageContext.request.contextPath}/user/student/deleteStudent/${students.studentID}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>