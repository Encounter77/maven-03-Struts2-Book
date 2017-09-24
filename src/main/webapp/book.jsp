<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        function test()
        {
            window.location.href="index.jsp";
            return false;
        }
    </script>
</head>
<body>
<br>
<br>
<center>
<table border=1>
    <tr><th>编号</th><th>名称</th><th>类型</th><th>单价</th></tr>
    <s:iterator value="#booklist">
        <tr>
            <td><s:property value="isbn"></s:property> </td>
            <td><s:property value="title"></s:property> </td>
            <td><s:property value="type"></s:property> </td>
            <td><s:property value="price"></s:property> </td>
        </tr>
    </s:iterator>
</table>
    <br>
    <input type="button" onclick="return test()" value="点我返回主页面">
    <!--解决window.location.href不跳转，无反应，不执行的问题
        http://blog.csdn.net/wang_ys121/article/details/52534774-->
</center>
</body>
</html>
