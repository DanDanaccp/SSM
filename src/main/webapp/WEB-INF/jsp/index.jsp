
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        h4{
            align-content: center;
        }
        a{
            align-content: center;
        }
    </style>
</head>
<body>

<h4>在线问答</h4>
<a href="/add.do">我要提问</a>


<table width="100%">
    <thead>
        <tr>
            <td>序号</td>
            <td>问题</td>
            <td>回答次数</td>
            <td>最后修改</td>
        </tr>
    </thead>
    <tbody>
    <c:forEach items="${querstions}" var="q">
    <tr>

        <td >${q.id}</td>
        <td><a href="/queryById.do?id=${q.id}">${q.title}</a></td>
        <td>${q.answerCount}</td>
        <td>${q.lastModified}</td>
    </tr>
    </c:forEach>
    </tbody>
</table>



</body>
</html>
