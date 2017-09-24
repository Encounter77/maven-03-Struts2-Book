<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<head>

</head>
<body>
<br>
<br>
<center>
    <h1>图书信息插入失败,即将返回主页面</h1>
    <%
        response.setHeader("refresh","2;url=index.jsp");
    %>
</center>
</body>
</html>
