<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员界面</title>
</head>
<body>
<h1>你好，管理员</h1>
<% String name = (String) session.getAttribute("user");%>
<span>你好,<%=name%></span>
<a href="${pageContext.request.contextPath}/user/goOut">
    注销
</a>

<h1>
    <a href="${pageContext.request.contextPath}/user/book/listBook">
        进入书籍界面
    </a>
    <br>
    <a href="${pageContext.request.contextPath}/user/student/listStudent">
        进入学生界面
    </a>
</h1>
</body>
</html>
