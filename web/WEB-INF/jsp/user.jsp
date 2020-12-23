<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>用户界面</title>
</head>
<body>
<% String name = (String) session.getAttribute("user");%>
<span>你好,<%=name%></span>
<a href="${pageContext.request.contextPath}/user/goOut">
    注销
</a>
</body>
</html>
