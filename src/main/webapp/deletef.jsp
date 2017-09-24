<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<br>
<br>
<body>
    <h2>
        删除图书信息失败,即将返回主页面
    </h2>
    <%
        response.setHeader("refresh","2;url=index.jsp");
    %>
</body>
</html>
