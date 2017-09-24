<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<br>
<br>
<center>
    <h2>删除图书信息成功,即将返回主界面</h2>
    <%
        response.setHeader("refresh","2;url=index.jsp");
    %>
</center>
</body>
</html>
