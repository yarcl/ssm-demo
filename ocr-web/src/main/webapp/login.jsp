<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/10/16
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="${pageContext.request.contextPath}/user/login.do" method="post">
        用户名：<input type="text" name="userName" />
        密码：<input type="password" name="userPwd" />
        <input type="submit" value="登录"/>
    </form>
</body>
</html>
