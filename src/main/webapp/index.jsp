<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>My JSP 'index.jsp' starting page</title>
</head>
<body>
<br>
<br>
<hr>
<center>
<h1>按类别查询图书</h1>
<form action="typequery.action" method="post">
    书籍类别：<input type="text" name="type"> <!-- 参数名和action中属性名一样 -->
    <input type=submit name="subm" value="查询">
</form>
<br>
<br>
<h1>添加图书信息</h1>
<form action="insert.action" method="post">
    书籍编号：<input type="text" name="isbn"><br>
    书籍名称：<input type="text" name="title"><br>
    书籍类型：<input type="text" name="type"><br>
    书籍价格：<input type="text" name="price"><br>
    <input type="submit" value="插入">
</form>
<br>
<br>
<h1>查看图书信息</h1>
<form action="query.action" method="post">
    <input type="submit" value="点击查看图书信息">
</form>
</center>
</body>
</html>
