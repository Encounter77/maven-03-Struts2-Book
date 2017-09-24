<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<br>
<br>
<center>
    <h1>图书信息</h1>
<table border=1>
    <tr><th>编号</th><th>名称</th><th>类型</th><th>单价</th><th colspan="2">图书信息操作</th></tr>
    <s:iterator value="#books">
        <tr>
            <td><s:property value="isbn"></s:property> </td>
            <td><s:property value="title"></s:property> </td>
            <td><s:property value="type"></s:property> </td>
            <td><s:property value="price"></s:property> </td>
            <td>
                <form action="update.action" method="post">
                    <input type="hidden" value="<s:property value='isbn'/>" name="isbn">
                    <input type="submit" value="修改">
                </form>
            </td>
            <td>
                <form action="delete.action" method="post">
                    <input type="hidden" value="<s:property value='isbn'/>" name="isbn">
                    <input type="submit" value="删除" onclick="return confirm('您确定要删除？')">
                </form>
            </td>
        </tr>
    </s:iterator>
</table>
</center>
</body>
</html>
