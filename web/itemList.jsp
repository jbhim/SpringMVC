<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/6/006
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ItemList</title>
</head>
<body>
hello List
<table>
    <c:forEach items="${list}" var="lis">
    <tr>
        <td  width="500px">${lis.ec_content}</td>
        <td  width="300px">${lis.ec_create_time}</td>
        <td  width="400px">${lis.ec_reply}</td>
        <td  width="300px">${lis.ec_nick_name}</td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
