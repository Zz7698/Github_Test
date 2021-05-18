<%--
  Created by IntelliJ IDEA.
  User: 13374
  Date: 2021/4/17
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
这里是注册页面
<form action="${pageContext.request.contextPath}/index/registerHandle">
    <label>用户名：</label>
    <input type="text" name="username" placeholder="请输入用户名">
    <label>密码：</label>
    <input type="password" name="password" placeholder="请输入密码">
    <input type="submit" 提交>
</form>
</body>
</html>
