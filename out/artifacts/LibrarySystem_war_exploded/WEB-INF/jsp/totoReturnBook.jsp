<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2020/12/24
  Time: 0:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>归还成功</h1>
<form action="${pageContext.request.contextPath}/user/borrowbook/tototoReturnBook" method="post">
    <input type="hidden" name="bookID" value="${books.bookID}">
    <input type="hidden" name="bookName" value="${books.bookName}">
    <input type="hidden" name="bookCounts" value="${books.bookCounts+1}">
    <input type="hidden" name="detail" value="${books.detail}">
    <input type="submit" value="返回">
</form>
</body>
</html>
