<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/27
  Time: 12:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h3>我要提问</h3>
<a href="/show.do">返回首页</a>

<form action="/insert.do" method="post">
问题：<input type="text" name="title" >
描述：<input type="text" name="detailDesc">
<input type="submit" value="提交"/>
</form>
</body>
</html>
