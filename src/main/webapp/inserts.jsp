<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<body>
<br>
<br>
<center>
<h2>图书信息插入成功,即将返回主页面</h2>
    <%
        response.setHeader("refresh","2;url=index.jsp");
    %>
</center>
</body>
</html>
