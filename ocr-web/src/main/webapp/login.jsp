<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/15
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="${pageContext.request.contextPath}/500.html" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Web JS 无码配置后台页面</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css" type="text/css">
</head>
<body>
    <div class="login">
        <div class="backimg">
            <div class="logo">
                <div class="logo-img">
                    <img src="${pageContext.request.contextPath}/img/global.logo" width="40" height="40">
                </div>
                <div class="logo-title">
                    <strong>登录系统后台</strong>
                </div>
            </div>
            <div class="login-form">
                <form action="${pageContext.request.contextPath}/login/login.do" method="post" class="login-form-container">
                    <div class="form-input">
                        <ul class="input-content">
                            <li class="in"><span>用&nbsp;&nbsp;&nbsp;户:</span><input type="text" name="loginName" placeholder="请输入用户名"></li>
                            <li class="in"><span>密&nbsp;&nbsp;&nbsp;码:</span><input type="password" name="loginPwd" placeholder="请求输入密码"></li>
                            <li class="form-sub"><input type="submit" value=""></li>
                        </ul>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <script type="text/javascript">
        var state = '${state}';
        if(state === '0') {
            alert("该用户已被禁用，请联系管理员！");
        } else if(state === 'error'){
            alert("用户名密码错误，请重新输入！");
        }
    </script>
</body>
</html>
