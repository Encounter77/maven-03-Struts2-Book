<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<br>
<br>
<center>
    <h2>图书信息</h2>
    <form action="update_r.action" method="post">
        <s:iterator value="#update_book_list">
            图书编号：<input type="text" value="<s:property value="isbn"/>" name="isbn" readonly="readonly"><br>
            图书名称：<input type="text" value="<s:property value="title"/>" name="title"><br>
            图书类型：<input type="text" value="<s:property value="type"/>" name="type"><br>
            图书价格：<input type="text" value="<s:property value="price"/>" name="price"><br>
            <input type="submit" value="提交修改">
        </s:iterator>
    </form>
</center>
</body>
</html>
