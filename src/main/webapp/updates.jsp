<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<br>
<br>
<center>
    <h2>
        修改图书信息成功,即将返回主页面
    </h2>
    <%
        response.setHeader("refresh","2;url=index.jsp");
    %>
</center>
</body>
</html>
