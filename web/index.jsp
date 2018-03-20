<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/6/006
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Comm</title>
  </head>
  <body>
  <%--<form action="/item/sendComment.action" method="post">
    内容：<input type="text" name="ec_content">
    昵称<input type="text" name="ec_nick_name">
    <input type="submit" value="提交">
    <input type="reset" value="重置">
  </form>--%>
    <br>
    <form action="/item/up.action" method="post" enctype="multipart/form-data">
      <img src="/image/${image}" width="200" height="300">
      <input type="file" name="file">
      <input type="submit" value="提交">
      <input type="reset" value="重置">
    </form>

  </body>
</html>
