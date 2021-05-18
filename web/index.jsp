<%--
  Created by IntelliJ IDEA.
  User: 13374
  Date: 2021/4/14
  Time: 7:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>登录页面</title>
  </head>
  <body>


  <form action="${pageContext.request.contextPath}/index/login">
    用户名：<input type="text" name="username"/>
    密码：<input type="password" name="password">
    <input type="submit" value="提交"></input>
  </form>

  <a href="${pageContext.request.contextPath}/index/register">注册</a>

  </body>
</html>
